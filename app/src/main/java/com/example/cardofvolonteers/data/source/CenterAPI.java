package com.example.cardofvolonteers.data.source;

import com.example.cardofvolonteers.data.dto.CenterDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CenterAPI {
    @GET("api/centers")
    Call<List<CenterDTO>> getAll();
}
