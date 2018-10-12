package com.squirrel.websocket.demon.handle;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


/**
 * Date:2018/10/12
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Component
public class MyHandle extends TextWebSocketHandler {



    private Logger logger = LoggerFactory.getLogger(MyHandle.class);


    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("sessionId={},msg={}",session.getId(),message.getPayload());
        session.sendMessage(new TextMessage("返回的数据"));

    }
}
