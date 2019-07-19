package com.chinasoftintership.ordermeal.service;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Date;


public interface OrderService {
    void save(Integer tableId,Integer peopleNumber, Date bookingTime);
    JsonObject Select(String openId);
    JsonObject Select2(Integer orderId);
    void save2(String openId, Integer tableId, Integer count, float totalPrice,Integer[] dishIds,Integer[] counts);

}
