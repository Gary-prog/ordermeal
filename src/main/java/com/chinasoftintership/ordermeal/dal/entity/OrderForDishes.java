package com.chinasoftintership.ordermeal.dal.entity;
//订单菜品表
import javax.persistence.*;

@Entity
@Table(name="orderfordishes")

public class OrderForDishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderfordishesId;//订单菜品表编号
    private int dishesId;//菜品编号
    private int orderId;//订单编号
    private String dishesidStatus;//订单状态
    private int number;//数量

    public int getOrderfordishesId() {
        return orderfordishesId;
    }

    public int getDishesId() {
        return dishesId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getDishesidStatus() {
        return dishesidStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setOrderfordishesId(int orderfordishesId) {
        this.orderfordishesId = orderfordishesId;
    }

    public void setDishesId(int dishesId) {
        this.dishesId = dishesId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setDishesidStatus(String dishesidStatus) {
        this.dishesidStatus = dishesidStatus;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderForDishes{" +
                "orderfordishesId=" + orderfordishesId +
                ", dishesId=" + dishesId +
                ", orderId=" + orderId +
                ", dishesidStatus='" + dishesidStatus + '\'' +
                ", number=" + number +
                '}';
    }
}
