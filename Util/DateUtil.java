package com.jovision.jaws.oas.util;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * RFC 3339  时间工具类
 * @author xianfeng
 * @version 1.0
 * @date 2019/12/21 13:42
 */

public class DateUtil {
    public static String YYYY = "yyyy";

    public static String YYYY_MM = "yyyy-MM";

    public static String YYYY_MM_DD = "yyyy-MM-dd";

    public static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";


    public static String getYYYY(String date){
        return getTime(date,YYYY);
    }

    public static String getYYYY_MM(String date){
        return getTime(date,YYYY_MM);
    }

    public static String getYYYYMMDDHHMMSS(String date){
        return getTime(date,YYYYMMDDHHMMSS);
    }

    public static String getYYYY_MM_DD(String date){
        return getTime(date,YYYY_MM_DD);
    }

    public static String getYYYY_MM_DD_HH_MM_SS(String date){
        return getTime(date,YYYY_MM_DD_HH_MM_SS);
    }


    public static String getTime(String date,final String format) {
        //DateTime自动转化时区
        DateTime dateTime = new DateTime(date);

        //转化为时间戳
        Long result = dateTime.toCalendar(Locale.getDefault()).getTimeInMillis();
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(result);
    }
}
