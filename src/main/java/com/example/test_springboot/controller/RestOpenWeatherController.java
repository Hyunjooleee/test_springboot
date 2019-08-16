package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@CrossOrigin
@RestController

public class RestOpenWeatherController{
    @RequestMapping(value = "/remote/openweather")
    public Object actionMethod(){
        RestTemplate restTemplate = new RestTemplate();
        Object tempObject = new Object();
        String keyId;
        String targetUri;
        Object resultObject;

        keyId = "b6907d289e10d714a6e88b30761fae22";
        targetUri = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=" + keyId;
        resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}

