package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class EnglishC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_c);
        ImageView home = findViewById(R.id.imageView2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(EnglishC.this,Home.class);
                startActivity(intent4);
                overridePendingTransition(R.anim.anim5,R.anim.anim4);
                finish();}});

        ImageView up1 = findViewById(R.id.up1);
        ImageView up2 = findViewById(R.id.up2);
        ImageView up3 = findViewById(R.id.up3);
        ImageView up4 = findViewById(R.id.up4);
        ImageView up5 = findViewById(R.id.up5);
        ImageView up6 = findViewById(R.id.up6);

       up1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(EnglishC.this);
                View view9 = LayoutInflater.from(EnglishC.this).inflate(R.layout.dialog1,viewGroup,false);
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
        up2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;
                AlertDialog.Builder builder= new AlertDialog.Builder(EnglishC.this);
                View view9 = LayoutInflater.from(EnglishC.this).inflate(R.layout.dialog2,viewGroup,false);
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
                alertDialog.show();}});
        up3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(EnglishC.this);
                View view9 = LayoutInflater.from(EnglishC.this).inflate(R.layout.dialog3,viewGroup,false);
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
                alertDialog.show();}});
        up4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(EnglishC.this);
                View view9 = LayoutInflater.from(EnglishC.this).inflate(R.layout.dialog4,viewGroup,false);
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
        up5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(EnglishC.this);
                View view9 = LayoutInflater.from(EnglishC.this).inflate(R.layout.dialog5,viewGroup,false);
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
        up6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(EnglishC.this);
                View view9 = LayoutInflater.from(EnglishC.this).inflate(R.layout.dialog6,viewGroup,false);
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


    }
}