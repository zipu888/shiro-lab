package com.xiaohao.shiro.web.filter;

import org.apache.shiro.web.servlet.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by xiaohao on 2014/8/15.
 * 生成验证码的filter
 */
public class JCaptchaFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {

    }



}
