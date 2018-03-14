package com.hackathon.alphac.spot;

import android.Manifest;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    String[] permissionsString = {Manifest.permission.READ_EXTERNAL_STORAGE};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        startMainActivity();
    }
    void startMainActivity(){
        Handler handler = new Handler();
        Runnable r  = new Runnable() {
            @Override
            public void run() {
                Intent startAct;
                startAct = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(startAct);
            }
        };
        handler.postDelayed(r,3500);
    }
}
