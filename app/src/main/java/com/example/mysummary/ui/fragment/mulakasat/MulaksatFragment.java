package com.example.mysummary.ui.fragment.mulakasat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentMula5satBinding;
import com.example.mysummary.model.home.Colleges;

import java.util.ArrayList;
import java.util.List;

public class MulaksatFragment extends Fragment {

    FragmentMula5satBinding binding;
    private List<Colleges> collegesList;
    private CollegesAdapter collegesAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewColleges();
        getRemoteColleges();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMula5satBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void initRecyclerViewColleges() {
        collegesList = new ArrayList<>();
        collegesAdapter = new CollegesAdapter(collegesList);
        binding.rvCollege.setAdapter(collegesAdapter);
    }

    private void getRemoteColleges() {


    }
}