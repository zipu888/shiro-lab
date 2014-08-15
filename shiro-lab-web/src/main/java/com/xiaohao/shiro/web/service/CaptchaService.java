package com.xiaohao.shiro.web.service;

import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import com.octo.captcha.service.image.ImageCaptchaService;
import java.awt.image.BufferedImage;

/**
 * Created by xiaohao on 2014/8/15.
 */
public class CaptchaService {

    private static ImageCaptchaService instance = new DefaultManageableImageCaptchaService();

    public static BufferedImage getImageChallengeForID(String id){

        BufferedImage bi =instance.getImageChallengeForID(id);

        return bi;
    }
}
