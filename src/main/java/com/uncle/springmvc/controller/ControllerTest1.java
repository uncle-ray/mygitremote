package com.uncle.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: uncle-ray
 * @description:
 * @author: lei pei
 * @create: 2020-11-16 23:32
 */
@RestController
@RequestMapping("/hello1")
public class ControllerTest1 {
    @RequestMapping("h1")
    public String test1() {
        return "ControllerTest1";
    }
}
