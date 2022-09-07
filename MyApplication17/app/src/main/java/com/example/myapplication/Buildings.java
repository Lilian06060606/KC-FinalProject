package com.example.myapplication;

import java.io.Serializable;

public class Buildings{


    public Buildings(String bulname, String bulink, int bulimg) {
        this.bulname = bulname;
        this.bulink = bulink;
        this.bulimg = bulimg;
    }
    private String bulname;

    public String getBulname() {
        return bulname;
    }

    public void setBulname(String bulname) {
        this.bulname = bulname;
    }

    public String getBulink() {
        return bulink;
    }

    public void setBulink(String bulink) {
        this.bulink = bulink;
    }

    public int getBulimg() {
        return bulimg;
    }

    public void setBulimg(int bulimg) {
        this.bulimg = bulimg;
    }

    private String bulink;
    private int bulimg;
}
