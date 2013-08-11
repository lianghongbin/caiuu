package com.meishihome.web.controller;

import com.meishihome.core.entity.Cookbook;
import com.meishihome.core.entity.Crowd;
import com.meishihome.core.entity.Focus;
import com.meishihome.core.service.CookbookService;
import com.meishihome.core.service.CrowdService;
import com.meishihome.core.service.FocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-8-5
 * Time: 下午8:57
 * Description:
 */
@Controller
public class IndexController {

    @Autowired
    private FocusService focusService;
    @Autowired
    private CookbookService cookbookService;
    @Autowired
    private CrowdService crowdService;

    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public ModelAndView index() {

        List<Focus> focuses = focusService.findRows(5);
        List<Cookbook> cookbooks = cookbookService.findByCrowd(1);
        List<Crowd> crowds = crowdService.findAll();
        ModelAndView model = new ModelAndView("index");
        model.addObject("crowds", crowds);
        model.addObject("cookbooks", cookbooks);
        model.addObject("focuses", focuses);

        return model;
    }
}
