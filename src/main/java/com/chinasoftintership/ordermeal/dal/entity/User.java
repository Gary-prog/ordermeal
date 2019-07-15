package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String sex;
    private String city;
    private String headPortrait;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", headPortrait=" + headPortrait +
                '}';
    }
}
