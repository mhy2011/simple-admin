package com.mhy.admin.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录控制器
 * @author mahaiyuan
 * @ClassName: LoginController
 * @date 2018-08-13 下午11:22
 */
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

}
