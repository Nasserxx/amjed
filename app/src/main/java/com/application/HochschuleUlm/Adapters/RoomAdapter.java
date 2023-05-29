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

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewDetails>{

    private List<RoomModel> mArraylist;
    private List<RoomModel> filterData;
    public RoomAdapter.ItemFilter mFilter = new RoomAdapter.ItemFilter();
    Context mContext;
    Activity mActivity;

    public RoomAdapter(Context context, Activity activity, ArrayList<RoomModel> arrayList) {
        mActivity = activity;
        mContext = context;
        mArraylist = arrayList;
        filterData = arrayList;
    }

    @NonNull
    @Override
    public RoomViewDetails onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.room_item, parent, false);
        return new RoomViewDetails(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewDetails holder, int position) {

        holder.text_name.setText(mArraylist.get(position).getName());
        holder.text_location.setText(mArraylist.get(position).getLocation());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(holder.text_name.getText().toString().contains("C++"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                    .putExtra("name","1"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("Programming"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","2"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("Java"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","3"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("Data Structures"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","4"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("Algorithm"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","5"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("Web Designing"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","6"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("Python"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","7"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().toString().contains("ML & AI"))
                {
                    mActivity.startActivity(new Intent(mActivity, RoomDetails.class)
                            .putExtra("name","8"));
                    mActivity.finish();
                }


            }
        });


    }


    @Override
    public int getItemCount() {

        return mArraylist.size();
    }


    public class RoomViewDetails extends RecyclerView.ViewHolder {

        private TextView text_name,text_location;

        public RoomViewDetails(@NonNull View itemView) {
            super(itemView);

            text_name = itemView.findViewById(R.id.text_name);
            text_location = itemView.findViewById(R.id.text_location);

        }
    }


    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint != null && constraint.length() > 0) {
                ArrayList<RoomModel> filterList = new ArrayList<RoomModel>();
                for (int i = 0; i < filterData.size(); i++) {

                    if ((filterData.get(i).getName().toUpperCase())
                            .contains(constraint.toString().toUpperCase())) {

                        filterList.add(filterData.get(i));
                    }
                }
                results.count = filterList.size();
                results.values = filterList;

            } else {
                results.count = filterData.size();
                results.values = filterData;
            }
            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mArraylist = (ArrayList<RoomModel>) results.values;
            notifyDataSetChanged();
        }
    }

    public Filter getFilter() {
        return mFilter;
    }

}
