package com.example.cardofvolonteers.data.utils.entites;

import androidx.annotation.NonNull;

public class ItemCenterEntity {
    @NonNull
    private final String id;

    @NonNull
    private final String name;

    public ItemCenterEntity(@NonNull String id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }
}
