package com.example.dolankuyandroid.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dolankuyandroid.Model.DataModel;
import com.example.dolankuyandroid.R;

import java.util.List;

public class AdapterDataDashboard extends RecyclerView.Adapter<AdapterDataDashboard.HolderData> {
    private Context context;
    private List<DataModel> listWisataDashboard;

    public AdapterDataDashboard(Context context, List<DataModel> listWisataDashboard) {
        this.context = context;
        this.listWisataDashboard = listWisataDashboard;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_card,parent,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dmDashboard = listWisataDashboard.get(position);

        holder.tvId.setText(String.valueOf(dmDashboard.getId()));
        holder.tvName.setText(dmDashboard.getName());
        holder.tvDescription.setText(dmDashboard.getAddress());
    }

    @Override
    public int getItemCount() {
        return listWisataDashboard.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tvId;
        TextView tvName;
        TextView tvDescription;

        @SuppressLint("ResourceType")
        public HolderData(@NonNull View itemView) {
            super(itemView);

                tvId = itemView.findViewById(R.id.idWisataDashboard);
                tvName = itemView.findViewById(R.id.nameWisataDashboard);
                tvDescription = itemView.findViewById(R.id.descWisataDashboard);
        }
    }
}
