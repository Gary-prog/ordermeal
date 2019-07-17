package com.chinasoftintership.ordermeal.dal;

import com.chinasoftintership.ordermeal.dal.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,Integer> {
    @Query(nativeQuery = true,value = "select c.stars,c.comment_time,c.content,u.head_portrait,u.user_name from orders o,comment c,user u where o.open_id = u.open_id and o.order_id = c.order_id")
    List<Object> select();
}
