package broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import com.hassmedia.base.tools.PtrCLog;


public class TvBroadcastReceiver extends BroadcastReceiver {
    private final String TAG = TvBroadcastReceiver.class.getSimpleName();

    private Activity mActivity;
    public TvBroadcastReceiver(Activity activity) {
        mActivity = activity;
        initReceiver();
    }

    /**
     * 注册网络监听的广播
     */
    private void initReceiver() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(TvConstants.query_rsp_action);
        filter.addAction(TvConstants.login_rsp_action);
        filter.addAction(TvConstants.play_rsp_action);
        filter.addAction(TvConstants.control_play_rsp_action);
        filter.addAction(TvConstants.play_status_change_rsp_action);
        mActivity.registerReceiver(this, filter);
    }

    public void unReceiver() {
        mActivity.unregisterReceiver(this);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null)
            return;
        String action = intent.getAction();
        if (action.equals(TvConstants.query_rsp_action)) {
//            String guid = intent.getStringExtra("guid");
//            int login_status = intent.getIntExtra("login_status",0);
//            String login_type = intent.getStringExtra("login_type");
            //String page = intent.getStringExtra("page");
           // int status = intent.getIntExtra("status",0);
//            PtrCLog.d(TAG,guid);
//            PtrCLog.d(TAG,String.valueOf(login_status));
//            PtrCLog.d(TAG,login_type);
            //PtrCLog.d(TAG,page);
            //PtrCLog.d(TAG,String.valueOf(status));
        }else if (action.equals(TvConstants.login_rsp_action)){ //登录状态

            //int 类型 用户登录状态 0: 未登录 1: 已登录
            int login_status = intent.getIntExtra("login_status",0);

            //String 类型 用户登录帐号类型 qq: QQ wx: 微信 ph: 手机
            String login_type = intent.getStringExtra("login_type");
        }else if (action.equals(TvConstants.play_rsp_action)){  //播放查询

            //与查询type一致
            int type = intent.getIntExtra("type",0);

            //int类型 0：成功 1：失败
            int ret = intent.getIntExtra("ret",0);

//            int类型 type为1时 result取值:0:准备中；1:准备完成；2:播放 中；3：暂停中；4：缓冲中；5：已停止
//                    type为2时 result表示播放视频总时长单位秒
//                    type为3时 result表示当前播放时间点单位秒
            int result = intent.getIntExtra("result",0);
        }else if (action.equals(TvConstants.control_play_rsp_action)){
            //与查询type一致
            int type = intent.getIntExtra("type",0);

            //与查询sub_type一致
            int sub_type = intent.getIntExtra("sub_type",0);

            //int类型 0：成功 1：失败
            int ret = intent.getIntExtra("ret",0);
        }else if (action.equals(TvConstants.play_status_change_rsp_action)){ //播放器状态变化广播
            //0:准备中；1:准备完成；2:播放中；3：暂停 中；4：缓冲中；5：已停止
            int state = intent.getIntExtra("state",0);

            PtrCLog.d(TAG,"播放状态::" + String.valueOf(state));
        }
    }
}

