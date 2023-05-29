package com.application.HochschuleUlm.Activities.Mensa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.application.HochschuleUlm.Activities.MainActivity;
import com.application.HochschuleUlm.databinding.ActivityMensaOffersBinding;

public class MensaOffers extends AppCompatActivity {

    ActivityMensaOffersBinding activityMensaOffersBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMensaOffersBinding = ActivityMensaOffersBinding.inflate(getLayoutInflater());
        setContentView(activityMensaOffersBinding.getRoot());

        activityMensaOffersBinding.breakfast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MensaOffers.this,MealActivity.class).putExtra("name","breakfast1"));
                finish();

            }
        });

        activityMensaOffersBinding.breakfast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MensaOffers.this,MealActivity.class).putExtra("name","breakfast2"));
                finish();

            }
        });

        activityMensaOffersBinding.lunch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MensaOffers.this,MealActivity.class).putExtra("name","lunch1"));
                finish();

            }
        });

        activityMensaOffersBinding.lunch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MensaOffers.this,MealActivity.class).putExtra("name","lunch2"));
                finish();

            }
        });


    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}