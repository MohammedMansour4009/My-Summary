package com.example.mysummary.ui.main;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.mysummary.R;
import com.example.mysummary.databinding.ActivityMainBinding;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding> {
    private NavController navController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        navController = Navigation.findNavController(this, R.id.f_main);
        initNavController();
        initToolbar();

        Toast.makeText(this, "asda", Toast.LENGTH_SHORT).show();
    }

    private void initNavController() {
        navController = ((NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.f_main)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNav, navController);

    }

    @Override
    protected ActivityMainBinding getViewBinding() {
        ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        return binding;
    }

    private void initToolbar() {
        setSupportActionBar(binding.toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_my_summary:
                binding.drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return NavigationUI.onNavDestinationSelected(item, navController) || super.onOptionsItemSelected(item);
    }

 }