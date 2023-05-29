package com.application.HochschuleUlm.Activities.Timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.application.HochschuleUlm.Activities.MainActivity;
import com.application.HochschuleUlm.Adapters.TimeAdapter;
import com.application.HochschuleUlm.ModelClasses.Time_model;
import com.application.HochschuleUlm.databinding.ActivityTimetableBinding;

import java.util.ArrayList;

public class Timetable extends AppCompatActivity {

    ActivityTimetableBinding activityTimetableBinding;
    ArrayList<Time_model> time_models = new ArrayList<>();
    TimeAdapter timeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTimetableBinding = ActivityTimetableBinding.inflate(getLayoutInflater());
        setContentView(activityTimetableBinding.getRoot());
//  Timetable data
        time_models.add(new Time_model("Programming3"));
        time_models.add(new Time_model("Mobile Application Development"));
        time_models.add(new Time_model("Programming1"));
        time_models.add(new Time_model("MicroComputer"));
        time_models.add(new Time_model("Computer Networks"));
        time_models.add(new Time_model("Algorithm"));
        time_models.add(new Time_model("Web Engineering"));
        time_models.add(new Time_model("Calculus1"));


        activityTimetableBinding.timeRecycler.setLayoutManager(new LinearLayoutManager(this));
        timeAdapter = new TimeAdapter(this,this,time_models);
        activityTimetableBinding.timeRecycler.setAdapter(timeAdapter);

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}