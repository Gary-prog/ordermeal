package com.chinasoftintership.ordermeal.component;

import com.chinasoftintership.ordermeal.web.TestWebSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnterWebInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnterWebInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String origin = request.getHeader("Origin");

        String ip = request.getScheme()+"://"+request.getRemoteAddr()+":4200";
        // 表明它允许"http://xxx"发起跨域请求
        response.setHeader("Access-Control-Allow-Origin",
                origin);
        // 表明在xxx秒内，不需要再发送预检验请求，可以缓存该结果
        response.setHeader("Access-Control-Allow-Methods",
                "POST, GET, DELETE, PUT");
        // 表明它允许xxx的外域请求
        response.setHeader("Access-Control-Max-Age",
                "3628800");
        // 表明它允许跨域请求包含xxx头
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept");
        // 证书
        response.setHeader("Access-Control-Allow-Credentials","true");
        LOGGER.info("拦截");
        return true;
    }
}
