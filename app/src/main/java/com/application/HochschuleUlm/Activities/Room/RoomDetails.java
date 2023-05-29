package com.application.HochschuleUlm.Activities.Room;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.application.HochschuleUlm.databinding.ActivityRoomDetailsBinding;

public class RoomDetails extends AppCompatActivity {

    ActivityRoomDetailsBinding activityRoomDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRoomDetailsBinding = ActivityRoomDetailsBinding.inflate(getLayoutInflater());
        setContentView(activityRoomDetailsBinding.getRoot());

        Intent intent = getIntent();

        if(intent.getStringExtra("name").equals("1"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nMain Building, first floor\n\nRoom: C1");
        }

        if(intent.getStringExtra("name").equals("2"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nMain Building, second floor\n\nRoom: C4");
        }

        if(intent.getStringExtra("name").equals("3"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nMain Building, third floor\n\nRoom: C7");
        }

        if(intent.getStringExtra("name").equals("4"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nComputer Block, first floor\n\nRoom: B1");
        }
        if(intent.getStringExtra("name").equals("5"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nComputer Block, first floor\n\nRoom: B4");
        }
        if(intent.getStringExtra("name").equals("6"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nComputer Block, second floor\n\nRoom: B6");
        }

        if(intent.getStringExtra("name").equals("7"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nAI Block, first floor\n\nRoom: A1");
        }

        if(intent.getStringExtra("name").equals("8"))
        {
            activityRoomDetailsBinding.roomDetails.setText("\nAI Block, first floor\n\nRoom: A3");
        }

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, RoomActivity.class));
        finish();
    }
}