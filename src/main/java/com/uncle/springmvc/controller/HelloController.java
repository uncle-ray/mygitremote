package com.uncle.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: uncle-ray
 * @description:
 * @author: lei pei
 * @create: 2020-11-07 21:09
 */
//@Controller
public class HelloController implements Controller {

    //    @RequestMapping("ok")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "HelloSpringMVC!");
        mv.setViewName("allBook");
        return mv;
    }

}
