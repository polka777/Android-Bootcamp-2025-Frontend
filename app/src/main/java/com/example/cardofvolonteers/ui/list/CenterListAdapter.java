package com.example.cardofvolonteers.ui.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardofvolonteers.R;
import com.example.cardofvolonteers.data.utils.entites.ItemCenterEntity;
import com.example.cardofvolonteers.databinding.FragmentCentresListBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CenterListAdapter extends RecyclerView.Adapter<CenterListAdapter.ViewHolder> {

    @NonNull
    private final Consumer<String> onItemClick;

    private final List<ItemCenterEntity> data = new ArrayList<>();

    public CenterListAdapter(@NonNull Consumer<String> onItemClick) {
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                FragmentCentresListBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void updateData(List<ItemCenterEntity> newData) {
        data.clear();
        data.addAll(newData);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final FrameLayout frame;

        public ViewHolder(@NonNull FragmentCentresListBinding binding) {
            super(binding.getRoot());
            frame = binding.getRoot();
        }

        public void bind(ItemCenterEntity item) {
            frame.findViewById(R.id.moreAboutCenter).setOnClickListener(v -> {
                onItemClick.accept(item.getId());
            });
        }
    }
}
