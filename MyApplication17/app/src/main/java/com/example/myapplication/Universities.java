package com.example.myapplication;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.text.util.Linkify;
import android.widget.TextView;

import org.w3c.dom.Text;
import org.xml.sax.DTDHandler;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

public class Universities implements Serializable{


    public Universities(String name, String  urls, int uniimg, int detailimg, String desc)  {
        this.name = name;
        this.urls = urls;
        this.uniimg = uniimg;
        this.detailimg = detailimg;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public int getUniimg() {
        return uniimg;
    }

    public void setUniimg(int uniimg) {
        this.uniimg = uniimg;
    }

    public int getDetailimg() {
        return detailimg;
    }

    public void setDetailimg(int detailimg) {
        this.detailimg = detailimg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    private String name;
    private String urls;
    private int uniimg;
    private  int detailimg;
    private String desc;

}
