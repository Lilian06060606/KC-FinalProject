package com.example.myapplication;

import java.io.Serializable;

public class Transporation implements Serializable {


    public Transporation(String traname, String tranlink, int transimg) {
        this.traname = traname;
        this.tranlink = tranlink;
        this.transimg = transimg;
    }
    private String traname;

    public String getTraname() {
        return traname;
    }

    public void setTraname(String traname) {
        this.traname = traname;
    }

    public String getTranlink() {
        return tranlink;
    }

    public void setTranlink(String tranlink) {
        this.tranlink = tranlink;
    }

    public int getTransimg() {
        return transimg;
    }

    public void setTransimg(int transimg) {
        this.transimg = transimg;
    }

    private String tranlink;
    private int transimg;
}
