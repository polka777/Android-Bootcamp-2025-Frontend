package com.example.cardofvolonteers.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    private static RetrofitFactory INSTANCE;

    private RetrofitFactory() {}

    public static synchronized RetrofitFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RetrofitFactory();
        }
        return INSTANCE;
    }

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.0.102:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    /* public UserApi getUserApi() {
        return retrofit.create(UserApi.class);
    } */
}
