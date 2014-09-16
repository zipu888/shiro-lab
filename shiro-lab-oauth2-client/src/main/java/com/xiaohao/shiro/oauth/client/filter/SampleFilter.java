package com.xiaohao.shiro.oauth.client.filter;

import com.xiaohao.shiro.oauth.client.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaohao on 2014/9/15.
 */
public class SampleFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest request =(HttpServletRequest)servletRequest;
        int index =request.getRequestURL().toString().indexOf("auth.do");
        int aindex =request.getRequestURL().toString().indexOf("access.do");
        if(index>0||aindex>0){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            String token =(String)request.getSession().getAttribute("token");
            if(token!=null&&!token.equals("")){
                filterChain.doFilter(servletRequest,servletResponse);
            }else {
                HttpServletResponse response =(HttpServletResponse) servletResponse;
                response.sendRedirect(Constants.generateAuthUrl());
            }
        }

    }

    @Override
    public void destroy() {

    }
}
