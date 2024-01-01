package com.example.waittimes.Backend;

public class Ride {
    private int id;
    private String name;
    private String last_updated;
    private boolean is_open;
    private int wait_time;

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

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated=last_updated;
    }

    public boolean isIs_open() {
        return is_open;
    }

    public void setIs_open(boolean is_open) {
        this.is_open=is_open;
    }

    public int getWait_time() {
        return wait_time;
    }

    public void setWait_time(int wait_time) {
        this.wait_time=wait_time;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        if (is_open) {
            string.append("     ").append(name);
            string.append('\n');
            string.append("            Wait: ").append(wait_time);
        }

        else  {
            string.append("     ").append(name);
            string.append('\n');
            string.append("            Status: ").append("Closed");
        }


        return string.toString();
    }
}
