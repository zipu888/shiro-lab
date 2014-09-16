package com.xiaohao.shiro.oauth.client;

import java.util.HashMap;

/**
 * Created by xiaohao on 2014/9/16.
 */
public class Util {

    public static HashMap parseAccessToken(String responseBody){

        String[] tokenArray = responseBody.split("&");

        if (tokenArray.length < 2) {
            return null;
        }

        String tmpStr;
        HashMap<String,String> hashMap = new HashMap<String, String>();
        for(int i=0;i<tokenArray.length;i++){
            if (tokenArray[i].startsWith("access_token=")){
                tmpStr=tokenArray[i].substring(tokenArray[i].indexOf('=')+1, tokenArray[i].length());
                if(tmpStr==null||"".equals(tmpStr)){
                    return null;
                }
                hashMap.put("accessToken",tmpStr);
            }
            if (tokenArray[i].startsWith("expires_in=")){
                tmpStr=tokenArray[i].substring(tokenArray[i].indexOf('=')+1, tokenArray[i].length());
                if(tmpStr==null||"".equals(tmpStr)){
                    return null;
                }
                hashMap.put("expires",tmpStr);
            }
            if (tokenArray[i].startsWith("nick")){
                tmpStr=tokenArray[i].substring(tokenArray[i].indexOf('=')+1, tokenArray[i].length());
                if(tmpStr==null||"".equals(tmpStr)){
                    return null;
                }
                hashMap.put("nick",tmpStr);
            }
        }
        return hashMap;
    }

}
