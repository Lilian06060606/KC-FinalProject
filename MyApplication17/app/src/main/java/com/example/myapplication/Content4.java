package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Content4 extends AppCompatActivity {
    ArrayList<Selling> sellingslist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4);
        ImageView home = findViewById(R.id.imageView2);
      Selling mp = new Selling("Marketplace","https://play.google.com/store/apps/details?id=com.app.offerit",R.drawable.market);
        Selling ebay = new Selling("eBay","https://play.google.com/store/apps/details?id=com.ebay.mobile",R.drawable.ebay);
        Selling ama = new Selling("Amazon","https://play.google.com/store/apps/details?id=com.amazon.mShop.android.shopping",R.drawable.amazon);
       sellingslist.add(mp);
       sellingslist.add(ebay);
       sellingslist.add(ama);
        SellingA sellingA = new SellingA(this,0,sellingslist);
        ListView listView8 = findViewById(R.id.listview8);
        listView8.setAdapter(sellingA);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Content4.this,Home.class);
                startActivity(intent5);}});

    }
}