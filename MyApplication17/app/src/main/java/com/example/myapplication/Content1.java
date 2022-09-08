package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Content1 extends AppCompatActivity {
    ArrayList<Food> foodlist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1);
        ImageView home = findViewById(R.id.imageView2);
        Food ue = new Food("Uber Eats","https://play.google.com/store/apps/details?id=com.ubercab.eats",R.drawable.ubereats);
        Food del = new Food("Deliveroo","https://play.google.com/store/apps/details?id=com.deliveroo.orderapp",R.drawable.deli);
        Food je = new Food("Just Eat","https://play.google.com/store/apps/details?id=com.justeat.app.uk",R.drawable.juste);
        Food ot = new Food("Open Table","https://play.google.com/store/apps/details?id=com.opentable",R.drawable.ot);
        Food get = new Food("Getir","https://play.google.com/store/apps/details?id=com.getir",R.drawable.getir);

        foodlist.add(ue);
        foodlist.add(del);
        foodlist.add(je);
        foodlist.add(ot);
        foodlist.add(get);
        FoodA foodA = new FoodA(this,0,foodlist);
        ListView listView1 = findViewById(R.id.listview1);
        listView1.setAdapter(foodA);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent800 = new Intent(Content1.this,Home.class);
                startActivity(intent800);}});






    }
}