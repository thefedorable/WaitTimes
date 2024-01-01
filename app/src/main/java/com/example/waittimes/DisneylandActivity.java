package com.example.waittimes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waittimes.Disneyland.Adventureland;
import com.example.waittimes.Disneyland.CritterCountry;
import com.example.waittimes.Disneyland.Fantasyland;
import com.example.waittimes.Disneyland.Frontierland;
import com.example.waittimes.Disneyland.GalaxysEdge;
import com.example.waittimes.Disneyland.NewOrleans;
import com.example.waittimes.Disneyland.Tomorrowland;
import com.example.waittimes.Disneyland.ToonTown;

public class DisneylandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disneyland);

        ImageButton btnImage1 = findViewById(R.id.btnImage1);
        ImageButton btnImage2 = findViewById(R.id.btnImage2);
        ImageButton btnImage3 = findViewById(R.id.btnImage3);
        ImageButton btnImage4 = findViewById(R.id.btnImage4);
        ImageButton btnImage5 = findViewById(R.id.btnImage5);
        ImageButton btnImage6 = findViewById(R.id.btnImage6);
        ImageButton btnImage7 = findViewById(R.id.btnImage7);
        ImageButton btnImage8 = findViewById(R.id.btnImage8);


        btnImage1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, Adventureland.class));
            }
        });

        btnImage2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, Frontierland.class));
            }
        });

        btnImage3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, Tomorrowland.class));
            }
        });

        btnImage4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, Fantasyland.class));
            }
        });

        btnImage5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, NewOrleans.class));
            }
        });

        btnImage6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, GalaxysEdge.class));
            }
        });

        btnImage7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, ToonTown.class));
            }
        });

        btnImage8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DisneylandActivity.this, CritterCountry.class));
            }
        });
    }
}

