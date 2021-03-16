package com.example.mysummary.ui.fragment.Choisesmatirial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentMatirialChoisesFragmintBinding;
import com.example.mysummary.model.choises.Choises;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;

public class MatirialChoisesFragmint extends Fragment {
    FragmentMatirialChoisesFragmintBinding binding;
    private List<Choises> choisesList;
    private ChoisesAdapter choisesAdapter;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewChoises();
        getRemoteChoises();
            setAdMobBanner();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentMatirialChoisesFragmintBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    private void initRecyclerViewChoises() {
        choisesList = new ArrayList<>();
        choisesAdapter = new ChoisesAdapter(choisesList);
        binding.rvMatirialChoises.setAdapter(choisesAdapter);
    }
    private void getRemoteChoises() {


    }
    private void setAdMobBanner() {
        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        // Banner
        AdRequest adRequest = new AdRequest.Builder().build();
        binding.adView.loadAd(adRequest);

    }

}