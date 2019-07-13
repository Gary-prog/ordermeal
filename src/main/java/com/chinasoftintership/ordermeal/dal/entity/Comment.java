package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coment_id;//评论编号
    private int order_id;
    private String content;
    private int stars;
    private Date comment_time;

    public int getComent_id() {
        return coment_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getContent() {
        return content;
    }

    public int getStars() {
        return stars;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComent_id(int coment_id) {
        this.coment_id = coment_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "coment_id=" + coment_id +
                ", order_id=" + order_id +
                ", content='" + content + '\'' +
                ", stars=" + stars +
                ", comment_time=" + comment_time +
                '}';
    }
}
