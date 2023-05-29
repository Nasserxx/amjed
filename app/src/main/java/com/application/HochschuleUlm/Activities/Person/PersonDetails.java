package com.application.HochschuleUlm.Activities.Person;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityPersonDetailsBinding;

import java.util.Arrays;

public class PersonDetails extends AppCompatActivity {

    ActivityPersonDetailsBinding activityPersonDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPersonDetailsBinding = ActivityPersonDetailsBinding.inflate(getLayoutInflater());
        setContentView(activityPersonDetailsBinding.getRoot());

        Intent intent = getIntent();
        String [] prefessors = new String[]{"Graf","Schied"};

        for (String prefessor:prefessors
             ) {
            if(intent.getStringExtra("name").equals(prefessor))
            {
                activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 731786\n\nEmail: Graf12@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
            }
        }
/*
        if(intent.getStringExtra("name").equals("Graf"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 731786\n\nEmail: Graf12@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Schied"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 456378\n\nEmail: Jtdst12@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Kratzer"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 447774\n\nEmail: asts@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Schied"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 7885855\n\nEmail: Jshh@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }
        if(intent.getStringExtra("name").equals("Gross"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 557777\n\nEmail: stjuth@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }
        if(intent.getStringExtra("name").equals("Strahnen"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 5786888\n\nEmail: strhth@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Frey"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 7785475\n\nEmail: fogul@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Steiper"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 55445878\n\nEmail: a3terg@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Baer"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 5445454\n\nEmail: fhilil@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }

        if(intent.getStringExtra("name").equals("Franz"))
        {
            activityPersonDetailsBinding.personDetails.setText("Name: Prof."+ intent.getStringExtra("name") +"\n\nContact: +49 7868786\n\nEmail: aregrg@gmail.com\n\nAddress: Block A, Room C4\n\nWork time: 08:00 - 13:00");
        }
*/
    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this,PersonActivity.class));
        finish();
    }
}