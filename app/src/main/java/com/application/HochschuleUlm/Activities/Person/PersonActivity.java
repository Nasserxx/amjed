package com.application.HochschuleUlm.Activities.Person;

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
import com.application.HochschuleUlm.ModelClasses.PersonModel;
import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityPersonBinding;

import java.util.ArrayList;

public class PersonActivity extends AppCompatActivity {

    ActivityPersonBinding activityPersonBinding;
    PersonAdapter personAdapter;
    ArrayList<PersonModel> personModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPersonBinding = ActivityPersonBinding.inflate(getLayoutInflater());
        setContentView(activityPersonBinding.getRoot());

        activityPersonBinding.searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (activityPersonBinding.searchView.getText() != null && personAdapter != null) {
                    personAdapter.getFilter().filter(s, new Filter.FilterListener() {
                        @Override
                        public void onFilterComplete(int i) {
                            if (i == 0) {
                                activityPersonBinding.personRecycler.setVisibility(View.GONE);
                                activityPersonBinding.txtNothing.setVisibility(View.VISIBLE);
                            } else {
                                activityPersonBinding.txtNothing.setVisibility(View.GONE);
                                activityPersonBinding.personRecycler.setVisibility(View.VISIBLE);
                            }
                        }
                    });
                }
            }
        });


        // Add person data here

        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Graf","MAD Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Schied","TCS Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Kratzer","JAVA Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Schied","Algorithm Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Gross","Math Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Strahnen","MicroComputer Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Frey","TFCS Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Steiper","ICTS Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Baer","C++ Professor"));
        personModels.add(new PersonModel(R.drawable.ic_baseline_person_24,"Franz","Seminar Professor"));


        activityPersonBinding.personRecycler.setLayoutManager(new LinearLayoutManager(this));
        personAdapter = new PersonAdapter(this,this,personModels);
        activityPersonBinding.personRecycler.setAdapter(personAdapter);

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, MainActivity.class));
        finish();


    }
}