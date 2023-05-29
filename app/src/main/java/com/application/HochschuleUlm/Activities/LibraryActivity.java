package com.application.HochschuleUlm.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Filter;

import com.application.HochschuleUlm.Adapters.LibraryAdapter;
import com.application.HochschuleUlm.ModelClasses.LibraryModel;
import com.application.HochschuleUlm.databinding.ActivityLibraryBinding;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    ActivityLibraryBinding activityLibraryBinding;
    LibraryAdapter libraryAdapter;
    ArrayList<LibraryModel> libraryModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLibraryBinding = ActivityLibraryBinding.inflate(getLayoutInflater());
        setContentView(activityLibraryBinding.getRoot());


        activityLibraryBinding.searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }


            @Override
            public void afterTextChanged(Editable s) {
                if (activityLibraryBinding.searchView.getText() != null && libraryAdapter != null) {
                    libraryAdapter.getFilter().filter(s, new Filter.FilterListener() {
                        @Override
                        public void onFilterComplete(int i) {
                            if (i == 0) {
                                activityLibraryBinding.libraryRecycler.setVisibility(View.GONE);
                                activityLibraryBinding.txtNothing.setVisibility(View.VISIBLE);
                            } else {
                                activityLibraryBinding.txtNothing.setVisibility(View.GONE);
                                activityLibraryBinding.libraryRecycler.setVisibility(View.VISIBLE);
                            }
                        }
                    });
                }
            }
        });


        // Add Library data here

        libraryModels.add(new LibraryModel("Algorithms and Data Structures"));
        libraryModels.add(new LibraryModel("Computer Programming"));
        libraryModels.add(new LibraryModel("Database Theory and Systems"));
        libraryModels.add(new LibraryModel("Functional Programming"));
        libraryModels.add(new LibraryModel("Human-Computer Interaction and Virtual Reality"));
        libraryModels.add(new LibraryModel("Computational Complexity"));
        libraryModels.add(new LibraryModel("Object-Oriented Analysis, Design, and Programming"));
        libraryModels.add(new LibraryModel("Software Design and Patterns"));
        libraryModels.add(new LibraryModel("Theory of Programming Languages"));



        activityLibraryBinding.libraryRecycler.setLayoutManager(new LinearLayoutManager(this));
        libraryAdapter = new LibraryAdapter(this,this, libraryModels);
        activityLibraryBinding.libraryRecycler.setAdapter(libraryAdapter);

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this,MainActivity.class));
        finish();


    }
}