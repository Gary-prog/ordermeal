package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;

import java.awt.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String user_name;
    private String sex;
    private String city;
    private String head_portrait;

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    public String getHead_portrait() {
        return head_portrait;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHead_portrait(String head_portrait) {
        this.head_portrait = head_portrait;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", head_portrait=" + head_portrait +
                '}';
    }
}
