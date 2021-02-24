package com.example.mysummary.ui.fragment.Patrscolleges;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentPartBinding;
import com.example.mysummary.model.home.Parts;

import java.util.ArrayList;
import java.util.List;


public class fragmentPartsColleges extends Fragment {
    FragmentPartBinding binding;
    private List<Parts> mawadList;
    private PartsAdapter mawadAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewParts();
        getRemoteParts();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPartBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void initRecyclerViewParts() {
        mawadList = new ArrayList<>();
        mawadAdapter = new PartsAdapter(mawadList);
        binding.rvPart.setAdapter(mawadAdapter);
    }

    private void getRemoteParts() {


    }
}