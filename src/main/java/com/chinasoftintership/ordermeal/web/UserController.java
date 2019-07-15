package com.chinasoftintership.ordermeal.web;


import com.chinasoftintership.ordermeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userinfo/post")
    @ResponseBody
    public Map<String,String> save(String openId, String city, Integer sex, String userName, String headPortrait){
        Map<String,String>result = new HashMap<>();
       try{
           userService.save(openId, city, sex, userName, headPortrait);
           result.put("msg","success");
           System.out.println("ssssss");
           return result;

       }catch (RuntimeException e){
           e.printStackTrace();
           result.put("msg","fail");
           return result;
       }
    }
}