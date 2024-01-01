package com.example.waittimes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waittimes.CaliAdventure.Avengers;
import com.example.waittimes.CaliAdventure.Carsland;
import com.example.waittimes.CaliAdventure.GrizzlyPeak;
import com.example.waittimes.CaliAdventure.HollywoodLand;
import com.example.waittimes.CaliAdventure.ParadiseGardens;
import com.example.waittimes.CaliAdventure.PixarPier;

public class CaliAdventureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caliadventure);

        ImageButton btnImage1 = findViewById(R.id.btnImage1);
        ImageButton btnImage2 = findViewById(R.id.btnImage2);
        ImageButton btnImage3 = findViewById(R.id.btnImage3);
        ImageButton btnImage4 = findViewById(R.id.btnImage4);
        ImageButton btnImage5 = findViewById(R.id.btnImage5);
        ImageButton btnImage6 = findViewById(R.id.btnImage6);


        btnImage1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CaliAdventureActivity.this, Carsland.class));
            }
        });

        btnImage2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CaliAdventureActivity.this, Avengers.class));
            }
        });

        btnImage3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CaliAdventureActivity.this, PixarPier.class));
            }
        });

        btnImage4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CaliAdventureActivity.this, GrizzlyPeak.class));
            }
        });

        btnImage5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CaliAdventureActivity.this, HollywoodLand.class));
            }
        });

        btnImage6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CaliAdventureActivity.this, ParadiseGardens.class));
            }
        });
    }
}
