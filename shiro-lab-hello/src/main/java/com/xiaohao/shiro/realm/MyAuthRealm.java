package com.xiaohao.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by xiaohao on 2014/8/14.
 *
 *      org.apache.shiro.realm.text.IniRealm ini文件记录
 *      org.apache.shiro.realm.text.PropertiesRealm properties文件记录
 *      org.apache.shiro.realm.jdbc.JdbcRealm 查询sql
 *
 */
public class MyAuthRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
