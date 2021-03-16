package com.example.mysummary.ui.fragment.chapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.model.chapter.Chapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;

public class ChaptersFragment extends Fragment {

    private FragmentChaptersBinding binding;

    private List<Chapter> chapterList;
    private ChapterAdapter chapterAdapter;

    private InterstitialAd mInterstitialAd;


    public ChaptersFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewChapter();
        getRemoteChapter();
        setAdMobBanner();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentChaptersBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    private void initRecyclerViewChapter() {
        chapterList = new ArrayList<>();
        chapterAdapter = new ChapterAdapter(chapterList);
        binding.rvChapters.setAdapter(chapterAdapter);
    }
    private void getRemoteChapter() {

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