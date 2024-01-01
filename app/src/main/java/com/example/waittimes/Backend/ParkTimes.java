package com.example.waittimes.Backend;
import android.os.StrictMode;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;
import java.io.FileReader;
import java.net.URLConnection;

import com.google.gson.Gson;

public class ParkTimes {
    public String DisneylandTimes() {
        JSONObject json=null;
        StringBuilder timeSum = new StringBuilder();
        Park dl = new Park();

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
                Park park = gson.fromJson(String.valueOf(json), Park.class);

                timeSum.append("Average Wait for Park: ");
                timeSum.append(park.getAverageWait()).append(" min").append("\n").append("\n").append("\n").append("\n");
                timeSum.append(park).append("\n").append("\n").append("\n");


                Land lands[] = park.getLands();

                for (Land land : lands) {
                    timeSum.append("Average Wait in ").append(land.getName()).append(": ");
                    timeSum.append(land.avWaitTime()).append("min").append("\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return timeSum.toString();
    }

    public String CaliforniaAdventuresTimes() {
        JSONObject json=null;
        StringBuilder timeSum = new StringBuilder();

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
                Park park = gson.fromJson(String.valueOf(json), Park.class);

                timeSum.append("Average Wait for Park: ");
                timeSum.append(park.getAverageWait()).append(" min").append("\n").append("\n").append("\n").append("\n");
                timeSum.append(park).append("\n").append("\n").append("\n");

                Land lands[] = park.getLands();

                for (Land land : lands) {
                    timeSum.append("Average Wait in ").append(land.getName()).append(": ");
                    timeSum.append(land.avWaitTime()).append("min").append("\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return timeSum.toString();
    }

}
