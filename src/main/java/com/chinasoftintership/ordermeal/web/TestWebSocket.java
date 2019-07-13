package com.chinasoftintership.ordermeal.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/desks")
@RestController
public class TestWebSocket {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestWebSocket.class);

    private static volatile int onlineCount = 0;
    private Session session;
    private static CopyOnWriteArraySet<TestWebSocket>webSockets = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen()throws Exception
    {
//        this.session = session;
//        webSockets.add(this);
        addOnlineCount();
        //System.out.println(getOnlineCount());
        LOGGER.info("open "+getOnlineCount());
    }

    @OnMessage
    public void onMessage(String message,Session session)
    {
        LOGGER.info("消息: "+message);
    }

    @OnClose
    public void onClose()
    {

    }

    @OnError
    public void onError(Throwable error)
    {
        LOGGER.error("连接错误",error);
    }

    public synchronized static void addOnlineCount()
    {
        onlineCount++;
    }

    public synchronized static void subOnlineCount()
    {
        onlineCount--;
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
}

    }