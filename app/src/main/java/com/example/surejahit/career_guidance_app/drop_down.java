package com.example.surejahit.career_guidance_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class drop_down extends Activity implements OnItemSelectedListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Select One From Given List");
        categories.add("After 10th");
        categories.add("After 12th");
        categories.add("After Graduation");
        categories.add("After Post Graduation");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item

        switch(position)
        {
            case 0:
                break;
            case 1:
                Intent intent1 = new Intent(drop_down.this,drop_after10th.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(drop_down.this,CareerAfter12th.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent("com.example.surejahit.career_guidance_app.CareerAfter_g");
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent("com.example.surejahit.career_guidance_app.CareerAfter_pg");
                startActivity(intent4);
                break;
            default:
                break;
        }
        // Showing selected spinner item

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}