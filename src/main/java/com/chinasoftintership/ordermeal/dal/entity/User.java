package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    private String openId;
    private String userName;
    private Integer sex;
    private String city;
    private String headPortrait;

    public String getOpenId() {
        return openId;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSex(Integer sex) {
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
                "openId=" + openId +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", headPortrait=" + headPortrait +
                '}';
    }
}
