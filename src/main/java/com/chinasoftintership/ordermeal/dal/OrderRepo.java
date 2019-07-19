package com.chinasoftintership.ordermeal.dal;

import com.chinasoftintership.ordermeal.dal.entity.Order;
import com.chinasoftintership.ordermeal.dal.entity.User;
import com.google.gson.JsonObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Integer> {
      List<Order> findByOpenId(String openId);
      List<Order> findByOrderId(Integer orderId);

}
