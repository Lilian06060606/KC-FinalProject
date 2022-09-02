package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static int Splash_timeout=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = findViewById(R.id.textView);
        ImageView i1 = findViewById(R.id.imageView3);
        ImageView i4 = findViewById(R.id.imageView4);
        ImageView i3 = findViewById(R.id.lottie);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Ws.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim4,R.anim.anim5);
                finish();

            }
        },Splash_timeout);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation);
        t1.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation1);
        i3.startAnimation(animation1);
        Animation animatio3 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim6);
        i1.startAnimation(animatio3);
        Animation animatio4 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim7);
        i4.startAnimation(animatio4);


    }
}