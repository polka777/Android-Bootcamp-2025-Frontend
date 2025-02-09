package com.example.cardofvolonteers.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.NavHostFragment;

import com.example.cardofvolonteers.R;

public class MainActivity extends AppCompatActivity {
    public static NavOptions options;
    public NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(true);
        options = builder.build();
        assert navHostFragment != null;
        navController = navHostFragment.getNavController();
    }

}