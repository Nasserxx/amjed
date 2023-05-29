package com.application.HochschuleUlm.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.application.HochschuleUlm.Adapters.DiscussionAdapter;
import com.application.HochschuleUlm.ModelClasses.RoomModel;
import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityDisscusionBinding;

import java.util.ArrayList;

public class DiscussionActivity extends AppCompatActivity {

    ActivityDisscusionBinding activityDisscusionBinding;
    DiscussionAdapter discussionAdapter;
    ArrayList<RoomModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDisscusionBinding = ActivityDisscusionBinding.inflate(getLayoutInflater());
        setContentView(activityDisscusionBinding.getRoot());

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);

        EditText subject = dialog.findViewById(R.id.subject);
        EditText description = dialog.findViewById(R.id.description);
        Button btn_submit = dialog.findViewById(R.id.btn_submit);



        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n =0;

                activityDisscusionBinding.discussionRecycler.setLayoutManager(new LinearLayoutManager(DiscussionActivity.this));
                arrayList.add(new RoomModel("Subject: " + subject.getText().toString(),"Description: " + description.getText().toString()));
                discussionAdapter = new DiscussionAdapter(DiscussionActivity.this,DiscussionActivity.this,arrayList);
                activityDisscusionBinding.discussionRecycler.setAdapter(discussionAdapter);

                dialog.dismiss();

            }
        });

        activityDisscusionBinding.discussionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.show();

            }
        });

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}