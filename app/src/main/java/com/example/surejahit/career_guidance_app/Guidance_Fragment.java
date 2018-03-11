package com.example.surejahit.career_guidance_app;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Guidance_Fragment extends Fragment implements View.OnClickListener {

    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_guidance, container, false);
        ((Button) v.findViewById(R.id.btn10)).setOnClickListener(this);
        return v;
    }

    public void onClick(View view) {
        FragmentManager fm = getActivity().getFragmentManager();
        MyDialogFragment dialogFragment = new MyDialogFragment ();
        dialogFragment.show(fm, "Sample Fragment");
    }

}