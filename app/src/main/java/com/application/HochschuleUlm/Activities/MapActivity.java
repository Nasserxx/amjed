package com.application.HochschuleUlm.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityMapBinding;

public class MapActivity extends AppCompatActivity {

    ActivityMapBinding activityMapBinding;
    String uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMapBinding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(activityMapBinding.getRoot());

        activityMapBinding.imageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ActivityCompat.checkSelfPermission(MapActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(MapActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 102);

                } else {
                    Intent m_intent = new Intent(Intent.ACTION_PICK);
                    m_intent.setType("image/*");
                    startActivityForResult(m_intent, 1);
                }

            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode == Activity.RESULT_OK && requestCode == 1) {

            if (data != null) {

                uri = data.getData().toString();
                activityMapBinding.galleryImage.setImageURI(Uri.parse(uri));
            }

        }

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}