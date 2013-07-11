package com.caiuu.web.controller;

import com.caiuu.core.entity.Material;
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
@RequestMapping(value = "/admin")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @RequestMapping(value = "/material/list")
    public ModelAndView findAll() {
        List<Material> materials = materialService.findAll();

        return new ModelAndView("admin/material-list", "materials", materials);
    }

    @RequestMapping(value = "/material/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Material material) {
        materialService.save(material);

        return "success";
    }

    @RequestMapping(value = "/material/view/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable int id) {
        Material material = materialService.find(id);

        return new ModelAndView("/material/material-view", "material", material);
    }

    @RequestMapping(value = "/material/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        materialService.delete(id);
        return "success";
    }

    @RequestMapping(value = "/material/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Material material) {
        materialService.update(material);

        return "success";
    }
}
