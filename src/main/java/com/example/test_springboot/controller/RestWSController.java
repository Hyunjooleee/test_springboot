package com.example.test_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class RestWSController{
    @RequestMapping(value = "/ws/organization")
    public Object actionMethod(){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID","123456789456");
        resultObject.put("CELLPHONE","010-5874-7438");
        resultObject.put("ADRESS_ID","98563145");
        resultObject.put("AGE","24");

        return resultObject;
    }
}