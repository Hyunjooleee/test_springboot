package com.example.test_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController

public class RestWSController03{
    @RequestMapping(value = "/ws/organizationList")
    public Object actionMethod(){
        List<Object> resultObject = new ArrayList<Object>();
        Map<String,Object> data01 = new HashMap<String,Object>();
        data01.put("MEMBER_ID","123456789456");
        data01.put("NAME","Hyunjoo lee");
        data01.put("CELLPHONE","010-5874-7438");
        data01.put("ADRESS_ID","98563145");
        data01.put("AGE","24");
        resultObject.add(data01);

        return resultObject;
    }
}