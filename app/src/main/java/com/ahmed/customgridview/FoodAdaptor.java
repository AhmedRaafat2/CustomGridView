package com.ahmed.customgridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdaptor  extends ArrayAdapter<Food>{


    public FoodAdaptor(@NonNull Context context, @NonNull ArrayList objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_grid,parent,false);
        TextView textView = convertView.findViewById(R.id.title_from_custom_grid);
        TextView textView1 = convertView.findViewById(R.id.price_from_custom_grid);
        ImageView imageView = convertView.findViewById(R.id.image_from_custom_grid);


        Food food = getItem(position);
        imageView.setImageResource(food.getImageId());
        textView.setText(food.getTitle());
        textView1.setText(food.getPrice());


        return convertView;
    }

}
