package com.application.HochschuleUlm.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.HochschuleUlm.Activities.Room.RoomDetails;
import com.application.HochschuleUlm.ModelClasses.RoomModel;
import com.application.HochschuleUlm.R;

import java.util.ArrayList;
import java.util.List;

public class DiscussionAdapter extends RecyclerView.Adapter<DiscussionAdapter.DiscussionViewDetails>{

    private List<RoomModel> mArraylist;
    Context mContext;
    Activity mActivity;

    public DiscussionAdapter(Context context, Activity activity, ArrayList<RoomModel> arrayList) {
        mActivity = activity;
        mContext = context;
        mArraylist = arrayList;

    }


    @NonNull
    @Override
    public DiscussionViewDetails onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.room_item, parent, false);
        return new DiscussionViewDetails(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscussionViewDetails holder, int position) {



        holder.text_subject.setText(mArraylist.get(position).getName());
        holder.text_description.setText(mArraylist.get(position).getLocation());


    }


    @Override
    public int getItemCount() {

        return mArraylist.size();
    }


    public class DiscussionViewDetails extends RecyclerView.ViewHolder {

        private TextView text_subject,text_description;

        public DiscussionViewDetails(@NonNull View itemView) {
            super(itemView);

            text_subject = itemView.findViewById(R.id.text_name);
            text_description = itemView.findViewById(R.id.text_location);

        }
    }

}
