package com.application.HochschuleUlm.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.application.HochschuleUlm.Activities.Mensa.MensaOffers;
import com.application.HochschuleUlm.Activities.Person.PersonActivity;
import com.application.HochschuleUlm.Activities.Room.RoomActivity;
import com.application.HochschuleUlm.Activities.Timetable.Timetable;
import com.application.HochschuleUlm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.mensaOffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, MensaOffers.class));
                finish();

            }
        });

        activityMainBinding.timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Timetable.class));
                finish();

            }
        });

        activityMainBinding.personSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PersonActivity.class));
                finish();
            }
        });

        activityMainBinding.roomSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RoomActivity.class));
                finish();
            }
        });

        activityMainBinding.library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,LibraryActivity.class));
                finish();


            }
        });

        activityMainBinding.information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,InfoActivity.class));
                finish();

            }
        });

        activityMainBinding.map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MapActivity.class));
                finish();
            }
        });

        activityMainBinding.discussion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(MainActivity.this, DiscussionActivity.class));
                finish();


            }
        });




    }
}