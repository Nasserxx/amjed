package com.application.HochschuleUlm.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.HochschuleUlm.Activities.Timetable.TimeActivity;
import com.application.HochschuleUlm.R;
import com.application.HochschuleUlm.ModelClasses.Time_model;

import java.util.ArrayList;
import java.util.List;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.TimeViewDetails> {

    private List<Time_model> mArraylist;
    Context mContext;
    Activity mActivity;

    public TimeAdapter(Context context, Activity activity, ArrayList<Time_model> arrayList) {
        mActivity = activity;
        mContext = context;
        mArraylist = arrayList;
    }

    @NonNull
    @Override
    public TimeViewDetails onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.time_item, parent, false);
        return new TimeViewDetails(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeViewDetails holder, int position) {

        holder.text_time.setText(mArraylist.get(position).getName());

        holder.text_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.text_time.getText().toString().equals("Programming3"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","Programming3"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("Mobile Application Development"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","Mobile Application Development"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("Programming1"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","Programming1"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("MicroComputer"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","MicroComputer"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("Computer Networks"))
                {
                    mActivity.startActivity(new Intent(mActivity, TimeActivity.class).putExtra("name","Computer Networks"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("Algorithm"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","Algorithm"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("Web Engineering"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","Web Engineering"));
                    mActivity.finish();
                }
                else if(holder.text_time.getText().toString().equals("Calculus1"))
                {
                    mActivity.startActivity(new Intent(mActivity,TimeActivity.class).putExtra("name","Calculus1"));
                    mActivity.finish();
                }
            }
        });

    }


    @Override
    public int getItemCount() {

        return mArraylist.size();
    }


    public class TimeViewDetails extends RecyclerView.ViewHolder {

        private TextView text_time;

        public TimeViewDetails(@NonNull View itemView) {
            super(itemView);

            text_time = itemView.findViewById(R.id.text_time);

        }
    }

}
