package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.UserRepo;
import com.chinasoftintership.ordermeal.dal.entity.User;
import com.chinasoftintership.ordermeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> SelectUser() {
        return userRepo.findAll();
    }


}
