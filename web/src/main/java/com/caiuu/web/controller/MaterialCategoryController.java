package com.caiuu.web.controller;

import com.caiuu.core.entity.MaterialCategory;
import com.caiuu.core.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午7:41
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class MaterialCategoryController {

    @Autowired
    private MaterialCategoryService materialCategoryService;

    @RequestMapping(value = "/mc/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<MaterialCategory> materialCategories = materialCategoryService.findAll();

        return new ModelAndView("/admin/mc-list", "mcs", materialCategories);
    }

    @RequestMapping(value = "/mc/add", method = RequestMethod.POST)
    public ModelAndView add(MaterialCategory materialCategory) {
        materialCategoryService.save(materialCategory);

        return null;
    }

    @RequestMapping(value = "/mc/view/{id}", method = RequestMethod.GET)
    public ModelAndView find(@PathVariable int id) {
        MaterialCategory materialCategory = materialCategoryService.find(id);
        return new ModelAndView("/admin/mc-view", "mc", materialCategory);
    }

    @RequestMapping(value = "/mc/update", method = RequestMethod.POST)
    public ModelAndView update(MaterialCategory materialCategory) {
        materialCategoryService.update(materialCategory);
        return null;
    }
}
