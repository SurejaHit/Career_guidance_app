package com.example.surejahit.career_guidance_app;

import android.app.Activity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CareerAfter10th extends Activity {

    ImageView imageView;
    Button btnsc;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_after10th);
        btnsc = (Button)findViewById(R.id.btnsc);
        btnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.example.surejahit.career_guidance_app.in10_science");
                startActivity(intent);
            }
        });
    }

}
