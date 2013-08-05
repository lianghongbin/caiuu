package com.meishihome.edit.controller;

import com.meishihome.photo.*;
import com.meishihome.photo.thumbnailator.ThumbnailatExecutorFactory;
import com.meishihome.edit.util.PhotoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-15
 * Time: 下午10:45
 * Description:
 */
@Controller
@RequestMapping(value = "/photo")
public class PhotoController {

    @Autowired
    private PhotoConfig photoConfig;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("photo-view");
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ModelAndView upload(HttpServletRequest request, HttpServletResponse response) {
        MultipartHttpServletRequest re = (MultipartHttpServletRequest) request;

        Map<String, MultipartFile> map = re.getFileMap();

        List fileList = new ArrayList();

        int i = 0;
        for (MultipartFile file : map.values()) {
            i++;
            File dir = new File(photoConfig.getUploadRoot());
            if (!dir.exists()) {
                dir.mkdirs();
            }

            String tmp = file.getOriginalFilename();

            System.out.println(tmp);

            String targetFile = photoConfig.getUploadRoot() + File.separator + i + ".jpg";

            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(targetFile);
                FileCopyUtils.copy(file.getBytes(), outputStream);//上传代码
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    outputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            String scaleFile = photoConfig.getUploadRoot() +File.separator + "thumb_800*900_abcd.jpg";

            DefaultProcessorImpl processor = new DefaultProcessorImpl();
            Operation operation = new Operation();
            operation.setFile(targetFile);
            operation.setTarget(scaleFile);
            Watermark watermark = new Watermark();
            watermark.setType(WatermarkType.ICON);
            watermark.setResource(photoConfig.getWatermark());
            List<Watermark> watermarks = new ArrayList<Watermark>();
            watermarks.add(watermark);

            Size size = new Size(800, 900);
            operation.setSize(size);
            operation.setWatermarks(watermarks);



            processor.setExecutorFactory(new ThumbnailatExecutorFactory());
            processor.process(operation);

            fileList.add(file);
        }

        return null;
    }
}
