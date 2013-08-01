package com.meishihome.web.controller;

import com.meishihome.core.entity.StaticBlock;
import com.meishihome.core.service.StaticBlockService;
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
 * Date: 13-7-10
 * Time: 下午11:07
 * Description:
 */
@Controller
@RequestMapping(value = "/static")
public class StaticBlockController {

    @Autowired
    private StaticBlockService staticBlockService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<StaticBlock> staticBlocks = staticBlockService.findAll();
        return new ModelAndView("static-list", "staticBlocks", staticBlocks);
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public ModelAndView input() {
        return new ModelAndView("static-input");
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        StaticBlock staticBlock = staticBlockService.find(id);
        return new ModelAndView("static-edit", "staticBlock", staticBlock);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(StaticBlock staticBlock) {
        staticBlockService.save(staticBlock);

        return "success";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(StaticBlock staticBlock) {
        staticBlockService.update(staticBlock);

        return "success";
    }
}
