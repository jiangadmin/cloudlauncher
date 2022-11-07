package com.hassmedia.base;

import android.app.Activity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hassmedia.base.constans.Constants;
import com.hassmedia.base.tools.Systemutil;
import com.jiang.tvlauncher.TlApp;

public class HsApplication extends TlApp {

    private static HsApplication instance;
    private static final String TAG = "hassmedia";

    public static HsApplication instance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CrashHandler.getInstance().init(this, TAG);

        //阿里路由相关
        ARouter.openLog();     // Print log
        ARouter.openDebug();
        ARouter.init(this);

        String sn = Systemutil.getSerialNumbers();
        String mac = Systemutil.getLanMacAddress();

        //注册
//        register(Constants.TL_APP_ID, Constants.TL_APP_KEY, sn, mac);
        register("829514600713297921", "4731bd0728204274a4ef1a5366a55f56", "00:00:00:00:02:01","00:00:00:00:02:01");

    }

    //打开腾讯播放器

    // outTradeNo 付款订单号   schema 隐式调用
    public void startTlQTV(Activity activity, String outTradeNo, String schema) {
        startTlVideo(activity, outTradeNo, schema);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }

}
