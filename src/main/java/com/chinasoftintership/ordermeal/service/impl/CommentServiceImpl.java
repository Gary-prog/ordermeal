package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.CommentRepo;
import com.chinasoftintership.ordermeal.dal.OrderRepo;
import com.chinasoftintership.ordermeal.dal.entity.Comment;
import com.chinasoftintership.ordermeal.dal.entity.Order;
import com.chinasoftintership.ordermeal.service.CommentService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service

public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private OrderRepo orderRepo;

    private final static Logger LOGGER = LoggerFactory.getLogger(CommentServiceImpl.class);
    @Override
    public void save(Integer orderId, String content, int star) {
        Comment comment = new Comment();
        Order order = orderRepo.findByOrderId(orderId).get(0);
        Date date = new Date();
        comment.setOrderId(orderId);
        comment.setCommentTime(date);
        comment.setContent(content);
        comment.setStars(star);
        order.setOrderStatus("已完成");
        orderRepo.save(order);
        commentRepo.save(comment);

    }

    @Override
    public JsonObject select() {
        JsonObject returnObject = new JsonObject();

        JsonArray array = new JsonArray();

        returnObject.addProperty("msg","success");
        List<Object> list = commentRepo.select();

        for (int i = 0; i < list.size(); i++) {
            JsonObject object = new JsonObject();
            Object[] objarray = (Object[]) list.get(i);
            object.addProperty("stars", (int)(objarray[0]));
            SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
            String date = sp.format(objarray[1]);
            object.addProperty("commentTime", date);

            object.addProperty("content", String.valueOf(objarray[2]));
            object.addProperty("headPortrait", String.valueOf(objarray[3]));
            object.addProperty("userName", String.valueOf(objarray[4]));
            array.add(object);
        }
        returnObject.add("data",array);
        System.out.println("3333"+returnObject.toString());
        return returnObject;
    }
}
