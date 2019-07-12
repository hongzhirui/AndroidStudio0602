package com.example.hzr.androidstudio0602;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goBaidu(View view){
        Intent intent = new Intent(this, BrowseActivity.class);
        intent.putExtra("website", "http://www.baidu.com");
        startActivity(intent);
    }

    public void goXinlang(View view){
        Intent intent = new Intent(this, BrowseActivity.class);
        intent.putExtra("website", "http://www.xinlang.com");
        startActivity(intent);
    }
}
