package com.chinasoftintership.ordermeal.web;


import com.chinasoftintership.ordermeal.service.OrderService;

import com.chinasoftintership.ordermeal.service.TablesService;
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
    public Map<String,String> save(Integer tableId, String bookingTime) {
        Map<String,String> result = new HashMap<>();
        try{
            Date yearMonthDay = new Date();
            SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
            bookingTime=spf.format(yearMonthDay)+" "+bookingTime;

            LOGGER.info(" "+tableId+" "+bookingTime);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            ParsePosition parsePosition = new ParsePosition(0);
            Date Strtodate = sdf.parse(bookingTime,parsePosition);
            orderService.save(tableId,Strtodate);
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
}
