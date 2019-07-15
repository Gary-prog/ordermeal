package com.chinasoftintership.ordermeal.web;

import com.chinasoftintership.ordermeal.dal.entity.User;
import com.chinasoftintership.ordermeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public List<User> selectUser(){
       return userService.SelectUser();
    }
}