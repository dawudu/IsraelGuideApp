package com.example.manthole.israelguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by manthole on 16 Aug 2017.
 */

public class Jerusalem extends AppCompatActivity {

    Animation animSequential, animBlink;
    ImageView defaultImage;
    TextView txtDescription;
    Button btnRequestTourGuider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_cities);


        defaultImage = (ImageView) findViewById(R.id.DefaultImage);
        txtDescription = (TextView) findViewById(R.id.txtdescprition);

        btnRequestTourGuider = (Button) findViewById(R.id.btnRequestTourist);
        btnRequestTourGuider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), RecyclerTourGuide.class);
                startActivity(intent);


            }
        });


        defaultImage.setImageResource(R.drawable.jerusalem);
        txtDescription.setText(R.string.jerusalem_description);
        Intent intent = getIntent();
        Cities cities = (Cities) intent.getSerializableExtra("Jerusalem");


        animSequentialMethod();


        animBlinkMethod();


    }


    //SlideUpAnimation
    public void animSequentialMethod() {


        animSequential = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_animation);

        defaultImage.startAnimation(animSequential);

    }

    //MoveinAnimation

    public void animBlinkMethod() {

        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
        txtDescription.startAnimation(animBlink);

    }
}
