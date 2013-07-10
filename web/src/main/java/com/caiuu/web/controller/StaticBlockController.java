package com.caiuu.web.controller;

import com.caiuu.core.entity.StaticBlock;
import com.caiuu.core.service.StaticBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-10
 * Time: 下午11:07
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class StaticBlockController {

    @Autowired
    private StaticBlockService staticBlockService;

    @RequestMapping(value = "/static/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<StaticBlock> staticBlocks = staticBlockService.findAll();
        return new ModelAndView("admin/static-list", "staticBlocks", staticBlocks);
    }

    @RequestMapping(value = "/static/view", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("admin/static-view");
    }

    @RequestMapping(value = "/static/save", method = RequestMethod.POST)
    public ModelAndView save(StaticBlock staticBlock) {
        staticBlockService.save(staticBlock);

        return null;
    }

    @RequestMapping(value = "/static/update", method = RequestMethod.POST)
    public ModelAndView update(StaticBlock staticBlock) {
        staticBlockService.update(staticBlock);

        return null;
    }
}
