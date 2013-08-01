package com.caiuu.web.controller;

import com.caiuu.core.entity.Cookbook;
import com.caiuu.core.entity.Detail;
import com.caiuu.core.service.CookbookService;
import com.caiuu.core.service.DetailService;
import com.caiuu.core.service.TemporaryService;
import com.caiuu.photo.PhotoUtil;
import com.caiuu.photo.Size;
import com.caiuu.web.util.Page;
import com.caiuu.web.util.PhotoConfig;
import com.caiuu.web.util.RowBoundsUtil;
import com.caiuu.web.util.UploadUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
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
 * Time: 下午10:52
 * Description:
 */
@Controller
@RequestMapping(value = "/cookbook")
public class CookbookController {

    private static final Logger logger = LoggerFactory.getLogger(CookbookController.class);
    @Autowired
    private CookbookService cookbookService;
    @Autowired
    private DetailService detailService;
    @Autowired
    private TemporaryService temporaryService;
    @Autowired
    private PhotoConfig photoConfig;

    @RequestMapping(value = "/list/{num}", method = RequestMethod.GET)
    public ModelAndView list(@PathVariable int num) {
        int currentPage = num < 1 ? 1 : num;
        Page page = new Page();
        page.setPageSize(40);
        page.setCurrentPage(currentPage);
        page.setTotalRows(cookbookService.findCount());
        page.setUrl("./{0}");

        RowBounds rowBounds = RowBoundsUtil.generate(page);
        List<Cookbook> cookbooks = cookbookService.findAll(rowBounds);

        ModelAndView modelAndView = new ModelAndView("cookbook-list");
        modelAndView.addObject("cookbooks", cookbooks);
        modelAndView.addObject("page", page);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Cookbook cookbook, String info, int temporaryId) {
        int cookbookId = cookbookService.save(cookbook);
        Detail detail = new Detail();
        detail.setCookbookId(cookbookId);
        detail.setInfo(info);
        detailService.save(detail);
        temporaryService.delete(temporaryId);

        return "success";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Cookbook cookbook, String info, HttpServletRequest request) {
        MultipartHttpServletRequest re = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = re.getMultiFileMap().get("file");


        String saveName = "";
        if (files != null){
            MultipartFile file = files.get(0);
            Size size = new Size(160, 120);
            String photoName = UploadUtils.generateName(); //上传源文件名称
            String dir = UploadUtils.generateDir();
            saveName = StringUtils.replace(dir + File.separator + photoName + "_" + size.getWidth() + "x" + size.getHeight() + ".jpg", "\\", "/");

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
            cookbook.setHeadPic(saveName);
        }

        Map<String, String> map = new HashMap<String, String>(1);
        map.put("cookbookId", Integer.toString(cookbook.getId()));
        map.put("info", info);
        detailService.updateContent(map);
        cookbookService.update(cookbook);

        return saveName;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        cookbookService.delete(id);

        return "success";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        Cookbook cookbook = cookbookService.find(id);
        Detail detail = detailService.find(id);
        ModelAndView modelAndView = new ModelAndView("cookbook-edit");
        modelAndView.addObject("cookbook", cookbook);
        modelAndView.addObject("detail", detail);

        return modelAndView;
    }
}
