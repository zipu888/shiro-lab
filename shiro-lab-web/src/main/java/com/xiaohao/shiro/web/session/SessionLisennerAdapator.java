package com.xiaohao.shiro.web.session;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;

/**
 * Created by xiaohao on 2014/8/15.
 * 集成一个这个类 我们就不用重写三个方法 而只需要重写自己需要的方法
 */
public class SessionLisennerAdapator extends SessionListenerAdapter {

    @Override
    public void onStart(Session session) {
        super.onStart(session);
    }

    @Override
    public void onStop(Session session) {
        super.onStop(session);
    }

    @Override
    public void onExpiration(Session session) {
        super.onExpiration(session);
    }
}
