package com.xiaohao.shiro.web.servlet;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiaohao on 2014/8/14.
 */
@WebServlet(name = "login",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method =req.getMethod();
        if("GET".equals(method)){
            //get
            req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,resp);
        }else if("POST".equals(method)){
            //post
            String name =req.getParameter("name");
            String password =req.getParameter("password");

            Subject subject =SecurityUtils.getSubject();

            UsernamePasswordToken token = new UsernamePasswordToken(name,password);

            String error =null;

            try {
                subject.login(token);
            }catch (UnknownAccountException e) {
                error ="用户名/密码错误";
            }catch (IncorrectCredentialsException e) {
                error ="用户名/密码错误";
            }catch (AuthenticationException e) {
                //其他错误，比如锁定，如果想单独处理请单独 catch 处理
                error ="其他错误：" +e.getMessage();
            }

            if(error!=null){
                req.setAttribute("msg",error);
                req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,resp);
            }else {

                req.getRequestDispatcher("/WEB-INF/jsp/login_ok.jsp").forward(req,resp);

            }


        }
    }
}
