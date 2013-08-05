package com.meishihome.edit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: lianghongbin
 * Date: 7/4/13
 * Time: 23:56
 * Description:
 */
@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("main");
    }

    @RequestMapping(value = "/left", method = RequestMethod.GET)
    public ModelAndView left() {
        return new ModelAndView("left");
    }

    @RequestMapping(value = "/right", method = RequestMethod.GET)
    public ModelAndView right() {
        return new ModelAndView("right");
    }
}
