package com.caiuu.web.controller;

import com.caiuu.core.entity.Detail;
import com.caiuu.core.service.DetailService;
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
 * Time: 下午10:58
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class DetailController {

    @Autowired
    private DetailService detailService;

    @RequestMapping(value = "/detail/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Detail> details = detailService.findAll();
        return new ModelAndView("admin/detail-list", "details", details);
    }

    @RequestMapping(value = "/detail/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Detail detail) {
        detailService.save(detail);

        return "success";
    }

    @RequestMapping(value = "/detail/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Detail detail) {
        detailService.update(detail);
        return "success";
    }

    @RequestMapping(value = "/detail/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        detailService.delete(id);

        return "success";
    }

    @RequestMapping(value = "/detail/view/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable int id) {
        Detail detail = detailService.find(id);
        return new ModelAndView("admin/detail-view", "detail", detail);
    }
}