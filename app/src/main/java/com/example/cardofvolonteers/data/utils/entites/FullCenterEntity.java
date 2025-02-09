package com.example.cardofvolonteers.data.utils.entites;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class FullCenterEntity {

    @NonNull
    private String id;

    @NonNull
    private String name;

    @Nullable
    private String address;

    @Nullable
    private String phoneNumber;

    @Nullable
    private String about;

    @Nullable
    private Double latitude;

    @Nullable
    private Double longitude;

    public FullCenterEntity(@NonNull String id, @NonNull String name, @Nullable String address, @Nullable String phoneNumber, @Nullable String about, @Nullable Double latitude, @Nullable Double longitude) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.about = about;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @Nullable
    public String getAddress() {
        return address;
    }

    @Nullable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Nullable
    public String getAbout() {
        return about;
    }

    @Nullable
    public Double getLatitude() {
        return latitude;
    }

    @Nullable
    public Double getLongitude() {
        return longitude;
    }
}
