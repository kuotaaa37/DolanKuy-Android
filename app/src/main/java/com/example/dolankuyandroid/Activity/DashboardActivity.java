package com.example.dolankuyandroid.Activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dolankuyandroid.API.APIRequestData;
import com.example.dolankuyandroid.API.RetroServer;
import com.example.dolankuyandroid.Adapter.AdapterDataDashboard;
import com.example.dolankuyandroid.Model.DataModel;
import com.example.dolankuyandroid.Model.ResponseModelDashboard;
import com.example.dolankuyandroid.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardActivity extends AppCompatActivity {
    private RecyclerView rvData;
    private RecyclerView.Adapter adData;
    private RecyclerView.LayoutManager lmData;
    private List<DataModel> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activivty_dashboard);

        rvData = findViewById(R.id.recycleViewData);
        lmData = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        GridLayoutManager glManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL, false);
        rvData.setLayoutManager(lmData);
        rvData.setLayoutManager(glManager);
        locationWisataDashboard();
    }

    private void locationWisataDashboard(){
        APIRequestData ardData = RetroServer.konekRetrofit().create(APIRequestData.class);
        Call<ResponseModelDashboard> tampilData =ardData.ardLocationsWisataDashboard();

        tampilData.enqueue(new Callback<ResponseModelDashboard>() {
            @Override
            public void onResponse(Call<ResponseModelDashboard> call, Response<ResponseModelDashboard> response) {
               listData = response.body().getLocation();
               adData = new AdapterDataDashboard(DashboardActivity.this, listData);
               rvData.setAdapter(adData);
               adData.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponseModelDashboard> call, Throwable t) {
                Toast.makeText(DashboardActivity.this, "gagal menghubungkan " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}