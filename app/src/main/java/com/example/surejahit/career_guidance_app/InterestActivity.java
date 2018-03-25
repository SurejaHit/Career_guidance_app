package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.surejahit.career_guidance_app.Engpackage.ComputerEng;

public class InterestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
    }
    public void computer(View view) {
        Intent i = new Intent(InterestActivity.this,ComputerEng.class);
        startActivity(i);
    }

    public void startup(View view) {
        Intent i = new Intent(InterestActivity.this,StartupActivity.class);
        startActivity(i);
    }

    public void yoga(View view) {
        Intent i = new Intent(InterestActivity.this,YogaActivity.class);
        startActivity(i);
    }

}
