package com.example.cwgl.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    /*
    * 打印时间：日志
    * */
    public static void log(String msg){
        if (Config.ENABLE_CUSTOMEIZE_LOG){
            System.out.println(dateToStr(null) +" : "+msg);
        }
    }
    /*
    * 日期转字符串
    * */
    public static String dateToStr(Date date){
        if (date==null){
            date = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
