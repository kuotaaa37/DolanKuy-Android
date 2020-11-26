package com.example.dolankuyandroid.API;

import com.example.dolankuyandroid.Model.ResponseModelDashboard;
import com.example.dolankuyandroid.Model.ResponseModelDetailListLocations;
import com.example.dolankuyandroid.Model.ResponseModelListLocations;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIRequestDataDashboard {
    @GET("acomodation")
    Call<ResponseModelDashboard> ardLocationsWisataDashboard();
    @GET("locations")
    Call<ResponseModelListLocations> ardLocationsWisata();
    @GET("locations/{id}")
    Call<ResponseModelDetailListLocations> getDetailLocations(@Path("id") int id);
}