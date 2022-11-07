package com.hassmedia.cloudlauncher.activity;

import android.os.Handler;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hassmedia.base.arouter.ArConstants;
import com.hassmedia.base.ui.BaseActivity;
import com.hassmedia.cloudlauncher.R;

public class WelcomeActivity extends BaseActivity {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    public int getResourceId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initWidgets() {
        startApp();
    }

    private void startApp() {
        new Handler().postDelayed(() -> {
            ARouter.getInstance().build(ArConstants.TvActivity)
                    .navigation();
            //finish();

        }, 3000);
    }
}