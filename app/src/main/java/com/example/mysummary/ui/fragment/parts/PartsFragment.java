package com.example.mysummary.ui.fragment.parts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentPartsBinding;
import com.example.mysummary.model.colleges.Parts;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartsFragment extends Fragment {
    private FragmentPartsBinding binding;
    private ArrayList<Parts> ListParts;
    private PartsAdapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemotePart();
        initRecyclerViePart();
        setAdMobBanner();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=FragmentPartsBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }
    private void getRemotePart(){
        ListParts=new ArrayList<Parts>();
        List<String> name=new ArrayList<>();
        name.addAll(Arrays.asList(getResources().getStringArray(R.array.engNameParts)));
        switch(getID()){
            case 2:
                ListParts.clear();
                for(int i=100;i<105;i++){
                    ListParts.add(new Parts(name.get(i-100),i));
                }
                break;
            case 7:
                ListParts.clear();
                ListParts.add(new Parts("أدب اللغة الانجليزي",107));
                ListParts.add(new Parts("أدب اللغة العربية",108));
                break;

            case 12:
                ListParts.clear();
                ListParts.add(new Parts("قسم الرياضيات",106));
                ListParts.add(new Parts("قسم الاحياء",109));
                break;

        }
    }
    private void initRecyclerViePart(){
        adapter=new PartsAdapter(ListParts);
        binding.rvParts.setAdapter(adapter);

    }
    private int getID(){
        return PartsFragmentArgs.fromBundle(getArguments()).getId();


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