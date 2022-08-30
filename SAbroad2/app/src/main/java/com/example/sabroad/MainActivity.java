package com.example.sabroad;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    ImageView i1,i3,i4;
    LinearLayout lay,layy;
    Context context;

    private  static int Splash_timeout=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
        i1=findViewById(R.id.lottie);
        i3=findViewById(R.id.imageView3);
        i4=findViewById(R.id.imageView4);
        lay = findViewById(R.id.lay);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,WS.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim4,R.anim.anim5);
                finish();

            }
        },Splash_timeout);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation);
        t1.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation1);
        i1.startAnimation(animation1);
        Animation animatio3 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim6);
        i3.startAnimation(animatio3);
        Animation animatio4 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim7);
        i4.startAnimation(animatio4);

    }
}