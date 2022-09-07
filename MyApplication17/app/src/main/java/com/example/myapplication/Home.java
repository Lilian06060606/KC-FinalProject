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

import com.google.android.material.snackbar.Snackbar;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView t7 = findViewById(R.id.textView7);
        t7.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        t7.setSelected(true);

        Button hwo = findViewById(R.id.hwo);
        Button rating = findViewById(R.id.rating);
        Button how = findViewById(R.id.helpp);
        Button share = findViewById(R.id.share);
        Button follow = findViewById(R.id.follow);
        Button society = findViewById(R.id.society);
        Button help = findViewById(R.id.help);
        ImageView home = findViewById(R.id.imageView2);
        ImageView uk = findViewById(R.id.uk);
        ImageView usa = findViewById(R.id.usa);
        ImageView aus = findViewById(R.id.aus);
        ImageView canada = findViewById(R.id.canada);
        ImageView newz = findViewById(R.id.newz);
        ImageView france = findViewById(R.id.france);
        ImageView sau = findViewById(R.id.sau);
        ImageView irland = findViewById(R.id.erland);
        ImageView egy = findViewById(R.id.egy);
        ImageView jor = findViewById(R.id.jor);
        ImageView bah = findViewById(R.id.bah);
Button register = findViewById(R.id.register);
ImageView erule = findViewById(R.id.image19);


erule.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent1010 = new Intent(Home.this,Rules.class);
        startActivity(intent1010);
    }
});


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Home.this,Home.class);
                startActivity(intent4);
                overridePendingTransition(R.anim.anim5,R.anim.anim4);
                finish();}});

        hwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Home.this,Hwo.class);
                startActivity(intent4);}});

       rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button sendy,cancel;
                RatingBar ratingBar;
                AlertDialog.Builder builder= new AlertDialog.Builder(Home.this);
                View view3 = LayoutInflater.from(Home.this).inflate(R.layout.dialog,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view3);

                sendy = view3.findViewById(R.id.button000);
                cancel = view3.findViewById(R.id.button0000);
                ratingBar= view3 .findViewById(R.id.ratingBar2);

                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

                sendy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s = String .valueOf( ratingBar.getRating());
                        Toast.makeText(getApplicationContext(),s+"نجمة",Toast.LENGTH_SHORT).show();
                        Snackbar snackbar = Snackbar.make(view, "تم إرسال التقييم بنجاح!",Snackbar.LENGTH_SHORT);
                        snackbar.show();

                    }});


                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.cancel();
                    }});
                alertDialog.show();

            }
        });
        how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
       help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});

       follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();
            }});

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent4 = new Intent(Intent.ACTION_SEND);
               intent4.setType("text/plain");
               String body = "Download This App!";
               String sub= "http://play.google.com";
               intent4.putExtra(Intent.EXTRA_TEXT,body);
                intent4.putExtra(Intent.EXTRA_TEXT,sub);
                startActivity(Intent.createChooser(intent4,"Share Using:"));}});

        society.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
        egy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});

       jor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
       bah .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
       sau .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
       usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
        aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});

        irland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
        newz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});
        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});

       france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this,"قريبًا...",Toast.LENGTH_SHORT).show();}});

      uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent inten8 = new Intent(Home.this,Uk.class);
            startActivity(inten8);}});
       register.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                ViewGroup viewGroup = findViewById(android.R.id.content);
                Button cancel;

                AlertDialog.Builder builder= new AlertDialog.Builder(Home.this);
                View view9 = LayoutInflater.from(Home.this).inflate(R.layout.dialog11,viewGroup,false);
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