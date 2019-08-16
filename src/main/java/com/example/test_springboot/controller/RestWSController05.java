package com.example.test_springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class RestWSController05 {
    public String getParamWithAjax(@RequestParam Map<String, Object>paramMap){
        String str = (String) paramMap.get("title");
        return "Welcome to Hello World!";
    }
}