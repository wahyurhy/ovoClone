package com.wahyurhy.ovoclone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.wahyurhy.ovoclone.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        init();
    }

    private void init() {
        new Handler().postDelayed(() -> {
            Intent welcomeActivity = new Intent(this, WelcomeActivity.class);
            welcomeActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(welcomeActivity);

            onBackPressed();
        }, 2000);
    }
}