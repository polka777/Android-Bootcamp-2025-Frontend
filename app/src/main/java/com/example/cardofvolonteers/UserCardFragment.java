package com.example.cardofvolonteers;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cardofvolonteers.databinding.FragmentUserCardBinding;
import com.example.cardofvolonteers.ui.MainActivity;


public class UserCardFragment extends Fragment {

    private FragmentUserCardBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUserCardBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.backtolist.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.list_of_users, null, MainActivity.options);
        });

        return view;
    }
}