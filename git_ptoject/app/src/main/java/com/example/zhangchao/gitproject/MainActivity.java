package com.example.zhangchao.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MainActivity.class.getSimpleName(),"初始提交");
        Log.d(MainActivity.class.getSimpleName(),"第二次提交");
        Log.d(MainActivity.class.getSimpleName(),"第三次提交");


        Log.d(MainActivity.class.getSimpleName(),"本地【master】变更啦");
        Log.d(MainActivity.class.getSimpleName(),"本地【master】变更啦2");

    }
}
