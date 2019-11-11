package com.example.marriageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import service.player;


public class LanguageSelect extends AppCompatActivity {

    private Button button;

    final ArrayList<player> Khiladi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);






        button= (Button) findViewById(R.id.addFinishButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LanguageSelect.this, calculator.class);
                startActivity(intent);
                finish();

            }
        });


        ImageView imageview1 = findViewById(R.id.addIcon);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText text = findViewById(R.id.playername);
                String playerName = text.getText().toString();
                Toast.makeText(LanguageSelect.this, playerName+" Added", Toast.LENGTH_SHORT).show();
                Khiladi.add(new player(playerName,' ',0,false));
                finish();
                System.out.println(Khiladi.get(0).getPlayerName());
                startActivity(getIntent());




            }
        });








}


    public ArrayList<player> getArrayList(){
        return Khiladi;
    }



}
