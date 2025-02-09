package com.example.cardofvolonteers.data;

import androidx.annotation.NonNull;

import com.example.cardofvolonteers.data.dto.CenterDTO;
import com.example.cardofvolonteers.data.network.RetrofitFactory;
import com.example.cardofvolonteers.data.source.CenterAPI;
import com.example.cardofvolonteers.data.utils.CallToConsumer;
import com.example.cardofvolonteers.data.utils.entites.ItemCenterEntity;
import com.example.cardofvolonteers.data.utils.entites.Status;
import com.example.cardofvolonteers.domain.CentresRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class CentresRepImpl implements CentresRepository {
    private static CentresRepImpl INSTANCE;
    private final CenterAPI centerAPI = RetrofitFactory.getInstance().getCenterAPI();

    private CentresRepImpl() {}

    public static synchronized CentresRepImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CentresRepImpl();
        }
        return INSTANCE;
    }

    @Override
    public void getAllCentres(@NonNull Consumer<Status<List<ItemCenterEntity>>> callback) {
        centerAPI.getAll().enqueue(new CallToConsumer<>(
                callback,
                centerDTOS -> {
                    ArrayList<ItemCenterEntity> result = new ArrayList<>();

                    for (CenterDTO item : centerDTOS) {
                        final String id = item.id;
                        final String name = item.name;
                        if (id != null && name != null) {
                            result.add(new ItemCenterEntity(id, name));
                        }
                    }
                    return result;
                }
        ));
    }

}
