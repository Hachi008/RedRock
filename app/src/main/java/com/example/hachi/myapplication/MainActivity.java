package com.example.hachi.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void skip(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
