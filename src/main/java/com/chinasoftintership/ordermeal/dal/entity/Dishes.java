package com.chinasoftintership.ordermeal.dal.entity;
//菜品
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="dish")
@Getter
@Setter
@ToString
public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishesId;//菜品编号
    private int classifyId;//分类编号
    private String dishesName;//菜名
    private float price;//菜品价格
    private int monthlySale;//月售
    private String introduction;//简介


}
