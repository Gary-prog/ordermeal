package com.chinasoftintership.ordermeal.dal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="user")
@Getter
@Setter
@ToString
public class User {
    @Id
    private String openId;
    private String userName;
    private Integer sex;
    private String city;
    private String headPortrait;


}
