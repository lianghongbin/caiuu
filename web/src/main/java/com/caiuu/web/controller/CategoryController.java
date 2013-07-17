package com.caiuu.web.controller;


import com.caiuu.core.entity.Category;
import com.caiuu.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/3/13
 * Time: 11:06
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Category> categories = categoryService.findAll();

        ModelAndView modelAndView = new ModelAndView("admin/category-list", "categories", categories);
        modelAndView.addObject("size", categories.size());
        modelAndView.addObject("categories", categories);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Category category) {
        categoryService.save(category);

        return "success";
    }

    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {
        categoryService.delete(id);

        return "success";
    }
}
