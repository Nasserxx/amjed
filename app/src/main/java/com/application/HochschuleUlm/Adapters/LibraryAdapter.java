package com.application.HochschuleUlm.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.application.HochschuleUlm.ModelClasses.LibraryModel;
import com.application.HochschuleUlm.R;

import java.util.ArrayList;
import java.util.List;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.LibraryViewDetails> {

    private List<LibraryModel> mArraylist;
    private List<LibraryModel> filterData;
    public LibraryAdapter.ItemFilter mFilter = new LibraryAdapter.ItemFilter();
    Context mContext;
    Activity mActivity;

    public LibraryAdapter(Context context, Activity activity, ArrayList<LibraryModel> arrayList) {
        mActivity = activity;
        mContext = context;
        mArraylist = arrayList;
        filterData = arrayList;
    }

    @NonNull
    @Override
    public LibraryViewDetails onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.time_item, parent, false);
        return new LibraryViewDetails(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibraryViewDetails holder, int position) {

        holder.text_name.setText(mArraylist.get(position).getName());

    }


    @Override
    public int getItemCount() {

        return mArraylist.size();
    }


    public class LibraryViewDetails extends RecyclerView.ViewHolder {

        private TextView text_name;

        public LibraryViewDetails(@NonNull View itemView) {
            super(itemView);

            text_name = itemView.findViewById(R.id.text_time);

        }
    }


    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if (constraint != null && constraint.length() > 0) {
                ArrayList<LibraryModel> filterList = new ArrayList<LibraryModel>();
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
            mArraylist = (ArrayList<LibraryModel>) results.values;
            notifyDataSetChanged();
        }
    }

    public Filter getFilter() {
        return mFilter;
    }

}
