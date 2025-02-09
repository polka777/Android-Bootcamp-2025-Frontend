package com.example.cardofvolonteers.domain;

import androidx.annotation.NonNull;

import com.example.cardofvolonteers.data.utils.entites.ItemCenterEntity;
import com.example.cardofvolonteers.data.utils.entites.Status;

import java.util.List;
import java.util.function.Consumer;

public interface CentresRepository {
    void getAllCentres(@NonNull Consumer<Status<List<ItemCenterEntity>>> callback);
}
