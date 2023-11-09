package com.example.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    public GridAdapter(Context context, ArrayList<String> text, ArrayList<Integer> image) {
        this.context = context;
        this.text = text;
        this.image = image;
    }

    Context context;
    ArrayList<String> text;
    ArrayList<Integer> image;

    @Override
    public int getCount() {
        return this.text.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_layout, parent, false);
        ImageView imageView = view.findViewById((R.id.imageView));
        TextView textView = view.findViewById(R.id.textView);


        textView.setText(text.get(position));
        imageView.setImageResource(image.get(position));


        return view;
    }
}
