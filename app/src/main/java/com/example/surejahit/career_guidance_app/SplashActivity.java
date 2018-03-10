package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent i = new Intent(SplashActivity.this, Language_Activity.class);
                startActivity(i);
<<<<<<< HEAD
                finish();

=======
>>>>>>> 1ed27f2687b04fc2c0fbe68bdf61e783326ea8f6
            }
        }, SPLASH_TIME_OUT);
    }
}