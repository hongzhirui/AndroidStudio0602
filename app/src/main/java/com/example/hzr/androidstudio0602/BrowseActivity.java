package com.example.hzr.androidstudio0602;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Intent intent = getIntent();
        String website = intent.getStringExtra("website");

        TextView textView = (TextView)findViewById(R.id.id_textView);
        textView.setText("加载："+website + "中");
    }

    public void goBack(View view){
        finish();
    }
}
