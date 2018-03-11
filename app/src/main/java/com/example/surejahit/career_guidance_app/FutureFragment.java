package com.example.surejahit.career_guidance_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FutureFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    public FutureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_future, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);

        return v;
    }
    @Override
    public void onResume(){
        super.onResume();
        ((MyRecyclerViewAdapter) mAdapter).setOnItemClickListener(new MyRecyclerViewAdapter
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }

    public ArrayList<DataObject> getDataSet(){
        ArrayList results = new ArrayList<DataObject>();
        int index = 0;
        DataObject obj = new DataObject(getString(R.string.top1) , getString(R.string.des1));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top2), getString(R.string.des2));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top3) , getString(R.string.des3));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top4) , getString(R.string.des4));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top5) , getString(R.string.des5));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top6) , getString(R.string.des6));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top7) , getString(R.string.des7));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top8) , getString(R.string.des8));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top9) , getString(R.string.des9));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top10) , getString(R.string.des10));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top11) , getString(R.string.des11));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top12) , getString(R.string.des12));
        results.add(index, obj);
        index++;
        obj = new DataObject(getString(R.string.top13) , getString(R.string.des13));
        results.add(index, obj);

        return results;
    }

}