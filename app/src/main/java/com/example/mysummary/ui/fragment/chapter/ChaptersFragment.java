package com.example.mysummary.ui.fragment.chapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.model.home.UrlList;
import com.example.mysummary.ui.fragment.Mawad.MawadFragmentArgs;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.example.mysummary.model.home.Url;
import com.example.mysummary.model.home.listenr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ChaptersFragment extends Fragment {

    private static final String TAG = "ChaptersFragment";
    private FragmentChaptersBinding binding;
    private List<Url> chapterListNurse;
    private List<Url> chapterListMath;
    private List<Url> chapterListIt;
    private List<Url> chapterListApplied;
    private List<Url> chapterListBaby;
    private List<Url> chapterListEco;
    private List<Url> chapterListE5teary;

    private ChapterAdapter chapterAdapter;
    private UrlList urlList;
    private InterstitialAd mInterstitialAd;


    public ChaptersFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemoteChapter(getID(), getIdColleges());

        setAdMobBanner();
        Toast.makeText(getContext(), "fuck ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChaptersBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void initRecyclerViewChapter(List<Url> chapterList) {
        chapterAdapter = new ChapterAdapter(chapterList, new listenr() {
            @Override
            public void OnItemClick(int index) {
                Url url = chapterList.get(index);
                Uri uri = Uri.parse(url.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        chapterAdapter.notifyDataSetChanged();
        binding.rvChapters.setAdapter(chapterAdapter);
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

    private void getRemoteChapter(int id, int idCollege) {
        urlList = new UrlList(getContext());
        switch (idCollege) {
            case 1:
                chapterListE5teary = new ArrayList<>();
                chapterListE5teary.clear();
                chapterListE5teary.addAll(urlList.e5teary.get(id));
                initRecyclerViewChapter(chapterListE5teary);
                break;
            case 3:
                chapterListNurse = new ArrayList<>();
                chapterListNurse.addAll(urlList.nurse.get(id));
                initRecyclerViewChapter(chapterListNurse);


                break;
            case 4:
                chapterListBaby = new ArrayList<>();
                chapterListBaby.addAll(urlList.baby.get(id));
                initRecyclerViewChapter(chapterListBaby);
                break;
            case 6:
                chapterListEco = new ArrayList<>();
                chapterListEco.addAll(urlList.eco.get(id));
                initRecyclerViewChapter(chapterListEco);

                break;
            case 8:
                chapterListIt = new ArrayList<>();
                chapterListIt.clear();
                chapterListIt.addAll(urlList.it.get(id));
                initRecyclerViewChapter(chapterListIt);

            case 10:
                chapterListApplied = new ArrayList<>();
                chapterListApplied.clear();
                chapterListApplied.addAll(urlList.aplied.get(id));
                initRecyclerViewChapter(chapterListApplied);


                break;

        }


    }

    private int getIdColleges() {
        if (ChaptersFragmentArgs.fromBundle(getArguments()).getIdCollege() == 0)
            return 0;
        return ChaptersFragmentArgs.fromBundle(getArguments()).getIdCollege();

    }

    private int getID() {
        return ChaptersFragmentArgs.fromBundle(getArguments()).getId();
    }


}


