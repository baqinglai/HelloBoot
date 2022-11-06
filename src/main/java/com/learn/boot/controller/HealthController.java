package com.learn.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/health")
    public String Handle01() {
        System.out.println("第一次提交");
        System.out.println("第二次提交");
        return "OK";
    }
}
