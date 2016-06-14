package com.wanglei.jgpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by wanglei on 16/6/14.
 * email wanglei19910510@gmail.com
 * The greatest test of courage on earth is to bear defeat without losing heart.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
             if (intent.getAction().equals(JPushInterface.ACTION_MESSAGE_RECEIVED)){
                 Bundle b = intent.getExtras();
                 String title = b.getString(JPushInterface.EXTRA_TITLE);
                 String msg = b.getString(JPushInterface.EXTRA_MESSAGE);
                 Toast.makeText(context,"title:"+title+"msg"+msg,Toast.LENGTH_SHORT).show();
             }
    }


}
