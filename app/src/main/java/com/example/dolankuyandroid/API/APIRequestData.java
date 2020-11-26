package com.example.dolankuyandroid.API;

import com.example.dolankuyandroid.Model.ResponseModelDashboard;
import com.example.dolankuyandroid.Model.ResponseModelListLocations;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("acomodation")
    Call<ResponseModelDashboard> ardLocationsWisataDashboard();
    @GET("locations")
    Call<ResponseModelListLocations> ardLocationsWisata();
}