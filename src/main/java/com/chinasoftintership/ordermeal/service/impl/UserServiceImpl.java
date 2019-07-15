package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.UserRepo;
import com.chinasoftintership.ordermeal.dal.entity.User;
import com.chinasoftintership.ordermeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;


    @Override
    public void save(String openId, String city, Integer sex, String userName, String headPortrait) {
        User user = new User();
        user.setOpenId(openId);
        user.setCity(city);
        user.setSex(sex);
        user.setUserName(userName);
        user.setHeadPortrait(headPortrait);
        userRepo.save(user);

    }
}
