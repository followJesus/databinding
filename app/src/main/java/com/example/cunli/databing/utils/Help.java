package com.example.cunli.databing.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by cunli on 16-8-17.
 */
public class Help {


    //    private final String BASEURL = "http://192.168.1.108:8080/";
//    private final String BASEURL = "http://10.42.0.1:8080/";
    private final static String BASEURL = "http://192.168.1.113:8080/";

    /**
     *  把 时间格式日期 转换成 字符串格式日期
     */
    public static String formatDateToString(Date date) {
        String str = "";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            str = simpleDateFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 把 字符串格式日期 转换成 时间格式日期
     */
    public static Date formatStringToDate(String str) {
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date = simpleDateFormat.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    //去服务器获取数据
    public static Retrofit connectionService(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL) //指定访问的IP地址
                .addConverterFactory(GsonConverterFactory.create())//指定以哪种格式解析接收到的数据
                .build();
        return  retrofit;
    }
}
