package com.china.mysnapshot.base;

import android.app.Application;

import com.china.mysnapshot.bean.UploadInfoState;
import com.china.mysnapshot.log.YiLog;
import com.china.mysnapshot.util.DBBeanUpLoadVideoInfoUtils;
import com.china.mysnapshot.util.DBHttpBeanMediaDetailUtils;
import com.china.mysnapshot.util.DBLocalMediaDetailBeanUtils;
import com.china.mysnapshot.util.ToastHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHaiLong on 2017/9/6.
 */

public class BaseApplication extends Application{
    public static final String TAG = "YiApplication";

    public static List<UploadInfoState> uploadingInfoPositionList = new ArrayList<UploadInfoState>();
    @Override
    public void onCreate() {
        super.onCreate();
        YiLog.d(TAG, "onCreate");
        ToastHelper.init(this);
        DBHttpBeanMediaDetailUtils.Init(getApplicationContext());
        DBLocalMediaDetailBeanUtils.Init(getApplicationContext());
        DBBeanUpLoadVideoInfoUtils.Init(getApplicationContext());
        verifyURL();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        YiLog.d(TAG, "onTerminate");

    }

    private void verifyURL() {

    }
}
