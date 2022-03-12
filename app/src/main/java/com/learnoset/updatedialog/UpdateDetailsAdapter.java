package com.learnoset.updatedialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UpdateDetailsAdapter extends RecyclerView.Adapter<UpdateDetailsAdapter.MyViewHolder> {

    private final List<String> updateDetailsList;

    public UpdateDetailsAdapter(List<String> updateDetailsList) {
        this.updateDetailsList = updateDetailsList;
    }

    @NonNull
    @Override
    public UpdateDetailsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.update_details_adapter_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull UpdateDetailsAdapter.MyViewHolder holder, int position) {

        // set details to the TextView
        holder.updateDetailsTxt.setText(updateDetailsList.get(position));
    }

    @Override
    public int getItemCount() {
        return updateDetailsList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView updateDetailsTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            updateDetailsTxt = itemView.findViewById(R.id.updateDetailsTxt);
        }
    }
}
