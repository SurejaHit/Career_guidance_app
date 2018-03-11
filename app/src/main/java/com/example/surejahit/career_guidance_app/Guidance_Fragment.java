package com.example.surejahit.career_guidance_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Guidance_Fragment extends Fragment{

    public Guidance_Fragment() {
        // Required empty public constructor
    }
    Button b1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_guidance, container, false);
       /* b1 = v.findViewById(R.id.btn10);
        b1.setOnClickListener();*/
        return inflater.inflate(R.layout.fragment_guidance, container, false);
    }

}