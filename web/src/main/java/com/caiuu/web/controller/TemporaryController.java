package com.caiuu.web.controller;

import com.caiuu.core.entity.Category;
import com.caiuu.core.entity.CategoryLink;
import com.caiuu.core.entity.Temporary;
import com.caiuu.core.service.CategoryService;
import com.caiuu.core.service.TemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午4:49
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/temp")
public class TemporaryController {

    @Autowired
    private TemporaryService temporaryService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Temporary> temporaries = temporaryService.selectAll();

        return new ModelAndView("admin/temp-list", "temporaries", temporaries);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        Temporary temporary = temporaryService.find(id);
        List<CategoryLink> categoryLinks = categoryService.getCategoryLink();
        ModelAndView modelAndView = new ModelAndView("admin/temp-edit");
        modelAndView.addObject("temporary", temporary);
        modelAndView.addObject("categoryLinks", categoryLinks);

        return modelAndView;
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public ModelAndView view(Temporary temporary, String info, String profile, int categoryId) {

        List<Category> family = categoryService.getCategoryFamilyById(categoryId);
        Category category = categoryService.find(categoryId);

        ModelAndView modelAndView = new ModelAndView("admin/temp-view");
        modelAndView.addObject("temporary", temporary);
        modelAndView.addObject("info", info);
        modelAndView.addObject("profile", profile);
        modelAndView.addObject("category", category);
        modelAndView.addObject("categoryFamily", family);

        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {
        temporaryService.delete(id);

        return "success";
    }
}
