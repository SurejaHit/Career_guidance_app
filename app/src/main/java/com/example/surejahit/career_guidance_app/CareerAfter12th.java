package com.example.surejahit.career_guidance_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.surejahit.career_guidance_app.Engpackage.CivilEng;
import com.example.surejahit.career_guidance_app.Engpackage.ComputerEng;
import com.example.surejahit.career_guidance_app.Engpackage.EcEng;
import com.example.surejahit.career_guidance_app.Engpackage.MechanicalEng;

public class CareerAfter12th extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_after12th);
    }
    public void onClickImage(View view) {
        switch (view.getId()){
            case R.id.btnComputer:
                Intent intentComp = new Intent(this,ComputerEng.class);
                startActivity(intentComp);
                break;
            case R.id.btnMechanical:
                Intent intentMech = new Intent(this,MechanicalEng.class);
                startActivity(intentMech);
                break;
            case R.id.btnCivil:
                Intent intentCivil = new Intent(this,CivilEng.class);
                startActivity(intentCivil);
                break;
            case R.id.btnEc:
                Intent intentEc = new Intent(this,EcEng.class);
                startActivity(intentEc);
                break;

        }
    }
}
