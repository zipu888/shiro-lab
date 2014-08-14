package com.xiaohao.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.Realm;

/**
 * Created by xiaohao on 2014/8/14.
 * 实现realm接口 需要实现三个方法
 */
public class MyRealm implements Realm {

    //返回唯一的realm名字
    @Override
    public String getName() {
        return null;
    }

    //判断realm是否支持token
    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return false;
    }

    //根据token获取认证信息
    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
