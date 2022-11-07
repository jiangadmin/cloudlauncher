package com.hassmedia.base.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

public class AppUtils {
    /***
     * 获取APP版本
     * @param context
     * @return
     */
    public static String getAppVersionName(Context context){
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        String versionName ="";
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            versionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return TextUtils.isEmpty(versionName)?"":versionName;
    }
}
