package com.caiuu.web.controller;

import com.caiuu.core.entity.Temporary;
import com.caiuu.core.service.TemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午4:49
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class TemporaryController {

    @Autowired
    private TemporaryService temporaryService;

    @RequestMapping(value = "/temp/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Temporary> temporaries = temporaryService.selectAll();

        return new ModelAndView("admin/temp-list", "temporaries", temporaries);
    }

    @RequestMapping(value = "/temp/view/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable int id) {
        Temporary temporary = temporaryService.find(id);
        return new ModelAndView("admin/temp-view", "temporaries", temporary);
    }

    @RequestMapping(value = "/temp/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {
        temporaryService.delete(id);

        return "success";
    }
}
