package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Uk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);
        Button uni = findViewById(R.id.univer);
        Button food = findViewById(R.id.food);
        Button trans = findViewById(R.id.trans);
Button buildings = findViewById(R.id.building);
Button selling = findViewById(R.id.selling);
        Button money = findViewById(R.id.coins);
        Button lang = findViewById(R.id.lang);
        ImageView home = findViewById(R.id.imageView2);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(Uk.this, Home.class);
                startActivity(intent10);
            }
        });
        uni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent40 = new Intent(Uk.this, Content.class);
                startActivity(intent40);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent50 = new Intent(Uk.this, Content1.class);
                startActivity(intent50);
            }
        });
trans.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent101 = new Intent(Uk.this,Content2.class);
        startActivity(intent101);
    }
});
      buildings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent102 = new Intent(Uk.this,Content3.class);
                startActivity(intent102);
            }
        });
selling.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent107 = new Intent(Uk.this,Content4.class);
        startActivity(intent107);
    }
});
lang.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent108 = new Intent(Uk.this,EnglishC.class);
        startActivity(intent108);
    }
});
        money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent109 = new Intent(Uk.this,Money.class);
                startActivity(intent109);
            }
        });

    }

}