package com.example.mysummary.ui.fragment.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
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
    private CategoryAdapter categoryAdapter;

    private DrawerLayout navDrawer;

    private List<Integer> imageList;
    private ImageAdapter imageAdapter;

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

        setListImage();
        initRecyclerViewImage();
    }

    private void setListCategory() {
     categoryList=new ArrayList<>();
     categoryList.add(new Category(1,"حساب المعدل",R.drawable.ic_calculater));
     categoryList.add(new Category(2,"مودل",R.drawable.ic_person));
     categoryList.add(new Category(3,"بوبة الطالب",R.drawable.ic_web));

    }

    private void initRecyclerViewHome() {


        categoryAdapter = new CategoryAdapter(categoryList, new OnHomeClickListener() {
            @Override
            public void onItemClick(Category category) {
                int position = category.getId();
                switch (position) {
                    case 1:
                        Uri uri = Uri.parse("https://etihadlibrary.azurewebsites.net/counting_gpa.aspx");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                        break;
                    case 2:
                        Uri uri1 = Uri.parse("https://reg1.hu.edu.jo/");
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                        startActivity(intent1);
                        break;
                    case 3:
                        Uri uri2 = Uri.parse("http://www.mlms.hu.edu.jo/");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        startActivity(intent2);
                        break;

                }
            }
        });
        binding.rvCategory.setAdapter(categoryAdapter);
    }

    private void setListImage() {
        imageList = new ArrayList<>();
        imageList.add(R.drawable.ic_home);
        imageList.add(R.drawable.ic_home);
        imageList.add(R.drawable.ic_home);
    }

    private void initRecyclerViewImage() {
        imageAdapter = new ImageAdapter(imageList);
        binding.rvImage.setAdapter(imageAdapter);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.options_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    @SuppressLint("WrongConstant")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_my_summary:
                navDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}