package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.surejahit.career_guidance_app.R;

/**
 * Created by dwije on 23-03-18.
 */


public class CareerAfter_pg extends Activity
{
    private Button btn3;
    //private Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_after_pg);

        btn3 = findViewById(R.id.btn33);
        // btn4 = findViewById(R.id.btn44);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),StartupActivity.class);
                startActivity(i);
            }
        });

        /*btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),.class);
                startActivity(i);

            }
        });

        */




    }
}

