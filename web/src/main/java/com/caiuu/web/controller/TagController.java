package com.caiuu.web.controller;

import com.caiuu.core.entity.Tag;
import com.caiuu.core.service.TagService;
import com.caiuu.web.util.Page;
import com.caiuu.web.util.RowBoundsUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午6:52
 * Description:
 */
@Controller
@RequestMapping(value = "/admin/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/list/{num}", method = RequestMethod.GET)
    public ModelAndView list(@PathVariable int num) {
        int currentPage = num < 1 ? 1 : num;
        Page page = new Page();
        page.setPageSize(20);
        page.setCurrentPage(currentPage);
        page.setTotalRows(tagService.findCount());
        page.setUrl("./{0}");

        RowBounds rowBounds = RowBoundsUtil.generate(page);
        List<Tag> tags = tagService.findAll(rowBounds);

        ModelAndView modelAndView = new ModelAndView("admin/tag-list");
        modelAndView.addObject("tags", tags);
        modelAndView.addObject("page", page);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(Tag tag) {
        tagService.save(tag);

        return "success";
    }
}
