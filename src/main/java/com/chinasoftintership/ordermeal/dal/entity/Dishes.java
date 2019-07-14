package com.chinasoftintership.ordermeal.dal.entity;
//菜品
import javax.persistence.*;

@Entity
@Table(name="dish")

public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishesId;//菜品编号
    private int classifyId;//分类编号
    private String dishesName;//菜名
    private float price;//菜品价格
    private int monthlySale;//月售
    private String introduction;//简介

    public int getDishesId() {
        return dishesId;
    }

    public int getClassifyId() {
        return classifyId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public float getPrice() {
        return price;
    }

    public int getMonthlySale() {
        return monthlySale;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setDishesId(int dishesId) {
        this.dishesId = dishesId;
    }

    public void setClassifyId(int classifyId) {
        this.classifyId = classifyId;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMonthlySale(int monthlySale) {
        this.monthlySale = monthlySale;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "dishesId=" + dishesId +
                ", classifyId=" + classifyId +
                ", dishesName='" + dishesName + '\'' +
                ", price=" + price +
                ", monthlySale=" + monthlySale +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
