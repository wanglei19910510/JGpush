package com.wanglei.jgpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by wanglei on 16/6/14.
 * email wanglei19910510@gmail.com
 * The greatest test of courage on earth is to bear defeat without losing heart.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
