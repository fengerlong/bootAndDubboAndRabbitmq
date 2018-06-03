package com.dubbo.test.service.controllers;

import com.dubbo.test.dubboclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller {

    @Autowired
    private TestService testService;

    @GetMapping("/name")
    private String sayName(String name){
       return testService.sayName(name);
    }
}
