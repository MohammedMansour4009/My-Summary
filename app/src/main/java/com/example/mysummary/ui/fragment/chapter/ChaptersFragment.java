package com.example.mysummary.ui.fragment.chapter;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mysummary.ui.fragment.mulakasat.MulaksatFragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.model.home.Chapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.model.home.Url;
import com.example.mysummary.model.home.listenr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class ChaptersFragment extends Fragment implements listenr {

    private FragmentChaptersBinding binding;
    private List<Url> chapterList;
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
        chapterAdapter = new ChapterAdapter(chapterList,this::OnItemClick);
        binding.rvChapters.setAdapter(chapterAdapter);


    }
    private void getRemoteChapter() {




    }



    @Override
    public void OnItemClick(int index) {
        Url url=chapterList.get(index);
        Uri uri= Uri.parse(url.getUrl());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

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

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1: {
                Bundle bundle = data.getBundleExtra(MulaksatFragment.ARABIC101_KEY);
                chapterList.addAll((Collection<? extends Url>) bundle.get(MulaksatFragment.ARABIC101_KEY));
            }break;
            case 2:{
                Bundle bundle = data.getBundleExtra(MulaksatFragment.ENGLISH101_KEY);
                chapterList.addAll((Collection<? extends Url>) bundle.get(MulaksatFragment.ENGLISH101_KEY));
            }
                break;
            case 3:
                {
                Bundle bundle = data.getBundleExtra(MulaksatFragment.ASKARIA);
                chapterList.addAll((Collection<? extends Url>) bundle.get(MulaksatFragment.ASKARIA));
            }

                break;

        }

}


}