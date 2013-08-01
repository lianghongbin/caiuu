package com.caiuu.web.controller;

import com.caiuu.core.entity.Category;
import com.caiuu.core.entity.CategoryMap;
import com.caiuu.core.service.CategoryMapService;
import com.caiuu.core.service.CategoryService;
import com.caiuu.web.util.Page;
import com.caiuu.web.util.RowBoundsUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 7/21/13
 * Time: 21:56
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/map")
public class CategoryMapController {

    @Autowired
    private CategoryMapService categoryMapService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list/{id}/{num}")
    public ModelAndView list(@PathVariable int id, @PathVariable int num, String name) {
        List<Category> categories = categoryService.findAll();
        List<CategoryMap> categoryMaps;
        int currentPage = num < 1 ? 1 : num;
        Page page = new Page();
        page.setPageSize(40);
        page.setCurrentPage(currentPage);
        page.setUrl("./{0}");
        Map<String,String> params = new HashMap<String, String>(1);
        params.put("name", name);

        RowBounds rowBounds = RowBoundsUtil.generate(page);
        if (id == 0) {
            page.setTotalRows(categoryMapService.findCount(params));
            categoryMaps = categoryMapService.findAll(params, rowBounds);
        }
        else {
            page.setTotalRows(categoryMapService.findCountByCategoryId(id));
            categoryMaps = categoryMapService.findByCategoryId(id, rowBounds);
        }

        ModelAndView modelAndView = new ModelAndView("admin/map-list");
        modelAndView.addObject("categoryMaps", categoryMaps);
        modelAndView.addObject("categories", categories);
        modelAndView.addObject("categoryId", id);

        return modelAndView;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(int id) {
        categoryMapService.delete(id);

        return "success";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public ModelAndView input() {
        List<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("admin/map-input");
        modelAndView.addObject("categories", categories);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(int categoryId, String content) {
        if (StringUtils.isBlank(content)) {
            return "error";
        }

        String[] names;
        names = content.split(",");
        if (names== null) {
            names = content.split("\n");
        }
        List<CategoryMap> categoryMaps = new ArrayList<CategoryMap>();
        for (String name : names) {
            CategoryMap categoryMap = new CategoryMap();
            categoryMap.setCategoryId(categoryId);
            categoryMap.setName(name);
            categoryMaps.add(categoryMap);
        }

        categoryMapService.batchSave(categoryMaps);

        return "success";
    }
}
