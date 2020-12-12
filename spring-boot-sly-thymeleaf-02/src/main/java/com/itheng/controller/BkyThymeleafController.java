package com.itheng.controller;

import com.itheng.entity.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author PV-CZH mail:zilemontree@yeah.net
 * @description 博客园Thymeleaf
 * @Date 2020/12/11 12:48
 * @title: BkyThymeleafController
 * @projectName spring-boot-shiyanlou-projects
 */
@Controller
public class BkyThymeleafController {
    @Autowired
    private LoginUser loginUser;

    @GetMapping("/thText")
    public String thTest(ModelMap modelMap) {
        //th:text 和 th:utext区别
        String msg = "<i style=\"color: red;\">我是后端传的i标签</i>";
        modelMap.put("msg",msg);
        return "th_text";
    }

    @GetMapping("/thExpess")
    public String expessText(ModelMap modelMap) {
        //*{...}和 ${...}表达式
        loginUser.setLoginUserId(1001);
        loginUser.setLoginUserName("Lemon");
        loginUser.setAge(18);
        modelMap.addAttribute("loginUser",loginUser);
        return "th_text";
    }
}
