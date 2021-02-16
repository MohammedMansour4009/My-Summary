package com.example.mysummary.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mysummary.R;
import com.example.mysummary.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    NavController navController;
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navController = Navigation.findNavController(this, R.id.f_main);


        initToolbar();

    }

    private void initToolbar() {
        setSupportActionBar(binding.toolbar);
        navController = ((NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.f_main)).getNavController();
        binding.toolbar.setTitle("");
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