package com.chinasoftintership.ordermeal.web;


import com.chinasoftintership.ordermeal.dal.entity.Dishes;
import com.chinasoftintership.ordermeal.service.OrderService;

import com.chinasoftintership.ordermeal.service.TablesService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private TablesService tablesService;
    private final static Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping("/desks/post")
    @ResponseBody
    public Map<String,String> save(Integer tableId, Integer peopleNumber,String bookingTime) {
        Map<String,String> result = new HashMap<>();
        try{
            Date yearMonthDay = new Date();
            SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
            bookingTime=spf.format(yearMonthDay)+" "+bookingTime;

            LOGGER.info(" "+tableId+" "+bookingTime);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            ParsePosition parsePosition = new ParsePosition(0);
            Date Strtodate = sdf.parse(bookingTime,parsePosition);
            orderService.save(tableId,peopleNumber,Strtodate);
            tablesService.setStatus(tableId);
            result.put("msg","success");
            return result;

        }
        catch (RuntimeException e){
            e.printStackTrace();
            result.put("msg","fail");
            return result;
        }
    }

    @RequestMapping(value = "/order/get",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String select(String openId){

        return orderService.Select(openId).toString();

    }

    @RequestMapping(value = "/orderdetail/get",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String Select2(Integer orderId){

        return orderService.Select2(orderId).toString();
    }
    @RequestMapping(value = "/order/post",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String save2(String openId, Integer tableId, Integer count, float totalPrice, Integer[] dishIds,Integer[] counts){
        JsonObject object = new JsonObject();
        try {
         orderService.save2(openId,tableId,count,totalPrice,dishIds,counts);
            object.addProperty("msg","success");
            System.out.println(object.toString());
            return object.toString();
          }catch (RuntimeException e)
        {
        e.printStackTrace();
        object.addProperty("msg","fail");
        return object.toString();
    }
    }
}

