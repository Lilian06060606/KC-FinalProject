package com.example.myapplication;

import java.io.Serializable;

public class Food implements Serializable{
    private String foodname;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodlink() {
        return foodlink;
    }

    public void setFoodlink(String foodlink) {
        this.foodlink = foodlink;
    }

    public int getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(int foodimg) {
        this.foodimg = foodimg;
    }

    public Food(String foodname, String foodlink, int foodimg) {
        this.foodname = foodname;
        this.foodlink = foodlink;
        this.foodimg = foodimg;
    }

    private String foodlink;
    private int foodimg;

}
