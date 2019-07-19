package com.chinasoftintership.ordermeal.web;

import com.chinasoftintership.ordermeal.service.CommentService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/comment/get", produces = "application/json;charset=UTF-8")
    public String commetGet() {
        return commentService.select().toString();

    }
    @RequestMapping("/comment/post")
    @ResponseBody
    public String save(Integer orderId, String content,int star) {
        JsonObject object = new JsonObject();

        try {
            commentService.save(orderId,content,star);
            object.addProperty("msg", "success");
            return object.toString();
        }catch (RuntimeException e){
            e.printStackTrace();
            object.addProperty("msg","fail");
            return object.toString();
        }
    }
}