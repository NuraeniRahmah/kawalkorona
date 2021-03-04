package com.example.kawalkorona;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("provinsi")
    Call<List<Atribut>> getcoronaku();
}
