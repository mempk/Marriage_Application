package com.example.marriageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import service.player;
import com.example.marriageapplication.LanguageSelect;

public class calculator extends AppCompatActivity {

    private LanguageSelect languageSelect;

    //ArrayList<player> Khiladi = languageSelect.getArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        Toast.makeText(this, "Lets Do Some calculation", Toast.LENGTH_SHORT).show();

       // for (int i=0; i<Khiladi.size();i++){




        }


    }

