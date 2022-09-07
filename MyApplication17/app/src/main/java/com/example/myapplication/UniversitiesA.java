package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.net.URI;
import java.net.URL;
import java.util.List;

public class UniversitiesA  extends ArrayAdapter<Universities> {
List<Universities> universitiesList;
Context context;
    public UniversitiesA(@NonNull Context context, int resource,@NonNull List<Universities> objects) {
        super(context, resource, objects);
        this.context=context;
        universitiesList=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.universities,parent,false);

Universities currentuni = universitiesList.get(position);


        TextView name = view.findViewById(R.id.textView14);
        name.setText(currentuni.getName());
        TextView link = view.findViewById(R.id.textView16);
       link.setText(currentuni.getUrls());
        ImageView imguni = view.findViewById(R.id.button20);
        imguni.setImageResource(currentuni.getUniimg());
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(currentuni.getUrls()));
                context.startActivity(i);           }
        }); link.setMovementMethod(LinkMovementMethod.getInstance());
        ImageView descc = view.findViewById(R.id.image19);


        return view;
    }

}
