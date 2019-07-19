package com.chinasoftintership.ordermeal.service.impl;

import com.chinasoftintership.ordermeal.dal.ClassifyRepo;
import com.chinasoftintership.ordermeal.dal.entity.Classify;
import com.chinasoftintership.ordermeal.service.ClassifyService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class ClassifyServiveImpl implements ClassifyService {
    @Autowired
    private ClassifyRepo classifyRepo;
    @Override
    public JsonObject Selectclassify() {
        JsonObject jsonObject = new JsonObject();
     try {
         JsonArray array = new JsonArray();
         List<Classify> list = classifyRepo.findAll();
         for (Classify classify: list){
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.addProperty("classificationId",classify.getClassifyId());
             jsonObject1.addProperty("classification",classify.getClassification());
             array.add(jsonObject1);
     }
         jsonObject.add("data",array);
         jsonObject.addProperty("msg","success");
         System.out.println(jsonObject.toString());
         return  jsonObject;
     }catch (RuntimeException e){
         e.printStackTrace();
         jsonObject.addProperty("msg","fail");
         return jsonObject;
     }
    }
}
