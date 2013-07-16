package com.caiuu.web.controller;

import com.caiuu.core.entity.Focus;
import com.caiuu.core.entity.Image;
import com.caiuu.core.service.FocusService;
import com.caiuu.core.service.ImageService;
import com.caiuu.photo.*;
import com.caiuu.photo.thumbnailator.ThumbnailatExecutorFactory;
import com.caiuu.web.util.PhotoConfig;
import com.caiuu.web.util.UploadUtils;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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

    @RequestMapping(value = "/view")
    public ModelAndView view() {
        return new ModelAndView("admin/focus-view");
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Focus> focuses = focusService.findAll();
        return new ModelAndView("admin/focus-list", "focuses", focuses);
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

        String thumbnail;
        String target;
        String photoName;
        String saveName;
        Size size;
        File uploadDir;
        String targetDir;

        for (MultipartFile file : map.values()) {

            if (file.getName().equals("big")) {
                photoName = UploadUtils.generateName();
                saveName = photoName + File.separator + "670-260_" + photoName + ".jpg";
                size = new Size(670, 260);

                targetDir = photoConfig.getUploadRoot() + File.separator + UploadUtils.generateDir();
                uploadDir = new File(targetDir);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }
            } else {
                photoName = UploadUtils.generateName();
                saveName = photoName + File.separator + "300-225_" + photoName + ".jpg";
                size = new Size(330, 225);

                targetDir = photoConfig.getUploadRoot() + File.separator + UploadUtils.generateDir();
                uploadDir = new File(targetDir);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }
            }

            thumbnail = photoConfig.getUploadRoot() + File.separator + saveName;
            target = targetDir + File.separator + photoName+".jpg";

            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(target);
                FileCopyUtils.copy(file.getBytes(), outputStream);//上传代码
                outputStream.close();
            } catch (IOException e) {
                logger.error("图片上传失败！", e);
                try {
                    outputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                return "error";
            }

            PhotoUtil.thumbnail(target, thumbnail, photoConfig.getWatermark(), size);
        }

        return "success";
    }
}
