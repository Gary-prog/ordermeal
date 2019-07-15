package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.OrderRepo;
import com.chinasoftintership.ordermeal.dal.entity.Order;
import com.chinasoftintership.ordermeal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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


}
