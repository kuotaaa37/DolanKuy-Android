package com.example.dolankuyandroid.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dolankuyandroid.API.APIRequestData;
import com.example.dolankuyandroid.API.RetroServerDashboard;
import com.example.dolankuyandroid.Adapter.AdapterDataDashboard;
import com.example.dolankuyandroid.Fragment.DashboardFragment;
import com.example.dolankuyandroid.Model.DataModel;
import com.example.dolankuyandroid.Model.ResponseModelDashboard;
import com.example.dolankuyandroid.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bottom);

        BottomNavigationView botNavView = findViewById(R.id.bottom_navigation);
        botNavView.setOnNavigationItemSelectedListener(navListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.botNav_container, new DashboardFragment());
        fragmentTransaction.commit();

        TextView textView = findViewById(R.id.title);
        textView.setText("Dashboard");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()){
                case R.id.home_botNav:
                    return true;
                case R.id.listWisata_botNav:
                    startActivity(new Intent(getApplicationContext()
                            ,ListLocationsActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.akomodasi_botNav:
                    startActivity(new Intent(getApplicationContext()
                            ,ListAkomodasiActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.profile_botNav:
                    startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                    overridePendingTransition(0,0);
                    return true;
            }
            return false;
        }
    };
}