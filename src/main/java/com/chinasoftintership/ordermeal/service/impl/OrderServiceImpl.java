package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.OrderFordisheRepo;
import com.chinasoftintership.ordermeal.dal.OrderRepo;
import com.chinasoftintership.ordermeal.dal.entity.Order;
import com.chinasoftintership.ordermeal.dal.entity.OrderForDishes;
import com.chinasoftintership.ordermeal.service.OrderService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderFordisheRepo orderFordisheRepo;

    @Override
    public void save(Integer tableId, Integer peopleNumber, Date bookingTime) {
        Order order = new Order();
        order.setTableId(tableId);
        order.setPeopleNumber(peopleNumber);
        order.setBookingTime(bookingTime);
        orderRepo.save(order);
    }

    public JsonObject Select(String openId) {

        JsonArray array = new JsonArray();

        JsonObject object = new JsonObject();

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
                object1.addProperty("orderStatus", order.getOrderStatus());
                array.add(object1);
            }
            object.add("data", array);
            object.addProperty("msg", "success");
            System.out.println(object.toString());
            return object;

        } catch (RuntimeException e) {
            e.printStackTrace();
            object.addProperty("msg", "fail");
            return object;
        }

    }

    @Override
    public JsonObject Select2(Integer orderId) {
        JsonArray array = new JsonArray();
        JsonObject object1 = new JsonObject();
        JsonObject returnobject = new JsonObject();
        try {
            List<Order> list = orderRepo.findByOrderId(orderId);
            for (Order order : list) {

                object1.addProperty("totalPrice", order.getTotalPrice());
                SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String date = sp.format(order.getOrderTime());
                object1.addProperty("orderTime", date);
            }
            List<Object> list1 = orderFordisheRepo.Select();
            for (int i = 0; i < list1.size(); i++) {

                Object[] objarray = (Object[]) list1.get(i);

                if(((int)(objarray[5]))==orderId) {
                    JsonObject object = new JsonObject();

                    object.addProperty("dishId", (int) (objarray[0]));
                    object.addProperty("dishName", String.valueOf(objarray[1]));
                    object.addProperty("img", String.valueOf(objarray[2]));
                    object.addProperty("price", (float) (objarray[3]));
                    object.addProperty("number", (int) (objarray[4]));
                    array.add(object);

                }
            }
            object1.add("dishList", array);
            returnobject.add("data", object1);
            returnobject.addProperty("msg", "success");
            return returnobject;
        } catch (RuntimeException e) {
            e.printStackTrace();
            returnobject.addProperty("msg", "fail");
            return returnobject;
        }

    }

    @Override
    public void save2(String openId, Integer tableId, Integer count, float totalPrice, Integer[] dishIds, Integer[] counts) {

            Date date = new Date();
            Order order = new Order();
            order.setOrderTime(date);
            order.setOpenId(openId);
            order.setTableId(tableId);
            order.setCount(count);
            order.setOrderStatus("待付款");
            order.setTotalPrice(totalPrice);
            Order order1 = orderRepo.save(order);
            for (int i = 0; i < dishIds.length; i++) {
                int dishId = dishIds[i];
                int count1 = counts[i];
                OrderForDishes orderForDishes = new OrderForDishes();
                orderForDishes.setDishesId(dishId);
                orderForDishes.setNumber(count1);
                orderForDishes.setOrderId(order1.getOrderId());
                orderFordisheRepo.save(orderForDishes);


            }


    }
}
