package com.chinasoftintership.ordermeal.web;

import com.chinasoftintership.ordermeal.service.CommentService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/comment/get",produces="application/json;charset=UTF-8")
    public String commetGet()
    {
        return commentService.select().toString();

    }
}
