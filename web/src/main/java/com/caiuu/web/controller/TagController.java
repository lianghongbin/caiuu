package com.caiuu.web.controller;

import com.caiuu.core.entity.Tag;
import com.caiuu.core.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午6:52
 * Description:
 */
@Controller
@RequestMapping(value = "/admin")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/tag/list", method = RequestMethod.GET)
    public ModelAndView list() {
        List<Tag> tags = tagService.findAll();

        return new ModelAndView("admin/tag-list", "tags", tags);
    }

    @RequestMapping(value = "/tag/add", method = RequestMethod.POST)
    public ModelAndView add(Tag tag) {
        tagService.save(tag);

        return null;
    }
}
