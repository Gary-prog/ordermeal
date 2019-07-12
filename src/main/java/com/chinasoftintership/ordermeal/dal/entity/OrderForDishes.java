package com.chinasoftintership.ordermeal.dal.entity;
//订单菜品表
import javax.persistence.*;

@Entity
@Table(name="orderfordishes")

public class OrderForDishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderfordishes_id;//订单菜品表编号
    private int dishesid;//菜品编号
    private int orderid;//订单编号
    private String dishesid_status;//订单状态
    private int number;//数量

    public int getOrderfordishes_id() {
        return orderfordishes_id;
    }

    public int getDishesid() {
        return dishesid;
    }

    public int getOrderid() {
        return orderid;
    }

    public String getDishesid_status() {
        return dishesid_status;
    }

    public int getNumber() {
        return number;
    }

    public void setOrderfordishes_id(int orderfordishes_id) {
        this.orderfordishes_id = orderfordishes_id;
    }

    public void setDishesid(int dishesid) {
        this.dishesid = dishesid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public void setDishesid_status(String dishesid_status) {
        this.dishesid_status = dishesid_status;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderForDishes{" +
                "orderfordishes_id=" + orderfordishes_id +
                ", dishesid=" + dishesid +
                ", orderid=" + orderid +
                ", dishesid_status='" + dishesid_status + '\'' +
                ", number=" + number +
                '}';
    }
}
