package com.caiuu.web.controller;

import com.caiuu.core.entity.Cookbook;
import com.caiuu.core.entity.Detail;
import com.caiuu.core.service.CookbookService;
import com.caiuu.core.service.DetailService;
import com.caiuu.core.service.TemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午10:52
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/cookbook")
public class CookbookController {

    @Autowired
    private CookbookService cookbookService;
    @Autowired
    private DetailService detailService;
    @Autowired
    private TemporaryService temporaryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Cookbook> cookbooks = cookbookService.findAll();
        int count = cookbookService.count();
        ModelAndView modelAndView = new ModelAndView("admin/cookbook-list");
        modelAndView.addObject("cookbooks", cookbooks);
        modelAndView.addObject("count", count);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Cookbook cookbook, String info, int temporaryId) {
        int cookbookId = cookbookService.save(cookbook);
        Detail detail = new Detail();
        detail.setCookbookId(cookbookId);
        detail.setInfo(info);
        detailService.save(detail);
        temporaryService.delete(temporaryId);

        return "success";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Cookbook cookbook, String info) {
        Map<String,String> map = new HashMap<String, String>(1);
        map.put("cookbookId", Integer.toString(cookbook.getId()));
        map.put("info", info);
        detailService.updateContent(map);
        cookbookService.update(cookbook);

        return "success";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        cookbookService.delete(id);

        return "success";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        Cookbook cookbook = cookbookService.find(id);
        Detail detail = detailService.find(id);
        ModelAndView modelAndView = new ModelAndView("admin/cookbook-edit");
        modelAndView.addObject("cookbook", cookbook);
        modelAndView.addObject("detail", detail);

        return modelAndView;
    }
}
