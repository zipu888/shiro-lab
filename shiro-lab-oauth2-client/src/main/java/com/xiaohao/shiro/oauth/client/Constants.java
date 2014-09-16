package com.xiaohao.shiro.oauth.client;

/**
 * Created by xiaohao on 2014/9/15.
 */
public class Constants {

    /**
     *
     */
    public static final String appKey="801064960";
    public static final String appSecret="1f202127c7d4d51e7897ea88d3cdbd22";

    public static final String auth_url ="https://open.t.qq.com/cgi-bin/oauth2/authorize?";
    public static final String auth_ok_call_back_url ="http://localhost:9597/shiro-lab-oauth2-client/auth.do";
    public static final String access_token_url ="https://open.t.qq.com/cgi-bin/oauth2/access_token?";
    public static final String access_token_ok_url ="http://localhost:9597/shiro-lab-oauth2-client/access.do";


    /**
     *
     */
    public static final String auth_back_code_param ="code";
    public static final String auth_back_openid_param ="openid";
    public static final String auth_back_openkey_param ="openkey";


    public static final String access_back_access_token_param ="access_token";
    public static final String access_back_expires_in_param ="expires_in";
    public static final String access_back_refresh_token_param ="refresh_token";


    /**
     *
     * @return
     */
    public static String generateAuthUrl(){
        StringBuffer sb = new StringBuffer(auth_url);
        sb.append("client_id=");
        sb.append(appKey);
        sb.append("&");
        sb.append("response_type=code&");
        sb.append("redirect_uri=");
        sb.append(auth_ok_call_back_url);
        return sb.toString();
    }

    /**
     * <p>
     * 构造请求accessToken的请求URL
     * <p/>
     * @param code 用户认证授权后取得的code
     * @return
     */
    public static String generateAccessTokenUrl(String code){
        StringBuffer sb = new StringBuffer(access_token_url);
        sb.append("client_id=");
        sb.append(appKey);

        sb.append("&");
        sb.append("response_type=code&");
        sb.append("client_secret=");
        sb.append(appSecret);

        sb.append("&");


        sb.append("redirect_uri=");
        sb.append(auth_ok_call_back_url);

        sb.append("&grant_type=authorization_code&code=");
        sb.append(code);

        return sb.toString();
    }
}
