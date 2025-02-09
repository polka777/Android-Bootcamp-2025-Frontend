package com.example.cardofvolonteers.data.dto;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class CenterDTO {
    @Nullable
    @SerializedName("id")
    public String id;
    @Nullable
    @SerializedName("name")
    public String name;
    @Nullable
    @SerializedName("address")
    public String address;
    @Nullable
    @SerializedName("phone_number")
    public String phoneNumber;
    @Nullable
    @SerializedName("about")
    public String about;
    @Nullable
    @SerializedName("latitude")
    public Double latitude;
    @Nullable
    @SerializedName("longitude")
    public Double longitude;
}
