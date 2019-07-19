package com.chinasoftintership.ordermeal.web;

import com.chinasoftintership.ordermeal.service.DisheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisheController {
    @Autowired
    private DisheService disheService;
    @RequestMapping(value = "/dish/get",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String Selectdishes(){
        return disheService.Selectdishes().toString();
    }
}
