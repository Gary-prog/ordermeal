package com.chinasoftintership.ordermeal.service;

import com.chinasoftintership.ordermeal.dal.entity.Order;
import com.google.gson.JsonObject;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

public interface OrderService {
    void save(Integer tableId, Date bookingTime);
    JsonObject Select(String openId);

}
