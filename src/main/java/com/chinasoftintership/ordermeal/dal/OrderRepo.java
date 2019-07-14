package com.chinasoftintership.ordermeal.dal;

import com.chinasoftintership.ordermeal.dal.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {

}
