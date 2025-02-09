package com.example.cardofvolonteers.ui.list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cardofvolonteers.R;
import com.example.cardofvolonteers.databinding.FragmentCentresListBinding;

public class CentresListFragment extends Fragment {
    private CenterListViewModel viewModel;

    public CentresListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_centres_list, container, false);
        view.findViewById(R.id.map).setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_centresListFragment_to_mainPageFragment);
        });

        final CenterListAdapter adapter = new CenterListAdapter(id -> openProfile(id));
        viewModel = new ViewModelProvider(this).get(CenterListViewModel.class);
        RecyclerView recyclerView = view.findViewById(R.id.centres_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        subscribe(viewModel, adapter);

        return view;
    }

    private void openProfile(@NonNull String id) {
        //TODO: add code here
    }


    private void subscribe(final CenterListViewModel viewModel, final CenterListAdapter adapter) {
        viewModel.stateLiveData.observe(getViewLifecycleOwner(), state -> {
            boolean isSuccess = !state.isLoading()
                    && state.getErrorMessage() == null
                    && state.getItems() != null;

            Log.i("stateInfo", "Error: " + state.getErrorMessage());
            Log.i("stateInfo", "Loading: " + state.isLoading());
            Log.i("stateInfo", "Success: " + isSuccess);
            if (isSuccess) {
                adapter.updateData(state.getItems());
            }
        });
    }

    public static MainPageFragment newInstance() {
        return new MainPageFragment();
    }
}