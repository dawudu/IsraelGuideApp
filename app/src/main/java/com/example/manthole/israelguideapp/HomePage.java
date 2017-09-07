package com.example.manthole.israelguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {

    Animation animFadeIn, animFadeOut, animBlink, animZoomIn, animZoomOut, animRotate, animMovein, animSlideUp, animSlideDown,
            animBounce, animSequential, animTogether, animCrossFadeIn, animCrossFadeOut;
    private ImageView ImageHomepage;
    private Button btnCityTours, btnExit, btnHotelsAccomodation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageHomepage = (ImageView) findViewById(R.id.imageHomepage);

        btnCityTours = (Button) findViewById(R.id.btnCityTours);
        btnHotelsAccomodation = (Button) findViewById(R.id.btnHotelsAccomodation);
        btnExit = (Button) findViewById(R.id.btnExit);


        btnCityTours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, RecyclerActivity.class);
                startActivity(intent);

            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        btnHotelsAccomodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, HotelsAccomodation.class);
                startActivity(intent);
            }
        });


        animate();


    }


    // Animation Methods
    public void animate() {

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);

        ImageHomepage.startAnimation(animFadeIn);
    }


}

