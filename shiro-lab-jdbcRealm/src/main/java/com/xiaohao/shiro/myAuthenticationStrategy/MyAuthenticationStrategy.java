package com.xiaohao.shiro.myAuthenticationStrategy;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.realm.Realm;

import java.util.Collection;

/**
 * Created by xiaohao on 2014/8/14.
 * 实现AuthenticationStrategy 接口 实现自己的逻辑
 */
public class MyAuthenticationStrategy implements AuthenticationStrategy {

    //所有realm验证前
    @Override
    public AuthenticationInfo beforeAllAttempts(Collection<? extends Realm> realms, AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }

    //每个realm验证前
    @Override
    public AuthenticationInfo beforeAttempt(Realm realm, AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) throws AuthenticationException {
        return null;
    }

    //每个realm验证后
    @Override
    public AuthenticationInfo afterAttempt(Realm realm, AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo, AuthenticationInfo authenticationInfo2, Throwable throwable) throws AuthenticationException {
        return null;
    }

    //所有realm验证后
    @Override
    public AuthenticationInfo afterAllAttempts(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) throws AuthenticationException {
        return null;
    }
}
