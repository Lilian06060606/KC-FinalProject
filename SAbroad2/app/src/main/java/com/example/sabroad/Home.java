package com.example.sabroad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView home =findViewById(R.id.imageView5);
        ImageView like = findViewById(R.id.imageView6);
        ImageView noti = findViewById(R.id.imageView8);
        ImageView prof = findViewById(R.id.imageView5);
        TextView name1 = findViewById(R.id.textView4);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        name1.setText(" حياك"+name);

    }
}