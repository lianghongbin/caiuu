package com.meishihome.edit.controller;

import com.meishihome.core.entity.Feedback;
import com.meishihome.core.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/4/13
 * Time: 14:07
 * Description:
 */
@Controller
@RequestMapping(value="/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Feedback> feedbacks = feedbackService.findAll();

        return new ModelAndView("feedback", "feedbacks", feedbacks);
    }
}
