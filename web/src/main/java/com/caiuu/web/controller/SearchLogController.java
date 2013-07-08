package com.caiuu.web.controller;

import com.caiuu.core.entity.SearchLog;
import com.caiuu.core.service.SearchLogService;
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
@RequestMapping(value = "/admin")
public class SearchLogController {

    @Autowired
    private SearchLogService searchLogService;

    @RequestMapping(value = "/search/list")
     public ModelAndView list() {
        List<SearchLog> searchLogs = searchLogService.findAll();
        return new ModelAndView("list", "searchLogs", searchLogs);
    }

    @RequestMapping(value = "/search/top")
    public ModelAndView top() {
        List<SearchLog> searchLogs = searchLogService.findTop();
        return new ModelAndView("top", "searchLogs", searchLogs);
    }
}
