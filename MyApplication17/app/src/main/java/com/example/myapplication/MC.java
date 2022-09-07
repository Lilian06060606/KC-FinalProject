package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.R;




public class MC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc);
        EditText currentnumb = findViewById(R.id.editTextTextPersonName);
        Spinner from = findViewById(R.id.spinner);
        Spinner to= findViewById(R.id.spinner1);
        Button convert = findViewById(R.id.button50);
        TextView result = findViewById(R.id.textView50);
        String[]list = {"GBP","KD"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
convert.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Double total ;
        Double value =Double.parseDouble(currentnumb.getText().toString());
        if (from.getSelectedItem().toString()=="GBP"&&to.getSelectedItem().toString()=="KD"){
            total=value*0.716162;
            String res=String.valueOf(total);
            result.setText(res);


        }else if (from.getSelectedItem().toString()=="KD"&&to.getSelectedItem().toString()=="GBP"){
            total=value*2.79221;
            String res=String.valueOf(total);
            result.setText(res);

        }

    }
});


    }
}