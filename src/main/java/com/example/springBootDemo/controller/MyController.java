package com.example.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/home")
    public String home() {
        return "boot start success";
    }
}
