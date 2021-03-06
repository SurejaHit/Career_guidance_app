package com.example.surejahit.career_guidance_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Jobs_Fragment extends Fragment{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        CustomAdapter adapter;
        GridView gv;
        View RootView = inflater.inflate(R.layout.fragment_jobs, container, false);
        gv= (GridView) RootView.findViewById(R.id.gv);

        adapter=new CustomAdapter(getActivity(),getData());
        gv.setAdapter(adapter);
        return RootView;
    }
    private ArrayList getData()
    {
        ArrayList<Spacecraft> spacecrafts=new ArrayList<>();

        Spacecraft s=new Spacecraft();
        s.setName("Civil Eng");
        s.setImage(R.drawable.civil);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("MBA");
        s.setImage(R.drawable.mba);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Mech Eng");
        s.setImage(R.drawable.mechanical);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("MBBS");
        s.setImage(R.drawable.mbbs);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Dental");
        s.setImage(R.drawable.dentist);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Plastic Eng");
        s.setImage(R.drawable.plastic);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("C.A.");
        s.setImage(R.drawable.ca);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("AutoMobile");
        s.setImage(R.drawable.automobile);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("IT Eng");
        s.setImage(R.drawable.it);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Texttiles");
        s.setImage(R.drawable.texttiles);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("EC Eng");
        s.setImage(R.drawable.computer);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Elect Eng");
        s.setImage(R.drawable.electrical);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Architect");
        s.setImage(R.drawable.architect);
        spacecrafts.add(s);

        List<Spacecraft> arrString = spacecrafts;

        Collections.sort(arrString, new Comparator<Spacecraft>(){
            public int compare(Spacecraft ob1, Spacecraft obj2)
            {
                // TODO Auto-generated method stub
                return ob1.name.compareToIgnoreCase(obj2.name);
            }
        });

        return (ArrayList) arrString;
    }

}

