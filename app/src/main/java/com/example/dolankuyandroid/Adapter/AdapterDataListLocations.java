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

public class AdapterDataListLocations extends RecyclerView.Adapter<AdapterDataListLocations.HolderData> {
    private Context context;
    private List<DataModel> listLocations;

    public AdapterDataListLocations(Context context, List<DataModel> listLocations) {
        this.context = context;
        this.listLocations = listLocations;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list_wisata,parent,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dmDashboard = listLocations.get(position);

        holder.idListWisata1.setText(String.valueOf(dmDashboard.getId()));
        holder.nameListWisata1.setText(dmDashboard.getName());
        holder.distanceListWisata1.setText(String.valueOf(dmDashboard.getDistance()));
    }

    @Override
    public int getItemCount() {
        return listLocations.size();
    }

    public class HolderData extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView nameListWisata1,distanceListWisata1,idListWisata1;


        @SuppressLint("ResourceType")
        public HolderData(@NonNull View itemView) {
            super(itemView);

            idListWisata1 = itemView.findViewById(R.id.idListWisata1);
            nameListWisata1 = itemView.findViewById(R.id.nameListWisata1);
            distanceListWisata1 = itemView.findViewById(R.id.distanceListWisata1);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
