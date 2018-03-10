package com.example.surejahit.career_guidance_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Guidance_Fragment extends Fragment{
    public Guidance_Fragment() {
        // Required empty public constructor
    }

    Button btn1,btn2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_guidance,container);
        btn1= (Button) v.findViewById(R.id.btn10);
        btn2= (Button) v.findViewById(R.id.btn12);
       return v;
    }

    public void Onclick10() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter10");
                startActivity(intent);
            }
        });
    }

    public void onclick12()
    {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter12th");
                startActivity(intent);
            }
        });
    }
}