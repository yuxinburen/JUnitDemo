package com.davie.junitdemo;

import java.util.zip.InflaterInputStream;

/**
 * User: davie
 * Date: 15-4-16
 */
public class StringUtils {

    public static boolean isEmpty(String s){
        boolean bret = true;

        if(s!=null&&s.length()>0){
            bret = false;
        }

        return bret;
    }

    public static String[] splitString(String content,String de){
        String [] ret = null;
        if(content!=null&&de!=null){
            ret = content.split(de);
        }
        return ret;
    }
}
