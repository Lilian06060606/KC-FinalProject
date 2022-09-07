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

public class TransporationA extends ArrayAdapter {
    List<Transporation> transporationList;
    Context context;

    public TransporationA(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        transporationList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.transpory,parent,false);

       Transporation currenttrans = transporationList.get(position);

        TextView name = view.findViewById(R.id.textView24);
        name.setText(currenttrans.getTraname());
        TextView link = view.findViewById(R.id.textView25);
        link.setText(currenttrans.getTranlink());
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(currenttrans.getTranlink()));
                context.startActivity(i);           }
        });
        ImageView imguni = view.findViewById(R.id.button22);
        imguni.setImageResource(currenttrans.getTransimg());
        link.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

}
