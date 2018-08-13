package com.mhy.admin.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 管理后台首页
 * @author mahaiyuan
 * @ClassName: IndexController
 * @date 2018-08-13 下午11:08
 */
public class IndexController {

    @RequestMapping(value = {"", "/", "/index"})
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

}
