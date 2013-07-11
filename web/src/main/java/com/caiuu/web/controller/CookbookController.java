package com.caiuu.web.controller;

import com.caiuu.core.entity.Cookbook;
import com.caiuu.core.service.CookbookService;
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
 * Time: 下午10:52
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class CookbookController {

    @Autowired
    private CookbookService cookbookService;

    @RequestMapping(value = "/cookbook/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Cookbook> cookbooks = cookbookService.findAll();
        return new ModelAndView("admin/cookbook-list", "cookbooks", cookbooks);
    }

    @RequestMapping(value = "/cookbook/add", method = RequestMethod.POST)
    public ModelAndView add(Cookbook cookbook) {
        cookbookService.save(cookbook);

        return null;
    }

    @RequestMapping(value = "/cookbook/update", method = RequestMethod.POST)
    public ModelAndView update(Cookbook cookbook) {
        cookbookService.update(cookbook);
        return null;
    }

    @RequestMapping(value = "/cookbook/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id) {
        cookbookService.delete(id);

        return null;
    }

    @RequestMapping(value = "/cookbook/view/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable int id) {
        Cookbook cookbook = cookbookService.find(id);
        return new ModelAndView("admin/cookbook-view", "cookbook", cookbook);
    }
}
