package com.example.employeelist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final List<Employee> mUserDataList;
    private final UserDataInterface mUserDataInterface;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvFirstName;
        private final TextView tvAge;
        private final TextView tvEmail;
        // private final ImageView ivProfile;
        private final View rootView;
        //private final ImageView ivDev;

        public ViewHolder(View view) {
            super(view);
            rootView = view;
            tvName = view.findViewById(R.id.tv_page__name);
            tvId = view.findViewById(R.id.tv_pa);
            //ivDev = view.findViewById(R.id.iv_dev);
        }

    }
}
