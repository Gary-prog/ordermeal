package com.chinasoftintership.ordermeal.dal.entity;
//订单菜品表
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="orderfordishes")
@Getter
@Setter
@ToString
public class OrderForDishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderfordishesId;//订单菜品表编号
    private int dishesId;//菜品编号
    private int orderId;//订单编号
    private String dishesidStatus;//订单状态
    private int number;//数量


}
