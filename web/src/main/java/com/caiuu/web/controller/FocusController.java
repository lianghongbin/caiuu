package com.caiuu.web.controller;

import com.caiuu.core.entity.Focus;
import com.caiuu.core.service.FocusService;
import com.caiuu.photo.PhotoUtil;
import com.caiuu.photo.Size;
import com.caiuu.web.util.PhotoConfig;
import com.caiuu.web.util.UploadUtils;
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
import java.util.List;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 7/9/13
 * Time: 15:21
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/focus")
public class FocusController {

    @Autowired
    private FocusService focusService;
    @Autowired
    private PhotoConfig photoConfig;
    private final static Logger logger = LoggerFactory.getLogger(FocusController.class);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Focus> focuses = focusService.findAll();
        return new ModelAndView("admin/focus-list", "focuses", focuses);
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("admin/focus-view");
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        Focus focus = focusService.find(id);
        return new ModelAndView("admin/focus-edit", "focus", focus);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Focus focus) {
        Focus org = focusService.find(focus.getId());
        focus.setBigPhoto(org.getBigPhoto());
        focus.setSmallPhoto(org.getSmallPhoto());
        focusService.save(focus);

        return "success";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        focusService.deleteById(id);

        return "success";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(Focus focus, HttpServletRequest request) {

        MultipartHttpServletRequest re = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> map = re.getFileMap();

        String saveName;
        Size size;
        String bigSaveName = null;
        String smallSaveName = null;


        for (MultipartFile file : map.values()) {

            String photoName = UploadUtils.generateName(); //上传源文件名称
            String dir = UploadUtils.generateDir();
            if (file.getName().equals("big")) {
                saveName = dir + File.separator + "670-260_" + photoName + ".jpg";
                bigSaveName = saveName;
                size = new Size(670, 260);
            } else {
                saveName = dir + File.separator + "300-225_" + photoName + ".jpg";
                smallSaveName = saveName;
                size = new Size(330, 225);
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

        focus.setBigPhoto(bigSaveName);
        focus.setSmallPhoto(smallSaveName);
        focusService.save(focus);

        return "success";
    }
}
