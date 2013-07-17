package com.caiuu.web.controller;

import com.caiuu.core.entity.Category;
import com.caiuu.core.entity.Material;
import com.caiuu.core.service.CategoryService;
import com.caiuu.core.service.MaterialService;
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
 * Time: 下午9:25
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list")
    public ModelAndView list() {
        List<Material> materials = materialService.findAll();
        int count = materialService.count();
        ModelAndView modelAndView = new ModelAndView("admin/material-list");
        modelAndView.addObject("count", count);
        modelAndView.addObject("materials", materials);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Material material, int categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        material.setCategory(category);
        materialService.save(material);

        return "success";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        List<Category> categories = categoryService.findAll();
        Material material = materialService.find(id);

        ModelAndView modelAndView = new ModelAndView("admin/material-edit");
        modelAndView.addObject("material", material);
        modelAndView.addObject("categories", categories);

        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        materialService.delete(id);
        return "success";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Material material) {
        materialService.update(material);

        return "success";
    }
}
