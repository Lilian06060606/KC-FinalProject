package com.example.myapplication;

public class Selling {


    public Selling(String selname, String sellink, int selimg) {
        this.selname = selname;
        this.sellink = sellink;
        this.selimg = selimg;
    }
    private String selname;

    public String getSelname() {
        return selname;
    }

    public void setSelname(String selname) {
        this.selname = selname;
    }

    public String getSellink() {
        return sellink;
    }

    public void setSellink(String sellink) {
        this.sellink = sellink;
    }

    public int getSelimg() {
        return selimg;
    }

    public void setSelimg(int selimg) {
        this.selimg = selimg;
    }

    private String sellink;
    private int selimg;
}
