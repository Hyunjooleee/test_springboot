package com.example.test_springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class RestWSController05 {
    @RequestMapping(value = "/ws/ajax")
    public Object getParamWithAjax(@RequestParam Map<String, Object>paramMap){
        String str = (String) paramMap.get("title");
        return paramMap;
    }
}