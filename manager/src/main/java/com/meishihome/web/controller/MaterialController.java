package com.meishihome.web.controller;

import com.meishihome.core.entity.Category;
import com.meishihome.core.entity.Material;
import com.meishihome.core.entity.Temporary;
import com.meishihome.core.service.CategoryService;
import com.meishihome.core.service.MaterialService;
import com.meishihome.web.util.Page;
import com.meishihome.web.util.RowBoundsUtil;
import org.apache.ibatis.session.RowBounds;
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
@RequestMapping(value = "/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list/{num}", method = RequestMethod.GET)
    public ModelAndView list(@PathVariable int num) {
        int currentPage = num < 1 ? 1 : num;
        Page page = new Page();
        page.setPageSize(10);
        page.setCurrentPage(currentPage);
        page.setTotalRows(materialService.findCount());
        page.setUrl("./{0}");

        RowBounds rowBounds = RowBoundsUtil.generate(page);
        List<Material> materials = materialService.findAll(rowBounds);

        ModelAndView modelAndView = new ModelAndView("material-list");
        modelAndView.addObject("materials", materials);
        modelAndView.addObject("page", page);

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

        ModelAndView modelAndView = new ModelAndView("material-edit");
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
