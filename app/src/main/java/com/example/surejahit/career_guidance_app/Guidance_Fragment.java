package com.example.surejahit.career_guidance_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Guidance_Fragment extends AppCompatActivity{
    public Guidance_Fragment() {
        // Required empty public constructor
    }
    private Button btn10=findViewById(R.id.btn10);
    private Button btn12=findViewById(R.id.btn12);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Onclick10();
        onclick12();
    }

   /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guidance, container, false);

    }*/
    public void Onclick10()
    {


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter10");
                startActivity(intent);
            }
        });
    }
    public void onclick12()
    {
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter12th");
                startActivity(intent);
            }
        });
    }
}