package com.squirrel.websocket.demon.config;

import com.squirrel.websocket.demon.handle.MyHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.sockjs.frame.Jackson2SockJsMessageCodec;

/**
 * Date:2018/10/12
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Configuration
@EnableWebSocket
public class DemonConfig implements WebSocketConfigurer {



    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(myHandle(),"/myHandler")
            .setAllowedOrigins("*");

        webSocketHandlerRegistry.addHandler(myHandle(),"/myHandlerSockjs").setAllowedOrigins("*")
                .withSockJS().setMessageCodec(new Jackson2SockJsMessageCodec());
    }


    @Bean
    public WebSocketHandler myHandle(){
        return new MyHandle();
    }
}
