package com.chinasoftintership.ordermeal.dal;

import com.chinasoftintership.ordermeal.dal.entity.OrderForDishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderFordisheRepo extends JpaRepository<OrderForDishes , Integer> {
    @Query(nativeQuery = true,value = "select d.dishes_id,d.dishes_name,d.introduction,d.price,o.number,o.order_id from dish d, orderfordishes o where d.dishes_id = o.dishes_id ")
    List<Object> Select();
}
