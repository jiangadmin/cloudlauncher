package com.hassmedia.base;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;

import com.jiang.tvlauncher.task.AbstractAsynCallbackTask.TaskCallback;
import com.jiang.tvlauncher.task.AgentRegisterTask;
import com.jiang.tvlauncher.utils.LogUtil;
import com.jiang.tvlauncher.utils.TLID;
import com.jiang.tvlauncher.vip.AbstractAgentKtcpCallback;
import com.jiang.tvlauncher.vip.AgentKtcpFactory;

import java.util.List;

public class HaApp extends Application {
    private static final String TAG = "HaApp";
    private String appId = null;
    private String appKey = null;
    private String tlid = null;
    private String mac = null;
    private static AbstractAgentKtcpCallback agentKtcpCallback;
    private static Context context;

    public HaApp() {
    }

    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        this.tlid = getString("tlid");
        this.appId = getString("appId");
        this.appKey = getString("appKey");
    }

    public String getTlid() {
        return this.tlid;
    }

    public void register(final String appId, final String appKey, String sn, final String mac) {
        LogUtil.d("HaApp", "尝试注册HaApp");
        if (!TextUtils.isEmpty(appId) && !TextUtils.isEmpty(appKey) && !TextUtils.isEmpty(mac)) {
            if (!TextUtils.isEmpty(this.appId) && !TextUtils.isEmpty(this.appKey) && !TextUtils.isEmpty(this.tlid)) {
                LogUtil.d("HaApp", "HaApp 已注册");
                this.registKtcpCallback();
                this.registerCallback(true);
            } else {
                final String tempTlid = TLID.random();
                (new AgentRegisterTask(new TaskCallback() {
                    public void success(Object obj) {
                        LogUtil.d("HaApp", "注册成功");
                        HaApp.this.appId = appId;
                        HaApp.this.appKey = appKey;
                        HaApp.this.tlid = tempTlid;
                        HaApp.this.mac = mac;
                        HaApp.setString("appId", appId);
                        HaApp.setString("appKey", appKey);
                        HaApp.setString("tlid", HaApp.this.tlid);
                        HaApp.setString("mac", mac);
                        HaApp.this.registKtcpCallback();
                        HaApp.this.registerCallback(true);
                    }

                    public void fail(int code, String message) {
                        LogUtil.e("HaApp", "注册失败：code=" + code + ", message=" + message);
                        HaApp.this.registerCallback(false);
                    }
                })).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{appId, appKey, tempTlid, mac});
            }

        } else {
            LogUtil.e("HaApp", "注册接口参数无效：appId=" + appId + ", appKey=" + appKey + ", sn=" + sn + ", mac=" + mac);
            throw new IllegalArgumentException("params code or mac is null");
        }
    }

    private void registKtcpCallback() {
        if (agentKtcpCallback == null) {
            agentKtcpCallback = AgentKtcpFactory.getInstance().getKtcpPaySDKCallback(this, this.tlid);
        }

    }

    public void registerCallback(boolean success) {
        LogUtil.e("HaApp", "注册：" + success);
    }

    public static void startTlVideo(Activity activity, String outTradeNo) {
        startTlVideo(activity, outTradeNo, (String) null);
    }

    public static void startTlVideo(Activity activity, String outTradeNo, String schema) {
        if (TextUtils.isEmpty(outTradeNo)) {
            LogUtil.e("HaApp", "三方交易单号为空");
            throw new NullPointerException("交易单号为空");
        } else if (agentKtcpCallback == null) {
            LogUtil.e("HaApp", "ktcp callback 为空");
            throw new RuntimeException("请先注册");
        } else {
            try {
                agentKtcpCallback.setOutTradeNo(outTradeNo);
                Intent intent;
                if (schema != null && schema.length() > 0) {
                    intent = new Intent();
                    intent.setData(Uri.parse(schema));
                    intent.setAction("com.tencent.qqlivetv.open");
                    intent.setFlags(268435456);
                    intent.setPackage("com.ktcp.tvvideo");
                    List<ResolveInfo> activities = context.getPackageManager().queryIntentActivities(intent, 0);
                    if (activities != null && !activities.isEmpty()) {
                        context.startActivity(intent);
                    }
                } else {
                    intent = new Intent(activity.getPackageManager().getLaunchIntentForPackage("com.ktcp.tvvideo"));
                    activity.startActivity(intent);
                }

            } catch (Exception var5) {
                LogUtil.e("HaApp", "拉起腾讯视频失败:" + var5.getMessage());
                throw new RuntimeException(var5.getMessage());
            }
        }
    }

    public static void setString(String key, String value) {
        SharedPreferences settings = context.getSharedPreferences("com.jiang.tvlauncher", 0);
        Editor editor = settings.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(String key) {
        SharedPreferences settings = context.getSharedPreferences("com.jiang.tvlauncher", 0);
        return settings.getString(key, (String) null);
    }
}

