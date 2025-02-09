package com.example.cardofvolonteers.domain;

import androidx.annotation.NonNull;

import com.example.cardofvolonteers.data.utils.entites.ItemCenterEntity;
import com.example.cardofvolonteers.data.utils.entites.Status;

import java.util.List;
import java.util.function.Consumer;

public class GetCentresListUseCase {
    private final CentresRepository repo;

    public GetCentresListUseCase(CentresRepository repo) {
        this.repo = repo;
    }

    public void execute(@NonNull Consumer<Status<List<ItemCenterEntity>>> callback) {
        repo.getAllCentres(callback);
    }
}
