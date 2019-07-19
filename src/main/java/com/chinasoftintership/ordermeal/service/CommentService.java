package com.chinasoftintership.ordermeal.service;

import com.google.gson.JsonObject;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface CommentService {
    void save(Integer orderId, String content,int star);
    JsonObject select();


}
