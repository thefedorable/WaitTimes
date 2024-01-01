package com.example.waittimes.Backend;

public class Park {
    private Land[] lands;
    private int averageWait;
    private String shortestLand;
    private Ride[] shortestWait;

    public Land[] getLands() {
        return lands;
    }


    public void setLands(Land[] lands) {
        this.lands=lands;
    }

    public int getAverageWait() {
        averageWait = 0;

        for (int i = 0; i < lands.length; i++) {
            averageWait += lands[i].avWaitTime();
            //System.out.println(lands[i].avWaitTime());
        }

        averageWait = averageWait / lands.length;
        return averageWait;
    }

    public void setAverageWait(int averageWait) {
        this.averageWait=averageWait;
    }

    public String getShortestLand() {
        return shortestLand;
    }

    public void setShortestLand(String shortestLand) {
        this.shortestLand=shortestLand;
    }

    public Ride[] getShortestWait() {
        return shortestWait;
    }

    public void setShortestWait(Ride[] shortestWait) {
        this.shortestWait=shortestWait;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < lands.length; i++) {
            out.append(lands[i].toString());
            out.append("\n");
        }

        return out.toString();
    }
}
