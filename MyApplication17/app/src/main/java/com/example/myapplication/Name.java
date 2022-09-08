package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        Button start = findViewById(R.id.button1);
        EditText edtname = findViewById(R.id.editTextTextPersonName12);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtname .getText().toString().equals("")) {
                    Toast.makeText(Name.this, "املأ الفراغ", Toast.LENGTH_SHORT).show();
                } else {
                    String name = edtname.getText().toString();
                    edtname.getText().toString();
                    Intent intent3 = new Intent(Name.this,Home.class);
                    String namo= edtname.getText().toString();
                    intent3.putExtra("name", namo);
                    startActivity(intent3);
                    overridePendingTransition(R.anim.anim4,R.anim.anim5);
                    finish();

                }}
        });
    }
}