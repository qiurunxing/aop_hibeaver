package com.qrx.aop_hibeaver.utils;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qrx
 * @date 2018/11/22
 * @time 15:45
 * @description
 */
public class CommonUtil {
    private static final String TAG = "CommonUtil";

    public static Map<String,Long> timeMap = new HashMap<>();

    public static void LogMethodName(String name){
        Log.d("qrx",name);
    }


    public static void LogMethodNameTest(String name){
        CommonUtil.LogMethodName("the_name");
    }

    public static void MethodStart(String name){
        timeMap.put(name,System.currentTimeMillis());
    }

    public static void MethodEnd(String name){
        if (timeMap.get(name) != null) {
            long time = System.currentTimeMillis() - timeMap.remove(name);
            Log.d(TAG, name + "执行时间为" + time);
        }
    }


}
