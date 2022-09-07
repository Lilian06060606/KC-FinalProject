package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FoodA extends ArrayAdapter <Food> {
   List<Food> foodList;
    Context context;
    public FoodA(@NonNull Context context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);
        this.context=context;
        foodList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view9 = LayoutInflater.from(getContext()).inflate(R.layout.foodyum,parent,false);
        Food currentf=foodList.get(position);
        TextView name = view9.findViewById(R.id.textView19);
        name.setText(currentf.getFoodname());
        TextView link = view9.findViewById(R.id.textView17);
        ImageView imgf = view9.findViewById(R.id.button21);
        imgf.setImageResource(currentf.getFoodimg());
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(currentf.getFoodlink()));
                context.startActivity(i);}});
        link.setMovementMethod(LinkMovementMethod.getInstance());
        return view9;
    }
}

