package com.chinasoftintership.ordermeal.service;

import com.chinasoftintership.ordermeal.dal.entity.User;

import java.util.List;

public interface UserService {
     void save(String openId,String city,Integer sex,String userName,String headPortrait);
}
