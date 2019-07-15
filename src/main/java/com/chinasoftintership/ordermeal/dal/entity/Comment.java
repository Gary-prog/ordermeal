package com.chinasoftintership.ordermeal.dal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
@Getter
@Setter
@ToString
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comentId;//评论编号
    private int orderId;
    private String content;
    private int stars;
    private Date commentTime;


}
