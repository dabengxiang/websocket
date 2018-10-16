package com.squirrel.websocket.stomp;

import java.security.Principal;

/**
 * Date:2018/10/16
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
public class MyPrincipal implements Principal {

    private String name;

    public MyPrincipal(String name) {
        this.name = name;
    }

    public MyPrincipal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
