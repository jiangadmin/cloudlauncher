package com.hassmedia.base.tools;

/**
 * 使用WindowManager实现类似Toast的效果
 * 使用方法如下:
 * ToastCustom.makeText(MainActivity.this, "提示内容" , 3000).show();//显示自定义时间
 * ToastCustom.makeText(MainActivity.this, "提示内容" , ToastCustom.LENGTH_SHORT).show();//显示默认的短时间
 * ToastCustom.makeText(MainActivity.this, "提示内容" , ToastCustom.LENGTH_LONG).show();//显示默认的长时间
 * ToastCustom.makeTextAndAnim(MainActivity.this, "提示内容" , ToastCustom.LENGTH_LONG,包名.R.style.自定义动画的样式名称).show();//显示自定义样式的动画
 * ToastCustom.makeText(MainActivity.this, "提示内容" , ToastCustom.LENGTH_LONG).setView(view).show();//自定义View
 * ToastCustom.makeText(MainActivity.this, "提示内容" , ToastCustom.LENGTH_LONG).setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0,100).show();//控制显示位置
 * ToastCustom.makeTextAndIcon(MainActivity.this, "提示内容" , ToastCustom.LENGTH_LONG,R.mipmap.ic_launcher).show();//自定义显示文字和图片，最终结果，图片在上，文字在下
 * 注意:不建议使用方法，
 * ToastCustom toast = ToastCustom.makeTextAndIcon(MainActivity.this, "提示内容" , ToastCustom.LENGTH_LONG,R.mipmap.ic_launcher);
 * LinearLayout toastView = (LinearLayout) mToast.getView();
 * ImageView imageView = new ImageView(context);
 * imageView.setImageResource(iconResId);
 * toastView.addView(imageView, 0);
 * toast.show();
 * 这样会造成连续多次点击时，重复添加,当然如果自己能增加控制重复点击也是可以的，除此之外上面的其他用法均是增加了防止重复点击的功能的
 */

import android.content.Context;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;


public class ToastCustom {
    public static final double LENGTH_SHORT = 2000.0;//2s
    public static final double LENGTH_LONG = 3500.0;//3,5s
    //定义变量
    private static final int MESSAGE_WHAT = 0;
    private static ToastCustom toastCustom;
    private static WindowManager mWindowManager;
    private static WindowManager.LayoutParams params;
    private static View mView;
    private static TextView textView;
    private static ImageView imageView;
    private final double time;
    private MyHandler mHandler;

    /**
     * 指定显示内容和时间
     *
     * @param context 可以是Activity或getApplicationContext()
     * @param text    需要提示的信息文字
     * @param time    单位:毫秒
     */
    private ToastCustom(Context context, CharSequence text, double time) {
        //初始化
        this.time = time;
        if (mWindowManager == null) {
            mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        }

        //将自定义View添加到自定义布局
        mView = customView(context, text);

        //设置布局参数
        setLayoutParams(-1);
    }

    /**
     * 指定显示内容，时间和动画ID
     *
     * @param context
     * @param text
     * @param time
     * @param resAnimId
     */
    private ToastCustom(Context context, String text, double time, int resAnimId) {
        //初始化
        this.time = time;
        mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        //将自定义View添加到自定义布局
        mView = customView(context, text);

        //设置布局参数
        setLayoutParams(resAnimId);
    }

    /**
     * 传递需要显示的参数
     *
     * @param context
     * @param text
     * @param time
     * @return
     */
    public static ToastCustom makeText(Context context, CharSequence text, double time) {
        if (toastCustom == null) {
            toastCustom = new ToastCustom(context, text, time);
        } else {
            setText(text);
        }
        return toastCustom;
    }

