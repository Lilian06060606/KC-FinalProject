package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Content2 extends AppCompatActivity {
ArrayList<Transporation>transporationslist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content2);
        ImageView home = findViewById(R.id.imageView2);
        Transporation gm = new Transporation("Google Maps","https://play.google.com/store/apps/details?id=com.google.android.apps.maps",R.drawable.gmap);
        Transporation fn = new Transporation("Free Now","https://play.google.com/store/apps/details?id=taxi.android.client",R.drawable.fn);
        Transporation avan = new Transporation("Avanti West Coast","https://play.google.com/store/apps/details?id=com.avantiwestcoast",R.drawable.avanti);
        Transporation city = new Transporation("Citymapper","https://play.google.com/store/apps/details?id=com.citymapper.app.release",R.drawable.citymapper);
        Transporation uber = new Transporation("Uber","https://play.google.com/store/apps/details?id=com.ubercab",R.drawable.uber);
        Transporation train = new Transporation("Trainline","https://play.google.com/store/apps/details?id=com.thetrainline",R.drawable.train);
        Transporation tvl = new Transporation("TFL","https://play.google.com/store/apps/details?id=uk.gov.tfl.gotfl",R.drawable.tfl);
transporationslist.add(gm);
transporationslist.add(fn);
transporationslist.add(avan);
transporationslist.add(city);
transporationslist.add(uber);
transporationslist.add(train);
transporationslist.add(tvl);
        TransporationA transporationA = new TransporationA(this,0,transporationslist);
        ListView listView = findViewById(R.id.listview2);
        listView.setAdapter(transporationA);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent900 = new Intent(Content2.this,Home.class);
                startActivity(intent900);}});



    }
}