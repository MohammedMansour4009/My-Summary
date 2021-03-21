package com.example.mysummary.ui.fragment.parts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentPartsragmentBinding;
import com.example.mysummary.model.colleges.Parts;

import java.util.ArrayList;

public class PartsFragment extends Fragment {
    private FragmentPartsragmentBinding binding;
    private ArrayList<Parts> parts;
    private PartsAdapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemotePart();
        initRecyclerViePart();


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=FragmentPartsragmentBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }
    private void getRemotePart(){
        parts=new ArrayList<Parts>();
    }
    private void initRecyclerViePart(){
        adapter=new PartsAdapter(parts);
        binding.rvParts.setAdapter(adapter);

    }

}