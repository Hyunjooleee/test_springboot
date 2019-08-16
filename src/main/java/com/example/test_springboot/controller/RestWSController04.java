package com.example.test_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController

public class RestWSController04{
    @RequestMapping(value = "/ws/post", method = RequestMethod.POST)
    public String getParamWithAjax(){
        return "Welcome to Hello World!";
    }
}
