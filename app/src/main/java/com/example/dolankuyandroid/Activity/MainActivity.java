package com.example.dolankuyandroid.Activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dolankuyandroid.API.APIRequestDataDashboard;
import com.example.dolankuyandroid.API.RetroServerDashboard;
import com.example.dolankuyandroid.Adapter.AdapterDataDashboard;
import com.example.dolankuyandroid.Model.DataModelDashboard;
import com.example.dolankuyandroid.Model.ResponseModelDashboard;
import com.example.dolankuyandroid.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvData;
    private RecyclerView.Adapter adData;
    private RecyclerView.LayoutManager lmData;
    private List<DataModelDashboard> listData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activivty_dashboard);

        rvData = findViewById(R.id.recycleViewData);
        lmData = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvData.setLayoutManager(lmData);
        locationWisataDashboard();
    }

    private void locationWisataDashboard(){
        APIRequestDataDashboard ardData = RetroServerDashboard.konekRetrofit().create(APIRequestDataDashboard.class);
        Call<ResponseModelDashboard> tampilData =ardData.ardLocationsWisataDashboard();

        tampilData.enqueue(new Callback<ResponseModelDashboard>() {
            @Override
            public void onResponse(Call<ResponseModelDashboard> call, Response<ResponseModelDashboard> response) {
               listData = response.body().getLocation();
               adData = new AdapterDataDashboard(MainActivity.this, listData);
               rvData.setAdapter(adData);
               adData.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponseModelDashboard> call, Throwable t) {
                Toast.makeText(MainActivity.this, "gagal menghubungkan " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}