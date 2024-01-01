package com.example.waittimes.CaliAdventure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.waittimes.Backend.DisneylandResort;
import com.example.waittimes.Backend.Land;
import com.example.waittimes.Backend.Park;
import com.example.waittimes.Backend.Ride;
import com.example.waittimes.R;
import com.example.waittimes.WaitTimeAdapter;
import com.example.waittimes.WaitTimeItem;

import java.util.ArrayList;
import java.util.List;

public class Avengers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lands);

        List<WaitTimeItem> waitTimeItemList = new ArrayList<>();
        DisneylandResort disneylandResort = new DisneylandResort();
        disneylandResort.setCaliforniaAdventure();
        Park disneyland = disneylandResort.getCaliforniaAdventure();
        Land[] lands = disneyland.getLands();
        Land fantasy = lands[0];
        Ride[] rides = fantasy.getRides();

        for (Ride ride : rides) {
            waitTimeItemList.add(new WaitTimeItem(ride.getName(), ride.getWait_time(), ride.isIs_open()));
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        WaitTimeAdapter adapter = new WaitTimeAdapter(waitTimeItemList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}