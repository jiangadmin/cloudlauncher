package com.hassmedia.base.constans;

public class Constants {

    public static final String headTAG = "token";

    public static final String userName = "username";
    public static final long UiType = 2;
    public static final String APP_ID = "25412277";
    public static final String APP_KEY = "4CVigmpChojG3AuUs7e3TMyX";
    public static final String SECRET_KEY = "Ff9g5OmdAyrgi6kLvLCmHSO5MvNdFLkl";

    public static final String TL_APP_ID = "1032358333774045200";
    public static final String TL_APP_KEY = "63cb91f27e314277aba3f87913b6814b";
    public static final String TL_APP_SN = "100217";

    public static final String IFLYTEK_APP_ID = "51b04a88";

    //    public static final String MQTT_SERVER_PREFIX = "tcp://mqtt.hassbrain.com:1883";//tcp://192.168.0.20:1883
//    public static final String MQTT_SERVER_PREFIX = "ssl://192.168.0.20:8883";//tcp://192.168.0.20:1883
    public static final String MQTT_CLIENT_PREFIX = "tv-";//客户端标识前缀 + UUID
    public static final int MQTT_SERVER_PORT = 1883;//mqtt端口号，默认公网为1883；单机版登陆接口指定特定端口号
    public static final String USER_NAME = "vcs-tv";
    public static final String USER_PASSWORD = "vcs-WASDJqweuojlk@#";
    public static final String HOTEL_TOPIC = "/hassmedia/group/hotel/";
    public static final String TV_TOPIC = "/hassmedia/tv/"; //要订阅的主题
    public static final String PUBLISH_TOPIC = "/hassmedia/control/server";
//    public static final String HTTP_SERVER = "https://www.hassbrain.com";
//    public static final String HTTP_SERVER_STATIC = "http://static.hassbrain.com";
//    public static final String HTTP_SERVER_TV_INIT = "https://www.hassbrain.com/api/control/device/init/tv";


    public static final String MQTT_SERVER_PREFIX = "ssl://mqtthtv.jinjianghotels.com.cn:34883";//tcp://192.168.0.20:1883
    public static final String HTTP_SERVER = "https://controlhtv.jinjianghotels.com.cn";
    public static final String HTTP_SERVER_STATIC = "https://statichtv.jinjianghotels.com.cn";
//5 controlhtv.jinjianghotels.com.cn 443
//6 statichtv.jinjianghotels.com.cn 443
//7 mqtthtv.jinjianghotels.com.cn 34883  1-4是管理平台。

    //电视相关接口  api/control/device/36/1/tv/template?deviceToken=f0b4f9063e7d3cba3abe8f12f008ed71bd7db97d

    public static final String WEB_SCOKET = "wss://www.hassbrain.com"; //ws://192.168.0.21:6060
    public static final String VOD_BROADCAST_ACTION = "com.hassmedia.action.CLOUDAPI";
    public static final String VOD_BROADCAST = "com.hassmedia.permission.CLOUDAPI";
    public static final String CIBN_PACKAGENAME = "com.hassmedia.cibntv";
    public static final String CIBN_PACKAGENAME_ACTIVITY = "com.hassmedia.cibntv.StartActivity";
    public static final String LIVE_PACKAGENAME = "com.hassmedia.livechannels";
    public static final String LIVE_PACKAGENAME_ACTIVITY = "com.hassmedia.livechannels.LiveStartActivity";
    public static final String BROADCAST_GETUUID = "com.hassmedia.broadcastreceiver.messageGetUUid";
    public static final String BROADCAST_MESSAGEQR = "com.hassmedia.broadcastreceiver.messageQR";
    public static final String BROADCAST_TOKEN = "com.hassmedia.broadcastreceiver.messageToken";
    public static final String BROADCAST_CUSTOMERDEMAND = "com.hassmedia.broadcastreceiver.CustomerDemand";
    public static final String BROADCAST_BOOT = "android.permission.RECEIVE_BOOT_COMPLETED";
    public static final String KUGOU_APPID = "10182";
    public static final String KUGOU_SECRET_KEY = "S7rBk8FSXTcCrwdSogzVZoD2obPYX5Uc";

    public static final String BROADCAST_YUEKU_NUMBER = "com.hassmedia.yueku.musicnumber";
    public static final String BROADCAST_YUEKU_CONTROL = "com.hassmedia.yueku.musiccontrol";

    public static final String BROADCAST_VOD_VOICE = "com.hassmedia.vod.movie.voice";

    public static final String BROADCAST_LIVE_VOICE = "com.hassmedia.live.channels.voice";

    /**********************广播*****************************/
    public final static String WEB_SOCKET_MESSAGE_ACTION = "com.hassmedia.websocket.content";
    public final static String ASR_TEXT_ACTION = "com.hassmedia.speek.text";
    public final static String QT_TEXT_ACTION = "com.hassmedia.cloudlauncher.qr";
    public final static String GET_TOKEN_TEXT_ACTION = "com.hassmedia.cloudlauncher.action.get.token";
    public final static String GET_TOKEN_ERROR_ACTION = "com.hassmedia.cloudlauncher.action.token.error";
    public final static String MQTT_TEXT_ACTION = "com.hassmedia.cloudlauncher.action.mqtt";
    public final static String MQTT_TEXT_MSG = "com.hassmedia.cloudlauncher.mqtt.msg";
    //系统声音条
    public final static String DLNA_VOLUME_SET_INTENT = "dlna_volume_set";
    public final static String VOLUME_DIRECTORY_EXTRA = "volume_directory";
    public final static String VOLUME_KEY_STEP_EXTRA = "volume_ctrl_key_repeated_num";

}
