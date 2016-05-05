package com.edu.feicui.ck.utils;

import android.util.Log;

/**
 * Created by 16245 on 2016/05/04.
 */
public class LogUtil {
    public static boolean isOpenDebug = true;
    public static boolean isOpenWarn = true;
    public static void d(String tag,String msg){
        if (isOpenDebug) {
            Log.d(tag, msg);
        }
    }
    public static void w(String tag, String msg) {
        if (isOpenWarn) {
            Log.w(tag, msg);
        }
    }
}
