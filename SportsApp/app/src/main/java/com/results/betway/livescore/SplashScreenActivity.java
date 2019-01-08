package com.results.betway.livescore;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }


    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }



    @Override
    protected void onResume() {
        super.onResume();

        handler=  new Handler();
        runnable = new Runnable() {
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, UrlWebView.class);
                startActivity(i);
                finish();
            }
        };
        handler.postDelayed(runnable, 4000);
    }
}
