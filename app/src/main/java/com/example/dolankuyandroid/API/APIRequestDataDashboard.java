package com.example.dolankuyandroid.API;

import com.example.dolankuyandroid.Model.ResponseModelDashboard;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestDataDashboard {
    @GET("locations")
    Call<ResponseModelDashboard> ardLocationsWisataDashboard();
}