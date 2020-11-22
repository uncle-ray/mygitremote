package com.uncle.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: uncle-ray
 * @description:
 * @author: lei pei
 * @create: 2020-11-16 23:10
 */
@Controller //代表这个类会被Spring接管
//被这个注解的类中的所有方法，如果返回值是String，并且有具体页面可以跳转，那么就会被视图解析器解析
@RequestMapping("/hello")
public class Hello2Controller {

    @RequestMapping("/h1")
    public String hello1(Model model) {
        // 向模型中添加数据，封装数据
        model.addAttribute("msg", "Hello SpringMVCAnnotation！！");
        return "allBook";//会被视图解析器处理
    }

    @RequestMapping("/h2")
    public String hello2(Model model) {
        // 向模型中添加数据，封装数据
        model.addAttribute("msg", "World SpringMVCAnnotation！！");
        return "redirect:/index.jsp";//会被视图解析器处理
    }
}
