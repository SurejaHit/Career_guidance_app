package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.surejahit.career_guidance_app.R;
import com.example.surejahit.career_guidance_app.jobpackage.MbaActivity;

/**
 * Created by dwije on 23-03-18.
 */

public class CareerAfter_g extends Activity
{
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_after_g);

        btn1 = (Button) findViewById(R.id.btn11);
        btn2 = findViewById(R.id.btn22);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),StartupActivity.class);
                startActivity(i);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MbaActivity.class);
                startActivity(i);

            }
        });
    }
}