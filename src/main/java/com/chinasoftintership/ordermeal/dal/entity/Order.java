package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int orderId;
  private int tableId;
  private int userId;
  private Date orderTime;
  private String orderStatus;
  private int peopleNumber;
  private Date bookingTime;

    public int getOrderId() {
        return orderId;
    }

    public int getTableId() {
        return tableId;
    }

    public int getUserId() {
        return userId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", tableId=" + tableId +
                ", userId=" + userId +
                ", orderTime=" + orderTime +
                ", orderStatus='" + orderStatus + '\'' +
                ", peopleNumber=" + peopleNumber +
                ", bookingTime=" + bookingTime +
                '}';
    }
}
