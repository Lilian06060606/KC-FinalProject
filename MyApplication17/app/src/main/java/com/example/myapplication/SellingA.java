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

public class SellingA extends ArrayAdapter {
    List<Selling> sellingList;
    Context context;
    public SellingA(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
       sellingList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View view = LayoutInflater.from(getContext()).inflate(R.layout.buying,parent,false);

        Selling currentsel = sellingList.get(position);

        TextView name = view.findViewById(R.id.textView27);
        name.setText( currentsel.getSelname());
        TextView link = view.findViewById(R.id.textView28);
        link.setText( currentsel.getSellink());
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse( currentsel.getSellink()));
                context.startActivity(i);           }
        });
        ImageView imguni = view.findViewById(R.id.button25);
        imguni.setImageResource( currentsel.getSelimg());
        link.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }
}
