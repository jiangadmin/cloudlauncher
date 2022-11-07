package com.hassmedia.qtv;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hassmedia.base.HsApplication;
import com.hassmedia.base.arouter.ArConstants;
import com.hassmedia.base.constans.Constants;
import com.hassmedia.base.tools.PtrCLog;
import com.hassmedia.base.ui.BaseActivity;

import java.util.List;

import broadcast.TvBroadcastReceiver;
import broadcast.TvConstants;

@Route(path = ArConstants.TvActivity)
public class TvActivity extends BaseActivity implements View.OnClickListener {

    private final String TAG = TvActivity.class.getSimpleName();
    @Override
    public int getResourceId() {
        return R.layout.activity_tv;
    }

    @Override
    protected void initWidgets() {
        findViewById(R.id.queryBtn).setOnClickListener(this);
        findViewById(R.id.startPlayBtn).setOnClickListener(this);
        findViewById(R.id.stopPlayBtn).setOnClickListener(this);
        findViewById(R.id.nextPlayBtn).setOnClickListener(this);
        findViewById(R.id.loginStatus).setOnClickListener(this);
        findViewById(R.id.playQueryBtn).setOnClickListener(this);
        findViewById(R.id.playControlBtn).setOnClickListener(this);
        findViewById(R.id.openTxBtn).setOnClickListener(this);
        new TvBroadcastReceiver(this);
    }

    @Override
    public void onClick(View v) {
       int rId = v.getId();
       if (rId == R.id.queryBtn){  //通用广播查询
           Intent intent = new Intent(TvConstants.query_req_action);
           intent.putExtra("type",3);
           intent.putExtra("action",1);
           sendBroadcast(intent);
       }else if (rId == R.id.startPlayBtn){//进入播放器
           Intent intent = new Intent(TvConstants.player_start);

           //从腾讯的接口获取
           String cid = "视频专辑";
           String vid = "视频vid";

           intent.putExtra("cid",cid);
           intent.putExtra("vid",vid);
           sendBroadcast(intent);
       }else if (rId == R.id.stopPlayBtn){ //退出播放器
           Intent intent = new Intent(TvConstants.player_stop);
           sendBroadcast(intent);
       }else if (rId == R.id.nextPlayBtn){ //自动开始播放下一集
           Intent intent = new Intent(TvConstants.player_next);

           int index = 1; //从1开始，1标识第1集
           String videoId = "视频id";

           intent.putExtra("index",index);
           intent.putExtra("videoId ",videoId);
           sendBroadcast(intent);
       }else if (rId == R.id.loginStatus){ //播放查询
           Intent intent = new Intent(TvConstants.login_req_action);
           sendBroadcast(intent);
       }else if (rId == R.id.playQueryBtn) {  //播放查询接口定义

           Intent intent = new Intent(TvConstants.play_req_action);

           int type = 1;  //1.查询播放状态  2.查询播放视频总时长  3.查询当前时间点
           String from = "hassmedia";  //来源，用于统计

           intent.putExtra("type",type);
           intent.putExtra("from",from);
           sendBroadcast(intent);
       }else if (rId == R.id.playControlBtn){ //播放控制接口
           Intent intent = new Intent(TvConstants.control_play_req_action);

           //1.播放、暂停、重播、退出  2.快进、快退 3.定位控制 4.音量控制 5.选集控制
           int type = 1;

           //播放、暂停、重播、退出   1：播放；2：暂停；3:重播；4.退出。（必填字段）
           //快进与快退    1：快进；  2：快退。（必填字段）
           //音量控制      1：增大音量；2：减小音量；3：静音；4：取消静音。（必填字段）
           //选集控制      1：上一集；2：下一集；3：指定播放某一集。// （必填字段）
           int sub_type = 1;

           // 定位控制
           int time = 100; //单位秒，标识定位到视频的某个时间点。（必填字段）

           int index = 1;  //从0开始，0标识第1集；（选填字段，sub_type为3时必填）

           intent.putExtra("type",type);
           intent.putExtra("sub_type",sub_type);
           //intent.putExtra("time",time);
           //intent.putExtra("index",index);
           sendBroadcast(intent);
       }else if (rId == R.id.openTxBtn){  //打开腾讯视频数据接口

           //打开首页页数据   tenvideo2://?action=4&tab_id=physical_pay
           //对应action名称，必填字段 action=4
           //指定进首页时，默认定位到哪个tab，选填字段.频道 chosen：精选（默认） tv：电视剧 children：少儿 movie：电影 variety：综艺 pay：会员 physical_pay：体育 yueshow_video：新闻 more：更多 cartoon：动漫 navigate：频道页
           //指定拉起首页时,默认的模式,选填字段,模式 standard_mode:普通模式 old_man_mode:长辈模式 child_mode:儿童 模式.(7.3及以上支持)

           //具体参照文档   打开腾讯视频数据接口
           String url = "tenvideo2://?action=4&tab_id=pay";
           openWithHomePageUri(url);
       }
    }


    private void handleIntent(Intent intent) {
        // 隐式调用的方式startActivity
        intent.setAction("com.tencent.qqlivetv.open");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.ktcp.tvvideo");//设置视频包名，要先确认包名
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager
                .queryIntentActivities(intent, 0);
        boolean isIntentSafe = activities.size() > 0;
        if (isIntentSafe) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "未安装腾讯视频 ， 无法跳转", Toast.LENGTH_SHORT)
                    .show();
        }
    }


    //scheme方式 打开腾讯视频数据
    private void openWithHomePageUri(String url) {
        String pull_from = Constants.TL_APP_SN;
        Intent intent = new Intent();

        String uri =  String.format("%s&pull_from=%s",url,pull_from);
        PtrCLog.d(TAG,uri);
        intent.setData(Uri.parse(uri));
        handleIntent(intent);
    }
}