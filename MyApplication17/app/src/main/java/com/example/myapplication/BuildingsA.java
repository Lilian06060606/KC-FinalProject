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

public class BuildingsA extends ArrayAdapter {
    List<Buildings> buildingsList;
    Context context;

    public BuildingsA(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
     buildingsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view13 = LayoutInflater.from(getContext()).inflate(R.layout.buildingo,parent,false);

        Buildings currentbuild = buildingsList.get(position);

        TextView name = view13.findViewById(R.id.textView26);
        name.setText(currentbuild.getBulname());
        TextView link = view13.findViewById(R.id.textView27);
        link.setText(currentbuild.getBulink());
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(currentbuild.getBulink()));
                context.startActivity(i);           }
        });
        ImageView imguni = view13.findViewById(R.id.button23);
        imguni.setImageResource(currentbuild.getBulimg());
        link.setMovementMethod(LinkMovementMethod.getInstance());

        return view13;

    }
}
