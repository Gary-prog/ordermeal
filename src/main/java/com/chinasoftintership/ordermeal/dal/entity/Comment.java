package com.chinasoftintership.ordermeal.dal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comentId;//评论编号
    private int orderId;
    private String content;
    private int stars;
    private Date commentTime;

    public int getComentId() {
        return comentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getContent() {
        return content;
    }

    public int getStars() {
        return stars;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setComentId(int comentId) {
        this.comentId = comentId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comentId=" + comentId +
                ", orderId=" + orderId +
                ", content='" + content + '\'' +
                ", stars=" + stars +
                ", commentTime=" + commentTime +
                '}';
    }
}
