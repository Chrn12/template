package com.woniu.yoga.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yoga")
public class TestController {

    @RequestMapping("/test")
    public void VTest(){
        System.out.println("123123");
    }
}
