package com.xiaohao.shiro.oauth.client.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaohao on 2014/9/15.
 */
public class AccessTokenOkServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("access ok url:"+req.getRequestURL());
        String token =req.getParameter("access_token ");
        System.out.println("token"+token);
        req.getRequestDispatcher("/WEB-INF/jsp/login_ok.jsp").forward(req,resp);
    }
}