    /**
     * 需要显示文字和图片
     *
     * @param context
     * @param text
     * @param time
     * @return
     */
    public static ToastCustom makeTextAndIcon(Context context, CharSequence text, double time, int resIconId) {
        if (toastCustom == null) {
            toastCustom = new ToastCustom(context, text, time);
            LinearLayout toastView = (LinearLayout) getView();
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(resIconId);
            toastView.addView(imageView, 0);
        } else {
            setText(text);
        }
        return toastCustom;
    }

    /**
     * 控制显示文字和动画
     *
     * @param context
     * @param text
     * @param time
     * @param resAnimId :使用方法:包名.R.style.自定义动画的样式名称
     * @return
     */
    public static ToastCustom makeTextAndAnim(Context context, CharSequence text, double time, int resAnimId) {
        if (toastCustom == null) {
            toastCustom = new ToastCustom(context, text, time);
        } else {
            setText(text);
        }
        return toastCustom;
    }

    /**
     * 获取默认的显示的view
     *
     * @return
     */
    public static View getView() {
        return mView;
    }

    /**
     * 自定义View
     *
     * @param view
     * @return
     */
    public static ToastCustom setView(View view) {
        mView = view;
        return toastCustom;
    }

    /**
     * 修改显示的文本
     *
     * @param message
     */
    private static void setText(CharSequence message) {
        textView.setText(message);
    }

    /**
     * 自定义显示位置
     *
     * @param gravity:传递参数，如: Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM
     * @param xOffset
     * @return yOffset
     */
    public static ToastCustom setGravity(int gravity, int xOffset, int yOffset) {
        params.gravity = gravity;
        params.x = xOffset;
        params.y = yOffset;
        return toastCustom;
    }

    //设置布局参数
    private void setLayoutParams(int resAnimId) {
        params = new WindowManager.LayoutParams();
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        params.width = WindowManager.LayoutParams.WRAP_CONTENT;
        params.format = PixelFormat.TRANSLUCENT;
        params.windowAnimations = resAnimId;//Animation.INFINITE
        //params.type = WindowManager.LayoutParams.TYPE_TOAST;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            params.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        }
        params.flags = WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE;
        params.gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;
        params.y = 200;//正数，数值越大，位置向上移动
        params.x = 200;
    }

    //自定义View
    private View customView(Context context, CharSequence text) {
        RelativeLayout toastView = new RelativeLayout(context);
        //toastView.setOrientation(LinearLayout.VERTICAL);
        //toastView.setBackgroundResource(R.drawable.text_view_border);
        toastView.setGravity(Gravity.CENTER);
        toastView.setBackgroundResource(context.getResources().getIdentifier("toast_bg", "mipmap", "com.hassmedia.cloudlauncher"));
        textView = new TextView(context);
        textView.setText(text);
        textView.setGravity(Gravity.CENTER_VERTICAL);

        try {
            int length = text.toString().getBytes("GBK").length;
            if (0 < length && length < 8) {
                textView.setWidth(120);
                textView.setHeight(80);
            } else if (8 <= length && length < 20) {
                textView.setWidth(250);
                textView.setHeight(140);
            } else if (length >= 20 && length < 40) {
                textView.setWidth(380);
                textView.setHeight(180);
            } else if (length >= 40) {
                textView.setWidth(460);
                textView.setHeight(240);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        textView.setTextColor(Color.parseColor("#000000"));
        textView.setTextSize(20);
        toastView.addView(textView, 0);

        return toastView;
    }

    /**
     * 调用makeText之后再调用
     */
    public void show() {
        //防止多次点击，重复添加
        if (mHandler == null) {
            mHandler = new MyHandler();
            mWindowManager.addView(mView, params);
            mHandler.sendEmptyMessageDelayed(MESSAGE_WHAT, (long) (time));
        }
    }

    /**
     * 取消View的显示
     */
    private void cancel() {
        mWindowManager.removeView(mView);
        mView = null;
        toastCustom = null;
        mHandler = null;
    }

    //自定义Handler
    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_WHAT:
                    cancel();
                    break;
            }
        }
    }
}
