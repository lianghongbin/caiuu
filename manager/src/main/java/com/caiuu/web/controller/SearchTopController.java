package com.caiuu.web.controller;

import com.caiuu.core.entity.SearchTop;
import com.caiuu.core.service.SearchTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-8
 * Time: 下午10:54
 * Description:
 */
@Controller
@RequestMapping(value = "/search")
public class SearchTopController {

    @Autowired
    private SearchTopService searchTopService;

    @RequestMapping(value = "/top")
    public ModelAndView top() {
        List<SearchTop> searchTops = searchTopService.findTop();
        return new ModelAndView("search-top", "searchTops", searchTops);
    }
}
