package com.example.test_springboot.controller;

import com.example.test_springboot.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class RestWSController02{
    @Autowired
    OrganizationService organizationService;
    @RequestMapping(value = "/ws/organization02")
    public Object actionMethod(){
        Object resultObject = new Object();
        resultObject = organizationService.actionMethod();
        return resultObject;
    }
}