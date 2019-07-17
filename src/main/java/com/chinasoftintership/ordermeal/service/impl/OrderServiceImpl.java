package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.OrderRepo;
import com.chinasoftintership.ordermeal.dal.entity.Order;
import com.chinasoftintership.ordermeal.dal.entity.User;
import com.chinasoftintership.ordermeal.service.OrderService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Override
    public void save(Integer tableId, Date bookingTime) {
        Order order= new Order();
        order.setTableId(tableId);
        order.setBookingTime(bookingTime);
        orderRepo.save(order);
    }

    public JsonObject Select(String openId) {

        JsonArray array = new JsonArray();
//        JsonObject returnObject = new JsonObject();
        JsonObject object = new JsonObject();
//        orderRepo.findByOpenId(user.getOpenId());
        try {
        List<Order> list = orderRepo.findByOpenId(openId);
        System.out.println(list.toString());
        for (Order order : list) {
            JsonObject object1 = new JsonObject();
            object1.addProperty("count", order.getCount());
            object1.addProperty("totalPrice", order.getTotalPrice());
            object1.addProperty("orderId", order.getOrderId());
            SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String date = sp.format(order.getOrderTime());
            object1.addProperty("orderTime", date);
            object1.addProperty("orderStatus",order.getOrderStatus());
            array.add(object1);
        }
        object.add("data", array);
        object.addProperty("msg", "success");
        System.out.println(object.toString());
        return object;

    }catch (RuntimeException e){
        e.printStackTrace();
        object.addProperty("msg","fail");
        return object;
    }

    }




}
