package com.yang.hello1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello1")
public class helloController {



    @GetMapping
    public String hello(){
        System.out.println("hello1");
        return ("hello1");
    }
}