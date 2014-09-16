package com.xiaohao.shiro.oauth.client.servlet;

import com.xiaohao.shiro.oauth.client.Constants;
import com.xiaohao.shiro.oauth.client.Util;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by xiaohao on 2014/9/15.
 */
public class AuthOkServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AuthOkServlet");

        String code = req.getParameter(Constants.auth_back_code_param);

        String openid = req.getParameter(Constants.auth_back_openid_param);

        String openKey = req.getParameter(Constants.auth_back_openkey_param);

        System.out.println("code :" + code);
        System.out.println("openid :" + openid);
        System.out.println("openkey :" + openKey);

        req.setAttribute("code", code);
        req.setAttribute("code", code);
        req.setAttribute("code", code);

        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setContentCharset("UTF-8");
        HttpMethod method = new PostMethod(Constants.generateAccessTokenUrl(code));
        int status = httpClient.executeMethod(method);
        if (status == 200) {
            String body = method.getResponseBodyAsString();
            Map<String, String> map = Util.parseAccessToken(body);
            if (map != null && map.get("accessToken") != null) {
                req.getSession().setAttribute("token", map.get("accessToken"));
                req.getSession().setAttribute("authMap",map);
                resp.sendRedirect("invalidSession.jsp");
            }
        }

    }

}
