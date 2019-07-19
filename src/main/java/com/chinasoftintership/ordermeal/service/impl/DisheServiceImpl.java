package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.DisheRepo;
import com.chinasoftintership.ordermeal.dal.entity.Dishes;
import com.chinasoftintership.ordermeal.service.DisheService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisheServiceImpl implements DisheService
{
    @Autowired
    private DisheRepo disheRepo;

    @Override
    public JsonObject Selectdishes() {
        JsonObject object1 = new JsonObject();
        try{
        JsonArray array = new JsonArray();
        List<Dishes> list = disheRepo.findAll();
        for (Dishes dishes : list){
            JsonObject object = new JsonObject();
            object.addProperty("dishId",dishes.getDishesId());
            object.addProperty("classificationId",dishes.getClassifyId());
            object.addProperty("dishName",dishes.getDishesName());
            object.addProperty("price",dishes.getPrice());
            object.addProperty("monthlySale",dishes.getMonthlySale());
            object.addProperty("img",dishes.getIntroduction());
            object.addProperty("count",0);
            array.add(object);
        }
         object1.add("data",array);
         object1.addProperty("msg","success");
        return object1;
        } catch (RuntimeException e){
            e.printStackTrace();
            object1.addProperty("msg","fail");
            return object1;
        }
    }
}
