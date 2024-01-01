package com.example.waittimes;

public class WaitTimeItem {
    private String name;
    private String waitTime;

    public WaitTimeItem(String name, int waitTime, boolean status) {
        this.name = name;

        if (!status) {
            this.waitTime = "Closed";
        } else {
            this.waitTime =  waitTime + " min";
        }

    }

    public String getName() {
        return name;
    }

    public String getWaitTime() {
        return waitTime;
    }
}
