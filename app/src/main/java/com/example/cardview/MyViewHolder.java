package com.example.cardview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {


    TextView textView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=(TextView)itemView.findViewById(R.id.cityID);

    }
}
