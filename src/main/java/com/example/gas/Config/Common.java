package com.example.gas.Config;

import java.text.DecimalFormat;

public class Common {
    public   static final int USERPAGESIZE=15;
    public  static final int DEVICEPAGESIZE=15;
    public static final int STATIONPAGESIZE = 10;
    public static int UUID(){
        java.util.Random r=new java.util.Random();
        //如生成的随机位数不足6位则自动加零补充
        DecimalFormat g=new DecimalFormat("100");
        //返回时间增量+随机数的序列
        String uuid=String.format("%s%s",System.currentTimeMillis(),g.format(r.nextInt(100)));
        return  Integer.parseInt(uuid.trim());
    }
}
