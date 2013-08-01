package com.meishihome.web.controller;

import com.meishihome.core.entity.Topic;
import com.meishihome.core.service.TopicService;
import com.meishihome.photo.PhotoUtil;
import com.meishihome.photo.Size;
import com.meishihome.web.util.PhotoConfig;
import com.meishihome.web.util.UploadUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午3:25
 * Description:
 */
@Controller
@RequestMapping(value = "/topic")
public class TopicController {

    private final static Logger logger = LoggerFactory.getLogger(TopicController.class);
    @Autowired
    private TopicService topicService;
    @Autowired
    private PhotoConfig photoConfig;

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public ModelAndView input() {
        return new ModelAndView("topic-input");
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Topic> topics = topicService.findAll();
        return new ModelAndView("topic-list", "topics", topics);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Topic topic, HttpServletRequest request) {
        MultipartHttpServletRequest re = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> map = re.getFileMap();

        String saveName;
        Size size;
        String bigSaveName = null;
        String smallSaveName = null;

        for (MultipartFile file : map.values()) {

            String photoName = UploadUtils.generateName(); //上传源文件名称
            String dir = UploadUtils.generateDir();
            if (file.getName().equals("adPhoto")) {
                saveName = dir + File.separator+ photoName + "_990x200"  + ".jpg";
                bigSaveName = StringUtils.replace(saveName, "\\", "/");
                size = new Size(990, 200);
            } else {
                saveName = dir + File.separator+ photoName + "_160x120"  + ".jpg";
                smallSaveName = StringUtils.replace(saveName, "\\", "/");
                size = new Size(160, 120);
            }

            File uploadDir = new File(photoConfig.getUploadRoot() + File.separator + dir);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            String thumbnail = photoConfig.getUploadRoot() + File.separator + saveName;
            String target = new File(uploadDir, photoName + ".jpg").getAbsolutePath();     //上传源文件完整路径

            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(target);
                FileCopyUtils.copy(file.getBytes(), outputStream);//上传代码
                outputStream.close();
            } catch (IOException e) {
                logger.error("图片上传失败！", e);
                try {
                    assert outputStream != null;
                    outputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                return "error";
            }

            PhotoUtil.thumbnail(target, thumbnail, photoConfig.getWatermark(), size);
        }

        topic.setAdPic(bigSaveName);
        topic.setHeadPic(smallSaveName);
        topicService.save(topic);

        return "success";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        Topic topic = topicService.find(id);
        return new ModelAndView("topic-edit", "topic", topic);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Topic topic) {
        topicService.update(topic);
        return "success";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        topicService.delete(id);
        return "success";
    }

    @RequestMapping(value = "/epic/{id}", method = RequestMethod.GET)
     public ModelAndView epic(@PathVariable int id){
        Topic topic = topicService.find(id);
        ModelAndView modelAndView = new ModelAndView("topic-epic");
        modelAndView.addObject("id", id);
        modelAndView.addObject("title", topic.getTitle());
        modelAndView.addObject("adPic", topic.getAdPic());
        modelAndView.addObject("headPic", topic.getHeadPic());

        return modelAndView;
    }

    @RequestMapping(value = "/upic", method = RequestMethod.POST)
    @ResponseBody
    public String upic(String id, HttpServletRequest request){
        MultipartHttpServletRequest re = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> map = re.getFileMap();
        Map<String,String> updateMap = new HashMap<String, String>();
        String saveName;
        Size size;
        String bigSaveName;
        String smallSaveName;

        for (MultipartFile file : map.values()) {

            String photoName = UploadUtils.generateName(); //上传源文件名称
            String dir = UploadUtils.generateDir();
            if (file.getName().equals("adPic")) {
                saveName = dir + File.separator + "990-200_" + photoName + ".jpg";
                bigSaveName = StringUtils.replace(saveName, "\\", "/");
                updateMap.put("adPic", bigSaveName);
                size = new Size(990, 200);
            } else {
                saveName = dir + File.separator + "160-120_" + photoName + ".jpg";
                smallSaveName = StringUtils.replace(saveName, "\\", "/");
                updateMap.put("headPic", smallSaveName);
                size = new Size(160, 120);
            }

            File uploadDir = new File(photoConfig.getUploadRoot() + File.separator + dir);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            String thumbnail = photoConfig.getUploadRoot() + File.separator + saveName;
            String target = new File(uploadDir, photoName + ".jpg").getAbsolutePath();     //上传源文件完整路径

            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(target);
                FileCopyUtils.copy(file.getBytes(), outputStream);//上传代码
                outputStream.close();
            } catch (IOException e) {
                logger.error("图片上传失败！", e);
                try {
                    assert outputStream != null;
                    outputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                return "error";
            }

            PhotoUtil.thumbnail(target, thumbnail, photoConfig.getWatermark(), size);
        }

        updateMap.put("id", id);
        topicService.updatePicture(updateMap);
        return "success";
    }
}
