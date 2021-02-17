package com.example.mysummary.ui.fragment.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentHomeBinding;
import com.example.mysummary.model.home.Category;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private List<Category> categoryList;
    CategoryAdapter categoryAdapter;
    DrawerLayout navDrawer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);//of menu
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         binding = FragmentHomeBinding.inflate(getLayoutInflater());
          navDrawer = binding.getRoot().findViewById(R.id.drawer_layout);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListCategory();
        initRecyclerViewHome();

    }

    private void setListCategory() {
    categoryList=new ArrayList<>();
    categoryList.add(new Category("حساب المعدل",R.drawable.abc_vector_test));
    categoryList.add(new Category("مودل",R.drawable.abc_vector_test));
    categoryList.add(new Category("بوبة الطالب",R.drawable.abc_vector_test));
    }

    private void initRecyclerViewHome() {
        categoryAdapter =new CategoryAdapter(categoryList);
        binding.rvCategory.setAdapter(categoryAdapter);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.options_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    @SuppressLint("WrongConstant")
    @Override
    public boolean onOptionsItemSele

    cted(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_my_summary:
                navDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}