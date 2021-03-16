package com.example.mysummary.ui.fragment.chapter;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mysummary.constant.AppConstant;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.ui.fragment.Mawad.MawadFragmentArgs;
 
import com.example.mysummary.model.chapter.Chapter;
 
 
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
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

        Toast.makeText(binding.getRoot().getContext(), getid()+" ", Toast.LENGTH_SHORT).show();

    }
    private void getRemoteChapter() {
    }

    private int getid() {
        return ChaptersFragmentArgs.fromBundle(getArguments()).getId();
    }

    @Override
    public void OnItemClick(int index) {
        Url url=chapterList.get(index);
        Uri uri= Uri.parse(url.getUrl());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);




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
                Bundle bundle = data.getBundleExtra(AppConstant.ARABIC101_KEY);
                chapterList.addAll((Collection<? extends Url>) bundle.get(AppConstant.ARABIC101_KEY));
            }break;
            case 2:{
                Bundle bundle = data.getBundleExtra(AppConstant.ENGLISH101_KEY);
                chapterList.addAll((Collection<? extends Url>) bundle.get(AppConstant.ENGLISH101_KEY));
            }
                break;
            case 3:
                {
                Bundle bundle = data.getBundleExtra(AppConstant.ASKARIA);
                chapterList.addAll((Collection<? extends Url>) bundle.get(AppConstant.ASKARIA));
            }

                break;

        }

}


}