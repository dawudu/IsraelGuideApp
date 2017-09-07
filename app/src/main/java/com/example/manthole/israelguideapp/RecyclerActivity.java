package com.example.manthole.israelguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {


    Animation animSlideUp;
    Recycler recycler;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        recyclerView = (RecyclerView) findViewById(R.id.recycleview);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Cities> citiesList = new ArrayList<>();

        //City1
        Cities city1 = new Cities();

        city1.setCityName("Abugosh");
        city1.setImage1(R.drawable.abugosh);


        //City2
        Cities city2 = new Cities();

        city2.setCityName("Acreakko");
        city2.setImage1(R.drawable.acreakko);


        //City3
        Cities city3 = new Cities();


        city3.setCityName("Ashdod");
        city3.setImage1(R.drawable.ashdod);

        //City4
        Cities city4 = new Cities();

        city4.setCityName("Haifa");
        city4.setImage1(R.drawable.haifa);


        //City5
        Cities city5 = new Cities();

        city5.setCityName("BatShlomo");
        city5.setImage1(R.drawable.batshlomo);


        //City6
        Cities city6 = new Cities();

        city6.setCityName("Jerusalem");
        city6.setImage1(R.drawable.jerusalem);


        //City7
        Cities city7 = new Cities();
        city7.setCityName("Tel Aviv");
        city7.setImage1(R.drawable.telaviv);


        //City8
        Cities city8 = new Cities();
        city8.setCityName("Tiberias");
        city8.setImage1(R.drawable.tiberias);


//
        citiesList.add(city1);
        citiesList.add(city2);
        citiesList.add(city3);
        citiesList.add(city4);
        citiesList.add(city5);
        citiesList.add(city6);
        citiesList.add(city7);
        citiesList.add(city8);

        recycler = new Recycler(this, citiesList);
        recyclerView.setAdapter(recycler);

    }


}
