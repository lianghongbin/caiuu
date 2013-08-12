package com.meishihome.web.controller;

import com.google.gson.Gson;
import com.meishihome.core.entity.*;
import com.meishihome.core.service.*;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * User: Administrator
 * Date: 13-8-5
 * Time: 下午8:57
 * Description:
 */
@Controller
public class IndexController {

    @Autowired
    private FocusService focusService;
    @Autowired
    private CookbookService cookbookService;
    @Autowired
    private CrowdService crowdService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public ModelAndView index() {

        List<Focus> focuses = focusService.findRows(5);
        List<Cookbook> cookbooks = cookbookService.findByCrowd(1, new RowBounds(0, 5));   //显示孕妇的5个菜谱
        List<Material> yfMaterials = materialService.findByCrowd(1, new RowBounds(0, 5));  //根据人员选食材;孕妇食材5条
        List<Crowd> crowds = crowdService.findAll();
        List<Crowd> hyCrowds = crowdService.findChildren(1);
        List<Material> materials = materialService.findBySeason(currentMonth());    //当季食材
        List<Cookbook> betterCookbooks = cookbookService.findBetter(new RowBounds(0, 15));   //精选菜谱
        List<Category> categories = categoryService.findTopLevel();

        ModelAndView model = new ModelAndView("index");
        model.addObject("crowds", crowds);
        model.addObject("cookbooks", cookbooks);
        model.addObject("focuses", focuses);
        model.addObject("materials", materials);
        model.addObject("hyCrowds", hyCrowds);
        model.addObject("yfMaterials", yfMaterials);
        model.addObject("betterCookbooks", betterCookbooks);
        model.addObject("categories", categories);

        return model;
    }

    @RequestMapping(value = "/waterfall.htm", method = RequestMethod.GET)
    @ResponseBody
    public String waterfall(@RequestParam(required = false) Integer time) {
        List<Cookbook> cookbooks = cookbookService.findAll(new RowBounds(0, 10));
        Gson gson = new Gson();

        return gson.toJson(cookbooks);
    }

    /**
     * 获取当前月份
     * @return 当前月份
     */
    private int currentMonth() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.CHINESE);
        calendar.setTime(new Date());
        return calendar.get(Calendar.MONTH)+1;
    }
}
