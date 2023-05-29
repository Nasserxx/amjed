package com.application.HochschuleUlm.Activities.Mensa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.application.HochschuleUlm.Activities.MainActivity;
import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityMealBinding;
import com.application.HochschuleUlm.databinding.ActivityMensaOffersBinding;

public class MealActivity extends AppCompatActivity {

    ActivityMealBinding activityMealBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMealBinding = ActivityMealBinding.inflate(getLayoutInflater());
        setContentView(activityMealBinding.getRoot());

        Intent intent = getIntent();

        if(intent.getStringExtra("name").equals("breakfast1"))
        {
            activityMealBinding.breakfast1.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("breakfast2"))
        {
            activityMealBinding.breakfast2.setVisibility(View.VISIBLE);

        }

        if(intent.getStringExtra("name").equals("lunch1"))
        {

            activityMealBinding.lunch1.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("lunch2"))
        {

            activityMealBinding.lunch2.setVisibility(View.VISIBLE);
        }



    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, MensaOffers.class));
        finish();

    }

}