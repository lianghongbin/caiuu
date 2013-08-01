package com.caiuu.web.controller;

import com.caiuu.core.entity.MaterialCategory;
import com.caiuu.core.service.MaterialCategoryService;
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
 * Time: 下午7:41
 * Description:
 */
@Controller
@RequestMapping(value = "/mc")
public class MaterialCategoryController {

    @Autowired
    private MaterialCategoryService materialCategoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<MaterialCategory> materialCategories = materialCategoryService.findAll();

        return new ModelAndView("mc-list", "mcs", materialCategories);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(MaterialCategory materialCategory) {
        materialCategoryService.save(materialCategory);

        return "success";
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView find(@PathVariable int id) {
        MaterialCategory materialCategory = materialCategoryService.find(id);
        return new ModelAndView("mc-view", "mc", materialCategory);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(MaterialCategory materialCategory) {
        materialCategoryService.update(materialCategory);
        return "success";
    }
}
