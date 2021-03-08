package com.example.mysummary.ui.fragment.Mawad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentMawadBinding;
import com.example.mysummary.model.home.Mawad;

import java.util.ArrayList;
import java.util.List;


public class MawadFragment extends Fragment {

    private  FragmentMawadBinding binding;
    private List<Mawad> mawadList;
    private MawadAdapter mawadAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewMawad();
        getRemoteMawad();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMawadBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void initRecyclerViewMawad() {
        mawadAdapter = new MawadAdapter(mawadList);
        binding.rvMawad.setAdapter(mawadAdapter);
    }

    private void getRemoteMawad() {
        mawadList = new ArrayList<>();
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));


    }

}