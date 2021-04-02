package com.example.mysummary.ui.fragment.Choisesmatirial;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentMatirialChoisesFragmintBinding;
import com.example.mysummary.model.choises.Choises;
import com.example.mysummary.model.mawad.Mawad;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatirialChoisesFragmint extends Fragment {
    FragmentMatirialChoisesFragmintBinding binding;
    private ArrayList<Choises> choisesList;
    private ChoisesAdapter choisesAdapter;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemoteChoises();
        initRecyclerViewChoises();
        setAdMobBanner();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentMatirialChoisesFragmintBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    private void initRecyclerViewChoises() {
        choisesAdapter = new ChoisesAdapter(choisesList);
        choisesAdapter.notifyDataSetChanged();
        binding.rvMatirialChoises.setAdapter(choisesAdapter);
    }
    private void getRemoteChoises() {
        choisesList=new ArrayList<>();
        ArrayList<String> name=new ArrayList<String>();
        name.addAll(Arrays.asList(getResources().getStringArray(R.array.star_mawad)));
        for(int i=0;i<name.size();i++){
            choisesList.add(new Choises(R.drawable.ic_star, name.get(i),i));}

        


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
    private void searchOrder() {
        binding.etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable idoOrder) {
                filter(idoOrder.toString());
            }


        });
    }
    private void filter(String idoOrder) {
        List<Choises> filteredList = new ArrayList<>();
        for (Choises item : choisesList) {
            if (item.getName().toLowerCase().contains(idoOrder.toLowerCase())) {
                filteredList.add(item);

            }
        }
       choisesAdapter.filterList(filteredList);
    }
}