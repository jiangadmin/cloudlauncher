package com.hassmedia.base.tools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by chengchuanyi on 2022/1/26 0026 下午 2:53
 */
public class NetUtils {
    private final String TAG = "NetUtils";

    /**
     * 用户是否连接网络
     *
     * @param context Context
     */
    public static boolean isNetConnection(Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isAvailable());
    }

    /**
     * 判断当前网络有没有联网
     * 并且判断是有线还是无线
     * <p>
     * 0:无网络连接
     * 1：有线网络
     * 2：无线网络
     *
     * @return
     */
    public static int getNetMode(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        if (info == null) {
            return 0;
        }
        boolean iscon = info.isAvailable();
        //Log.e(TAG, "网络连接 =" + iscon + "，连接方式：" + info.getType() + " ," + info.getTypeName());
        if (!iscon) {
            return 0;
        }
        if (info.getType() == ConnectivityManager.TYPE_ETHERNET) {
            return 1;
        } else if (info.getType() == ConnectivityManager.TYPE_WIFI) {
            return 2;
        } else {
            return 0;
        }
    }
}
