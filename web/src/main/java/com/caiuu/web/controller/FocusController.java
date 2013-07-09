package com.caiuu.web.controller;

import com.caiuu.core.entity.Focus;
import com.caiuu.core.service.FocusService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/9/13
 * Time: 15:21
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class FocusController {

    @Autowired
    private FocusService focusService;

    @RequestMapping(value = "/focus/view", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("/admin/focus-view");
    }

    @RequestMapping(value = "/focus/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Focus> focuses = focusService.findAll();
        return new ModelAndView("/admin/focus-list", "focuses", focuses);
    }

    @RequestMapping(value = "/focus/upload", method = RequestMethod.POST)
    public ModelAndView upload(HttpServletRequest request) {

        // Check that we have a file upload request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        // Create a factory for disk-based file items
        FileItemFactory factory = new DiskFileItemFactory();

// Configure a repository (to ensure a secure temp location is used)
        File repository = new File("/User/lianghongbin/Pictures");
        factory.setRepository(repository);
        factory.

// Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);

// Parse the request
        List<FileItem> items = upload.parseRequest(request);
    }
}
