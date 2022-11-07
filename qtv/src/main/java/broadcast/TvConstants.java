package broadcast;

public class TvConstants {

    /*************************通用广播查询*******************************/
    public final static String query_req_action = "com.tencent.qqlivetv.open.query";
    public final static String query_rsp_action = "com.tencent.qqlivetv.open.result";

    /*************************进入退出播放器*******************************/
    public final static String player_start = "com.tencent.videotv.play_start";
    public final static String player_stop = "com.tencent.videotv.play_complete";

    /*************************自动播放下一集*******************************/
    public final static String player_next = "com.tencent.videotv.auto_play_next";

    /*************************登录态广播查询*******************************/
    public final static String login_req_action = "com.tencent.qqlivetv.login.req";
    public final static String login_rsp_action = "com.tencent.qqlivetv.login.rsp";


    /*************************播放查询接口定义*******************************/
    public final static String play_req_action = "com.tencent.qqlivetv.play_query_req";
    public final static String play_rsp_action = "com.tencent.qqlivetv.play_query_rsp";

    /*************************播放控制定义*******************************/
    public final static String control_play_req_action = "com.tencent.qqlivetv.play_control_req";
    public final static String control_play_rsp_action = "com.tencent.qqlivetv.play_control_rsp";

    /*************************播放器状态变化广播*******************************/
    public final static String play_status_change_rsp_action = "com.tencent.videotv.play_state_change";
}
