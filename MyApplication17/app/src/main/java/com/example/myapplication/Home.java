package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView t7 = findViewById(R.id.textView7);
        t7.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        t7.setSelected(true);

        Button hwo = findViewById(R.id.hwo);
        Button rate = findViewById(R.id.rate);
        Button how = findViewById(R.id.how);
        Button share = findViewById(R.id.share);
        Button follow = findViewById(R.id.follow);
        Button society = findViewById(R.id.society);
        Button help = findViewById(R.id.help);
        ImageView home = findViewById(R.id.imageView2);

        LinearLayout lay = findViewById(R.id.card);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Home.this,Home.class);
                startActivity(intent4);
                overridePendingTransition(R.anim.anim5,R.anim.anim4);
                finish();
            }
        });
        hwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Home.this,Hwo.class);
                startActivity(intent4);

            }
        });
       rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           Dialog dialog = new Dialog(Home.this);
           dialog.setContentView(R.layout.dialog);
           dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
dialog.show();
            }
        });
        how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();

            }
        });
       help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();

            }
        });
       follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent4 = new Intent(Intent.ACTION_SEND);
               intent4.setType("text/plain");
               String body = "Download This App!";
               String sub= "http://play.google.com";
               intent4.putExtra(Intent.EXTRA_TEXT,body);
                intent4.putExtra(Intent.EXTRA_TEXT,sub);
                startActivity(Intent.createChooser(intent4,"Share Using:"));



            }
        });
society.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();

            }
        });
rate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});
    }
}