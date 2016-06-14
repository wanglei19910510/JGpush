package com.wanglei.jgpush;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private EditText et;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JPushInterface.setAlias(MainActivity.this, et.getText().toString(),null);
            }
        });

    }


    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }
}
