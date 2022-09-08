package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Content3 extends AppCompatActivity {
    ArrayList<Buildings> buildingslist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content3);
        ImageView home = findViewById(R.id.imageView2);
        Buildings air = new Buildings("Airbnb","https://play.google.com/store/apps/details?id=com.airbnb.android",R.drawable.air);
        Buildings zoop = new Buildings("Zoopla","https://play.google.com/store/apps/details?id=com.zoopla.activity",R.drawable.zoopla);
        Buildings rps = new Buildings("Rightmove Property Search","https://play.google.com/store/apps/details?id=com.rightmove.android",R.drawable.rm);
        Buildings sc = new Buildings("Student,com","https://play.google.com/store/apps/details?id=com.student.mobileapp",R.drawable.com);
        buildingslist.add(air);
        buildingslist.add(zoop);
        buildingslist.add(rps);
        buildingslist.add(sc);
        BuildingsA buildingsA = new BuildingsA(this,0,buildingslist);
        ListView listView = findViewById(R.id.listview3);
        listView.setAdapter(buildingsA);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1000= new Intent(Content3.this,Home.class);
                startActivity(intent1000);}});


    }
}