package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Money extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        ImageView home = findViewById(R.id.imageView2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Money.this,Home.class);
                startActivity(intent4);
                overridePendingTransition(R.anim.anim5,R.anim.anim4);
                finish();}});
        ImageView up7 = findViewById(R.id.up7);
        ImageView up8 = findViewById(R.id.up8);
        ImageView up9 = findViewById(R.id.up9);
        up7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(Money.this);
                View view9 = LayoutInflater.from(Money.this).inflate(R.layout.dialog7,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view9);


                cancel = view9.findViewById(R.id.button000);


                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.cancel();
                    }});
                alertDialog.show();

            }
        });
        up8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(Money.this);
                View view9 = LayoutInflater.from(Money.this).inflate(R.layout.dialog8,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view9);


                cancel = view9.findViewById(R.id.button000);


                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.cancel();
                    }});
                alertDialog.show();

            }
        });
up9.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent200 = new Intent (Money.this, MC.class);
        startActivity(intent200);
    }
});
    }
}