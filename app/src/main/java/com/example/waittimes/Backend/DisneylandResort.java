package com.example.waittimes.Backend;

import android.os.StrictMode;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class DisneylandResort {
    private Park Disneyland;
    private Park CaliforniaAdventure;

    public DisneylandResort() {
        Disneyland = null;
        CaliforniaAdventure = null;
    }

    public void setDisneyland() {
        JSONObject json=null;

        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            URL url = new URL("https://queue-times.com/en-US/parks/16/queue_times.json");


            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
            json = new JSONObject(sb.toString());

            try {
                Gson gson = new Gson();
                assert json != null;
                Disneyland = gson.fromJson(String.valueOf(json), Park.class);
            } catch (Exception e) {
                e.printStackTrace();
                Disneyland = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Park getDisneyland() {
        return Disneyland;
    }

    public void setCaliforniaAdventure() {
        JSONObject json=null;

        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            URL url = new URL("https://queue-times.com/en-US/parks/17/queue_times.json");


            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
            json = new JSONObject(sb.toString());

            try {
                Gson gson = new Gson();
                assert json != null;
                CaliforniaAdventure = gson.fromJson(String.valueOf(json), Park.class);
            } catch (Exception e) {
                e.printStackTrace();
                CaliforniaAdventure = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Park getCaliforniaAdventure() {
        return CaliforniaAdventure;
    }
}
