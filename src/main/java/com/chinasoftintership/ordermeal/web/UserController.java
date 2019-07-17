package com.chinasoftintership.ordermeal.web;


import com.chinasoftintership.ordermeal.dal.entity.User;
import com.chinasoftintership.ordermeal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    private User user;
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
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
    @RequestMapping("login")
    @ResponseBody
    public Map<String,String> login(String username,String password){
        Map<String,String> result = new HashMap<>();
        LOGGER.info("username={} password={}",username,password);
        String accounts ="123456";
        String passwords = "123456";
        if (accounts.equals(username)&&passwords.equals(password))
        {
            result.put("msg","success");
            return result;
        }
        else
        {
            result.put("msg", "fail");
            result.put("data", "账号或密码无效");
            return result;
        }

    }
}