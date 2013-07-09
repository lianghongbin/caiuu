package com.caiuu.web.controller;

import com.caiuu.core.entity.Focus;
import com.caiuu.core.entity.Image;
import com.caiuu.core.service.FocusService;
import com.caiuu.core.service.ImageService;
import com.caiuu.web.util.UploadUtils;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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

    @RequestMapping(value = "/focus/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id) {
        focusService.deleteById(id);

        return null;
    }

    @RequestMapping(value = "/focus/save", method = RequestMethod.POST)
    public ModelAndView save(Focus focus, String title, HttpServletRequest request) {

        // Check that we have a file upload request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);

        if (!isMultipart) {
            return new ModelAndView("redirect:/focus/error");
        }
System.out.println(title);
        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload();
        List<String> pics = new ArrayList<String>(2);

        // Parse the request
        try {
            FileItemIterator interator = upload.getItemIterator(request);
            while (interator.hasNext()) {
                FileItemStream item = interator.next();
                String name = item.getFieldName();

                InputStream stream = item.openStream();
                if (item.isFormField()) {
                    System.out.println("Form field " + name + " with value "
                            + Streams.asString(stream) + " detected.");
                } else {
                    System.out.println("File field " + name + " with file name "
                            + item.getName() + " detected.");
                    // Process the input stream
                    String fileName = UploadUtils.upload(name, stream);
                    pics.add(fileName);
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*focus.setPic21(pics.get(0));
        focus.setPic43(pics.get(1))*/;

        focusService.save(focus);
        return null;
    }
}
