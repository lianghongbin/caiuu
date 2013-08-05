package com.meishihome.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Administrator
 * Date: 13-8-5
 * Time: 下午8:57
 * Description:
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public ModelAndView index() {

        ModelAndView model = new ModelAndView("index");

        return model;
    }
}
