package com.xiaohao.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

import javax.print.attribute.standard.JobOriginatingUserName;

/**
 * Created by xiaohao on 2014/8/14.
 * 实现realm接口 需要实现三个方法
 * 采用ini配置文件需要把这个配置到配置文件
 */
public class MyRealm implements Realm {

    //返回唯一的realm名字
    @Override
    public String getName() {
        return "myRealm";
    }

    //判断realm是否支持token
    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        //仅支持usernamepasswordtoken
        return authenticationToken instanceof UsernamePasswordToken;
    }

    //根据token获取认证信息
    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String username =(String)authenticationToken.getPrincipal();

        String password =new String((char[])authenticationToken.getCredentials());

        //开始判断账号密码

        if(!"zhang".equals(username)){
            throw new UnknownAccountException("账号为止");
        }

        if(!"123".equals(password)){
            throw new IncorrectCredentialsException("密码错误");
        }

        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
