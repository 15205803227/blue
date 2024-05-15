package com.blue.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/test")
public class TestController {
    @GetMapping("/geta")
    public String getA(){
        return "a";
    }
}
