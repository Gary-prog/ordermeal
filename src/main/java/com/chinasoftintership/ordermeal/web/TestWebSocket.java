package com.chinasoftintership.ordermeal.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/desks")
@RestController
public class TestWebSocket {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestWebSocket.class);

    private static volatile int onlineCount = 0;
    private Session session;
    private static CopyOnWriteArraySet<TestWebSocket>webSockets = new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(Session session)throws Exception
    {
        this.session = session;
        webSockets.add(this);
        addOnlineCount();
        //System.out.println(getOnlineCount());
        LOGGER.info("当前人数: "+getOnlineCount());
        LOGGER.info("sessionId: "+session.getId());
    }

    @OnMessage
    public void onMessage(String message)
    {
//        JsonObject object = new JsonParser().parse(message).getAsJsonObject();
//        LOGGER.info(object.toString());
        LOGGER.info("消息: "+message);
        for(TestWebSocket socket:webSockets)
        {
            try{
                socket.sendMessage(message);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    @OnClose
    public void onClose()
    {
        subOnlineCount();
        webSockets.remove(this);
        LOGGER.info("当前人数 onlineCount={}",onlineCount);
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

    public void sendMessage(String message)throws IOException{
        this.session.getBasicRemote().sendText(message);
    }

    public static void sendInfo()throws Exception{

    }
}