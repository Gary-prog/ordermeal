package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int order_id;
  private int table_id;
  private int user_id;
  private Date order_time;
  private String order_status;
  private int people_number;
  private Date booking_time;

    public int getOrder_id() {
        return order_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public String getOrder_status() {
        return order_status;
    }

    public int getPeople_number() {
        return people_number;
    }

    public Date getBooking_time() {
        return booking_time;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public void setPeople_number(int people_number) {
        this.people_number = people_number;
    }

    public void setBooking_time(Date booking_time) {
        this.booking_time = booking_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", table_id=" + table_id +
                ", user_id=" + user_id +
                ", order_time=" + order_time +
                ", order_status='" + order_status + '\'' +
                ", people_number=" + people_number +
                ", booking_time=" + booking_time +
                '}';
    }
}
