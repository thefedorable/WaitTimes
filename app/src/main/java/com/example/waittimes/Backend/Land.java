package com.example.waittimes.Backend;

public class Land {
    private int id;
    private String name;
    private Ride[] rides;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Ride[] getRides() {
        return rides;
    }

    public void setRides(Ride[] rides) {
        this.rides=rides;
    }

    public Ride shortestWait () {
        Ride ride = null;

        for (Ride value : rides) {
            int wait=rides[0].getWait_time();
            if (value.getWait_time() < wait || wait == 0) {
                ride=value;
            }
        }

        return ride;
    }

    public int avWaitTime() {
        int add = 0;
        int rideNum = 0;

        for (Ride ride : rides) {
            if (ride.getWait_time() != 0) {
                add+=ride.getWait_time();
                rideNum +=1;
            }
        }

        int average = 0;

        if (rideNum != 0) {
            average = add / rideNum;
            return average;
        }

        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        StringBuilder begin = new StringBuilder();
        StringBuilder combined = new StringBuilder();
        begin.append(name).append(": ");
        begin.append("\n").append("\n");

        for (int i = 0; i < rides.length; i++) {

            String name = rides[i].getName();

            if ((!name.contains("Single"))) {
                out.append(rides[i].toString()).append("\n").append("\n");
            }
        }

        String front = begin.toString();
        String end = out.toString();
        //end = end.
        combined.append(front).append(end);


        return combined.toString();
    }
}
