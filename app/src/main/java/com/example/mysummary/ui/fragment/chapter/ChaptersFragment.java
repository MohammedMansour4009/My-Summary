package com.example.mysummary.ui.fragment.chapter;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.mysummary.databinding.FragmentChaptersBinding;
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


    }
    private void getRemoteChapter() {

    }




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
        switch (resultCode){
            case 1: {
                Toast.makeText(binding.getRoot().getContext(), "Arabic", Toast.LENGTH_SHORT).show();
            }break;
            case 2:{
                Toast.makeText(binding.getRoot().getContext(), "English", Toast.LENGTH_SHORT).show();

            }
                break;
            case 3:
                {
                    Toast.makeText(binding.getRoot().getContext(), "عسكرية", Toast.LENGTH_SHORT).show();

                }

                break;

        }

}


}