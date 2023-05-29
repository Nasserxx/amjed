package com.application.HochschuleUlm.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {

    ActivityInfoBinding activityInfoBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityInfoBinding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(activityInfoBinding.getRoot());

        activityInfoBinding.infoText.setText("As a partner of the THU, the Studierendenwerk Ulm ensures the best possible social framework conditions so that students can achieve a successful degree. As a non-profit organization, the Studierendenwerk is fundamentally not set up to make a profit and can therefore offer its services at an optimal and fair price-performance ratio.\n\n" +
        "Our portfolio includes approximately 50,000 books, journals, newspapers and media, as well as 170,000 online media. As part of campus licenses, we provide databases for specialist literature, standards and training videos as well as around 80,000 eBooks and 13,000 eJournals. We offer training courses for the effective use of our continuously updated inventory. All members of the Ulm University of Applied Sciences and external parties are authorized to use it.\n\n " +
                "As a university for technology, information technology and media, the Technical University of Ulm is active in specialist areas with a traditionally high proportion of men. Our goal is to get girls and women just as enthusiastic about technical professions as we are already doing with boys and men - for this we have to and want to put in some effort.\n" +
                "\n" +
                "The aim is not to give women preferential treatment, but to offer everyone the same opportunities for a successful study and working life at our university. In order to help represent the interests of those who are underrepresented at the university, we have set up a team of equal opportunities and equal opportunities officers who are available to all members of the university as a contact person. To ensure that students with disabilities or chronic illnesses are not disadvantaged in their studies, the Ulm University of Applied Sciences has created the office of officer for students with disabilities.");


    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}