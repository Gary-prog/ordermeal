package com.chinasoftintership.ordermeal.web;

import com.chinasoftintership.ordermeal.service.ClassifyService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;
    @RequestMapping(value = "/classify/get",produces="application/json;charset=UTF-8")
    public String Selectclassify() {
            return classifyService.Selectclassify().toString();
    }
}
