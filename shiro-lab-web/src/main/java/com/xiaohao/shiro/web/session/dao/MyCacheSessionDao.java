package com.xiaohao.shiro.web.session.dao;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import java.io.Serializable;

/**
 * Created by xiaohao on 2014/8/15.
 */
public class MyCacheSessionDao extends CachingSessionDAO {


    @Override
    protected void doUpdate(Session session) {

    }

    @Override
    protected void doDelete(Session session) {

    }

    @Override
    protected Serializable doCreate(Session session) {
        return null;
    }

    @Override
    protected Session doReadSession(Serializable serializable) {
        return null;
    }
}
