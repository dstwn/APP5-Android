package com.infinite5.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.infinite5.app.R;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        //panggil metod splash
        tampilSplash();
    }
        //method splash
    private void tampilSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        },200);
    }
}
