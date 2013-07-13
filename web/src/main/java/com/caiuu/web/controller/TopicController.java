package com.caiuu.web.controller;

import com.caiuu.core.entity.Topic;
import com.caiuu.core.service.TopicService;
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
 * Time: 下午3:25
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topic/input", method = RequestMethod.GET)
    public ModelAndView view() {
        return new ModelAndView("admin/topic-input");
    }

    @RequestMapping(value = "/topic/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Topic> topics = topicService.findAll();
        return new ModelAndView("admin/topic-list", "topics", topics);
    }

    @RequestMapping(value = "/topic/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Topic topic) {
        topicService.save(topic);
        return "success";
    }

    @RequestMapping(value = "/topic/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        Topic topic = topicService.find(id);
        return new ModelAndView("admin/topic-edit", "topic", topic);
    }

    @RequestMapping(value = "/topic/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Topic topic) {
        topicService.update(topic);
        return "success";
    }

    @RequestMapping(value = "/topic/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String delete(@PathVariable int id) {
        topicService.delete(id);
        return "success";
    }
}
