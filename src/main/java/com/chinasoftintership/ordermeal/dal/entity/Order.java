package com.chinasoftintership.ordermeal.dal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
@Getter
@Setter
@ToString
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int orderId;
  private int tableId;
  private String openId;
  private Date orderTime;
  private String orderStatus;
  private int peopleNumber;
  private Date bookingTime;
  private float totalPrice;
  private int count;


}
