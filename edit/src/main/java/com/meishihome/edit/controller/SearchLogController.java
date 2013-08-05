package com.meishihome.edit.controller;

import com.meishihome.core.entity.SearchLog;
import com.meishihome.core.service.SearchLogService;
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
public class SearchLogController {

    @Autowired
    private SearchLogService searchLogService;

    @RequestMapping(value = "/list")
     public ModelAndView list() {
        List<SearchLog> searchLogs = searchLogService.findAll();
        return new ModelAndView("search-list", "searchLogs", searchLogs);
    }
}
