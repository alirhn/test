package com.alirhn.mtf;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
Activity context;
String[] names;
String[] families;


    public MyAdapter(Activity context , String[] names , String[] families ) {
        super(context, R.layout.custom_adapter , names);
        this.context = context;
        this.names = names;
        this.families = families;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.custom_adapter , null , false);
        TextView textViewName = v.findViewById(R.id.tv_name);
        TextView textViewFamily = v.findViewById(R.id.tv_family);

        textViewFamily.setText(families[position]);
        textViewName.setText(names[position]);

        return v;
    }
}
