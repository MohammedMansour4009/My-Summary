package com.example.mysummary.ui.fragment.chapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.model.home.UrlList;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.example.mysummary.model.home.Url;
import com.example.mysummary.model.home.listenr;

import java.util.ArrayList;
import java.util.List;

public class ChaptersFragment extends Fragment {

    private static final String TAG = "ChaptersFragment";
    private FragmentChaptersBinding binding;
    private List<Url> chapterListNurse;
    private List<Url> chapterListIt;
    private List<Url> chapterListApplied;
    private List<Url> chapterListBaby;
    private List<Url> chapterListEco;
    private List<Url> chapterListE5teary;
    private List<Url> chapterListComputer;
    private List<Url> chapterCivil;
    private List<Url> chapterelctro;
    private List<Url> chapterMico;
    private List<Url> chapterident;
    private List<Url> chapterArabic;
    private List<Url> chapterEnglish;
    private List<Url> chapterTorisem;
    private List<Url> chapterBio;
    private List<Url> chapterE5tyari;
    private ArrayList<Url> chapterMath;
    private ArrayList<Url> chapterSport;
    private ArrayList<Url> chapterDoctor;
    private ArrayList<Url> globalList;
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


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChaptersBinding.inflate(getLayoutInflater());
        setAdMobInterstitial();
        return binding.getRoot();
    }

    private void initRecyclerViewChapter(List<Url> chapterList) {

        chapterAdapter = new ChapterAdapter(chapterList, new listenr() {
            @Override
            public void OnItemClick(int index) {
                playScreenAdMob(index, chapterList);
            }
        });
        chapterAdapter.notifyDataSetChanged();
        binding.rvChapters.setAdapter(chapterAdapter);
    }

    private void gitURL(int index, List<Url> chapterList) {
        if(getIdColleges()==101||getIdColleges()==102)
        {
            Intent intent= new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(chapterList.get(index).getUrl()));
            startActivity(intent);

        }
        else {
            NavDirections navDirections = ChaptersFragmentDirections.actionChaptersFragmentToWebViewFragment(chapterList.get(index).getUrl());
            Navigation.findNavController(binding.getRoot()).navigate(navDirections);
        }
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
            case 0:
                chapterListE5teary = new ArrayList<>();
                chapterListE5teary.addAll(urlList.e5teary.get(id-1));
                initRecyclerViewChapter(chapterListE5teary);
                break;
            case 1:
                chapterDoctor=new ArrayList<>();
                chapterDoctor.addAll(urlList.doctor.get(id));
                initRecyclerViewChapter(chapterDoctor);
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
                chapterSport=new ArrayList<>();
                chapterSport.addAll(urlList.sport.get(id));
                initRecyclerViewChapter(chapterSport);
                break;
            case 9:
                chapterListIt = new ArrayList<>();
                chapterListIt.addAll(urlList.it.get(id));
                initRecyclerViewChapter(chapterListIt);
                break;
            case 10:
                chapterTorisem=new ArrayList<>();
                chapterTorisem.addAll(urlList.tor.get(id));
                initRecyclerViewChapter(chapterTorisem);
                break;
            case 11:
                chapterListApplied = new ArrayList<>();
                chapterListApplied.clear();
                chapterListApplied.addAll(urlList.aplied.get(id));
                initRecyclerViewChapter(chapterListApplied);
                break;
            case 100:
                chapterListComputer =new ArrayList<>();
                chapterListComputer.addAll(urlList.computrer.get(id));
                initRecyclerViewChapter(chapterListComputer);
                break;
            case 101:
                chapterCivil =new ArrayList<>();
                chapterCivil.addAll(urlList.Civil.get(id));
                initRecyclerViewChapter(chapterCivil);
                break;

            case 102:
                chapterelctro=new ArrayList<>();
                chapterelctro.addAll(urlList.elec.get(id));
                initRecyclerViewChapter(chapterelctro);
                break;
            case 103:
                chapterMico =new ArrayList<>();
                chapterMico.addAll(urlList.mica.get(id));
                initRecyclerViewChapter(chapterMico);
                break;
            case 104:
                chapterident=new ArrayList<>();
                chapterident.addAll(urlList.indes.get(id));
                initRecyclerViewChapter(chapterident);
                break;


        case 106:
            chapterMath=new ArrayList<>();
            chapterMath.addAll(urlList.math.get(id));
            initRecyclerViewChapter(chapterMath);
            break;
            case 107:
                chapterEnglish=new ArrayList<>();
                chapterEnglish.addAll(urlList.English.get(id));
                initRecyclerViewChapter(chapterEnglish);
                break;
            case 108:
                chapterArabic=new ArrayList<>();
                chapterArabic.addAll(urlList.arabic.get(id));
                initRecyclerViewChapter(chapterArabic);
                break;
            case 109:
                chapterBio=new ArrayList<>();
                chapterBio.addAll(urlList.midc.get(id));
                initRecyclerViewChapter(chapterBio);
                break;
            case 200:
                chapterE5tyari=new ArrayList<>();
                chapterE5tyari.addAll(urlList.e5tyari.get(id));
                initRecyclerViewChapter(chapterE5tyari);
                break;
    }}

    private int getIdColleges() {

        return ChaptersFragmentArgs.fromBundle(getArguments()).getIdCollege();

    }

    private int getID() {
        return ChaptersFragmentArgs.fromBundle(getArguments()).getId();
    }

    private void setAdMobInterstitial() {
        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        // Interstitial
        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-8143854392517680/6114262224");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        //مخير تحطها او لا


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

    }

    private void playScreenAdMob(int index, List<Url> chapterList) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();

        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            gitURL(index, chapterList);
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                gitURL(index,chapterList);
            }
        });
    }
}




