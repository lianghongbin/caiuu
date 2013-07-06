package com.caiuu.web.controller;


import com.caiuu.core.entity.Category;
import com.caiuu.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/3/13
 * Time: 11:06
 * Description:
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value="/category/list", method= RequestMethod.GET)
    public ModelAndView list() {
        List<Category> categories = categoryService.findAll();

        ModelAndView modelAndView = new ModelAndView("category");
        modelAndView.addObject("size", categories.size());
        modelAndView.addObject("categories", categories);

        return modelAndView;
    }
}