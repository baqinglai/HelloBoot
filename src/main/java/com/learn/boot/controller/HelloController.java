package com.learn.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Handle01() {
        //在GitHub上直接修改
        return "Hello, SpringBoot 2!";
    }
}
