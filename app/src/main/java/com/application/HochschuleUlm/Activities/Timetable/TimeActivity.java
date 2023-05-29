package com.application.HochschuleUlm.Activities.Timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.application.HochschuleUlm.Activities.MainActivity;
import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityTimeBinding;

public class TimeActivity extends AppCompatActivity {

    ActivityTimeBinding activityTimeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTimeBinding = ActivityTimeBinding.inflate(getLayoutInflater());
        setContentView(activityTimeBinding.getRoot());

        Intent intent = getIntent();

        if(intent.getStringExtra("name").equals("Programming3"))
        {
            activityTimeBinding.class1.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("Mobile Application Development"))
        {
            activityTimeBinding.class2.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("Programming1"))
        {

            activityTimeBinding.class3.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("MicroComputer"))
        {

            activityTimeBinding.class4.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("Computer Networks"))
        {

            activityTimeBinding.class5.setVisibility(View.VISIBLE);
        }

        if(intent.getStringExtra("name").equals("Algorithm"))
        {
            activityTimeBinding.class6.setVisibility(View.VISIBLE);

        }

        if(intent.getStringExtra("name").equals("Web Engineering"))
        {
            activityTimeBinding.class7.setVisibility(View.VISIBLE);

        }

        if(intent.getStringExtra("name").equals("Calculus1"))
        {
            activityTimeBinding.class8.setVisibility(View.VISIBLE);

        }

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, Timetable.class));
        finish();

    }
}