package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList CityName=new ArrayList<>(Arrays.asList("Dhaka","Rangpur","Bogura","Gaibandha","Khulna","Rajsahi","Nator","Hili","Barisal","Coxs-Bazar","Dinajpur","Lalmonirhat","Kurigram","Pansogor","CapaiNawab ganj","Brammon Baria","Soyedpur","Hobiganj","Madarganj","Mirpur"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this,CityName);
        recyclerView.setAdapter(adapter);

    }
}