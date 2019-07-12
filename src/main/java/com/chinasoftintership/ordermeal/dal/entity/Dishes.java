package com.chinasoftintership.ordermeal.dal.entity;
//菜品
import javax.persistence.*;

@Entity
@Table(name="dish")

public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishes_id;//菜品编号
    private int classify_id;//分类编号
    private String dishes_name;//菜名
    private float price;//菜品价格
    private int monthly_sale;//月售
    private String introduction;//简介

    public int getDishes_id() {
        return dishes_id;
    }

    public int getClassify_id() {
        return classify_id;
    }

    public String getDishes_name() {
        return dishes_name;
    }

    public float getPrice() {
        return price;
    }

    public int getMonthly_sale() {
        return monthly_sale;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setDishes_id(int dishes_id) {
        this.dishes_id = dishes_id;
    }

    public void setClassify_id(int classify_id) {
        this.classify_id = classify_id;
    }

    public void setDishes_name(String dishes_name) {
        this.dishes_name = dishes_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMonthly_sale(int monthly_sale) {
        this.monthly_sale = monthly_sale;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "dishes_id=" + dishes_id +
                ", classify_id=" + classify_id +
                ", dishes_name='" + dishes_name + '\'' +
                ", price=" + price +
                ", monthly_sale=" + monthly_sale +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
