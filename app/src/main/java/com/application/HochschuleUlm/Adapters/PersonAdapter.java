package com.application.HochschuleUlm.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.HochschuleUlm.Activities.Person.PersonDetails;
import com.application.HochschuleUlm.ModelClasses.PersonModel;
import com.application.HochschuleUlm.R;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewDetails> {

    private List<PersonModel> mArraylist;
    private List<PersonModel> filterData;
    public PersonAdapter.ItemFilter mFilter = new PersonAdapter.ItemFilter();
    Context mContext;
    Activity mActivity;

    public PersonAdapter(Context context, Activity activity, ArrayList<PersonModel> arrayList) {
        mActivity = activity;
        mContext = context;
        mArraylist = arrayList;
        filterData = arrayList;
    }

    @NonNull
    @Override
    public PersonViewDetails onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.person_item, parent, false);
        return new PersonViewDetails(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewDetails holder, int position) {

        holder.text_name.setText(mArraylist.get(position).getName());
        holder.text_desig.setText(mArraylist.get(position).getDesignation());
        holder.imageView.setImageResource(mArraylist.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(holder.text_name.getText().equals("Graf")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Graf"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Schied")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Schied"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Kratzer")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Kratzer"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Schied")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Schied"));
                    mActivity.finish();
                }


                if(holder.text_name.getText().equals("Gross")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Gross"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Strahnen")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Strahnen"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Frey")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Frey"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Steiper")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Steiper"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Baer")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Baer"));
                    mActivity.finish();
                }

                if(holder.text_name.getText().equals("Franz")) {

                    mActivity.startActivity(new Intent(mActivity, PersonDetails.class).putExtra("name", "Franz"));
                    mActivity.finish();
                }
            }
        });

    }


    @Override
    public int getItemCount() {

        return mArraylist.size();
    }


    public class PersonViewDetails extends RecyclerView.ViewHolder {

        private TextView text_name,text_desig;
        ImageView imageView;

        public PersonViewDetails(@NonNull View itemView) {
            super(itemView);

            text_name = itemView.findViewById(R.id.text_name);
            text_desig = itemView.findViewById(R.id.text_desig);
            imageView = itemView.findViewById(R.id.imageview);

        }
    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint != null && constraint.length() > 0) {
                ArrayList<PersonModel> filterList = new ArrayList<PersonModel>();
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
            mArraylist = (ArrayList<PersonModel>) results.values;
            notifyDataSetChanged();
        }
    }

    public Filter getFilter() {
        return mFilter;
    }


}
