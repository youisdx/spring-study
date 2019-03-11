package com.spring.Image;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class jianshu {
    public static void main(String[] args) {
        QrConfig config =new QrConfig(300,300);
        config.setMargin(3);
        config.setImg("e:/2.png");
        Color foreColor = new Color(87, 174, 228);
        Color bgColor =new Color(255, 250, 227);
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();
//        设置前景色
         config.setForeColor(foreColorRGB);
//         设置背景色
         config.setBackColor(bgColorRGB);
//         生成二维码到文件，也可以到流
        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/997fa4d92222", //二维码内容

               config, FileUtil.file("e:/qrcodeWithLogo.jpg")//写出到的文件
        );

    }

}
