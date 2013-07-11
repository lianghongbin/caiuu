package com.caiuu.web.controller;

import com.caiuu.core.entity.Topic;
import com.caiuu.core.service.TopicService;
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
 * Time: 下午3:25
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topic/view", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("topic-view");
    }

    @RequestMapping(value = "/topic/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Topic> topics = topicService.findAll();
        return new ModelAndView("topic-list", "topics", topics);
    }

    @RequestMapping(value = "/topic/add", method = RequestMethod.POST)
    public ModelAndView add(Topic topic) {
        topicService.save(topic);
        return new ModelAndView("topic-view");
    }

    @RequestMapping(value = "/topic/update", method = RequestMethod.POST)
    public ModelAndView update(Topic topic) {
        topicService.updatePicture(topic);
        return new ModelAndView("topic-view");
    }

    @RequestMapping(value = "/topic/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id) {
        topicService.delete(id);
        return new ModelAndView("topic-list");
    }
}
