package com.application.HochschuleUlm.Activities.Room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Filter;

import com.application.HochschuleUlm.Activities.MainActivity;
import com.application.HochschuleUlm.Adapters.PersonAdapter;
import com.application.HochschuleUlm.Adapters.RoomAdapter;
import com.application.HochschuleUlm.ModelClasses.PersonModel;
import com.application.HochschuleUlm.ModelClasses.RoomModel;
import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityRoomBinding;

import java.util.ArrayList;

public class RoomActivity extends AppCompatActivity {

    ActivityRoomBinding activityRoomBinding;
    RoomAdapter roomAdapter;
    ArrayList<RoomModel> roomModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRoomBinding = ActivityRoomBinding.inflate(getLayoutInflater());
        setContentView(activityRoomBinding.getRoot());

        activityRoomBinding.searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (activityRoomBinding.searchView.getText() != null && roomAdapter != null) {
                    roomAdapter.getFilter().filter(s, new Filter.FilterListener() {
                        @Override
                        public void onFilterComplete(int i) {
                            if (i == 0) {
                                activityRoomBinding.roomRecycler.setVisibility(View.GONE);
                                activityRoomBinding.txtNothing.setVisibility(View.VISIBLE);
                            } else {
                                activityRoomBinding.txtNothing.setVisibility(View.GONE);
                                activityRoomBinding.roomRecycler.setVisibility(View.VISIBLE);
                            }
                        }
                    });
                }
            }
        });


        // Add Room data here

        roomModels.add(new RoomModel("\nC++", "\nMain Building, first floor\nRoom: C1"));
        roomModels.add(new RoomModel("\nProgramming 1", "\nMain Building, second floor\nRoom: C4"));
        roomModels.add(new RoomModel( "\nJava", "\nMain Building, third floor\nRoom: C7"));
        roomModels.add(new RoomModel( "\nData Structures", "\nComputer Block, first floor\nRoom: B1"));
        roomModels.add(new RoomModel("\nAlgorithm", "\nComputer Block, first floor\nRoom: B4"));
        roomModels.add(new RoomModel( "\nWeb Designing", "\nComputer Block, second floor\nRoom: B6"));
        roomModels.add(new RoomModel( "\nPython", "\nAI Block, first floor\nRoom: A1"));
        roomModels.add(new RoomModel("\nML & AI", "\nAI Block, first floor\nRoom: A3"));

        activityRoomBinding.roomRecycler.setLayoutManager(new LinearLayoutManager(this));
        roomAdapter = new RoomAdapter(this, this, roomModels);
        activityRoomBinding.roomRecycler.setAdapter(roomAdapter);

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, MainActivity.class));
        finish();


    }
}