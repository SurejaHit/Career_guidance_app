package com.example.surejahit.career_guidance_app;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public  class Guidance_Fragment extends Fragment {

    TextView tv;
    Button btn10,btn12,btnG,btnPG;
    public  Guidance_Fragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_guidance, container, false);
     /*   ((Button) v.findViewById(R.id.btn10)).setOnClickListener(this);*/
        onClick10(v);
        onClick12(v);
        onClickG(v);
        onClickPG(v);
        return v;
    }
    public void onClick10(View view)
    {
        btn10=(Button) view.findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter10th");
                startActivity(intent);
            }
        });
    }
    public void onClick12(View view)
    {
        btn12=(Button) view.findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter12th");
                startActivity(intent);
            }
        });
    }
    public void onClickG(View view)
    {
        btnG=(Button) view.findViewById(R.id.btnG);
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter_g");
                startActivity(intent);
            }
        });
    }
    public void onClickPG(View view)
    {
        btnPG=(Button) view.findViewById(R.id.btnPg);
        btnPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.surejahit.career_guidance_app.CareerAfter_pg");
                startActivity(intent);
            }
        });
    }

  /*  public void onClick(View view) {
        FragmentManager fm = getActivity().getFragmentManager();
        MyDialogFragment dialogFragment = new MyDialogFragment ();
        dialogFragment.show(fm, "Sample Fragment");
    }*/

}