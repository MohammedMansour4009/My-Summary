package com.example.mysummary.ui.fragment.home;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentHomeBinding;
import com.example.mysummary.model.category.Category;
import com.example.mysummary.model.home.image.InfoImage;
import com.example.mysummary.model.home.image.Tap;
import com.example.mysummary.ui.fragment.home.Image.ImageFragment;
import com.example.mysummary.ui.fragment.home.Image.ImagePagerAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";
    private FragmentHomeBinding binding;
    private List<Category> categoryList;
    private CategoryAdapter categoryAdapter;

    private DrawerLayout navDrawer;

    private List<InfoImage> imageList;

    ImagePagerAdapter imagePagerAdapter;

    private RewardedAd rewardedAd;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);//of menu
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        navDrawer = binding.getRoot().findViewById(R.id.drawer_layout);
        showVideoFromAdMob();
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListCategory();
        initRecyclerViewHome();
        setListImage();
        binding.vpImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://hu.edu.jo/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        initViewPager();
        setAdMobBanner();

    }

    private void initViewPager() {
        imagePagerAdapter = new ImagePagerAdapter(getActivity().getSupportFragmentManager());

        imagePagerAdapter.addTab(new Tap("Image1", ImageFragment
                .newInstance(imageList.get(0))));
        imagePagerAdapter.addTab(new Tap("Image2", ImageFragment
                .newInstance(imageList.get(1))));
        imagePagerAdapter.addTab(new Tap("Image3", ImageFragment
                .newInstance(imageList.get(2))));
        imagePagerAdapter.notifyDataSetChanged();
        binding.vpImage.setAdapter(imagePagerAdapter);
        binding.vpImage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        binding.indicator.setViewPager(binding.vpImage);
    }

    private void setListCategory() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "حساب المعدل", R.drawable.ic_calculater));
        categoryList.add(new Category(2, "مودل", R.drawable.ic_person));
        categoryList.add(new Category(3, "بوبة الطالب", R.drawable.ic_web));

    }

    private void initRecyclerViewHome() {


        categoryAdapter = new CategoryAdapter(categoryList, new OnHomeClickListener() {
            @Override
            public void onItemClick(Category category) {
                int position = category.getId();
                playVideo(position);
                switch (position) {
                    case 1:
                        Uri uri = Uri.parse("https://etihadlibrary.azurewebsites.net/counting_gpa.aspx");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                        break;
                    case 2:
                        Uri uri1 = Uri.parse("http://www.mlms.hu.edu.jo/");
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
                        startActivity(intent1);
                        break;
                    case 3:
                        Uri uri2 = Uri.parse("https://reg1.hu.edu.jo/");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        startActivity(intent2);
                        break;

            }
        });
        binding.rvCategory.setAdapter(categoryAdapter);

    }

    private void goToBrowser(int position) {
        switch (position) {
            case 1:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://etihadlibrary.azurewebsites.net/counting_gpa.aspx"));
                startActivity(intent);
                break;
            case 2:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg1.hu.edu.jo/"));
                startActivity(intent1);
                break;
            case 3:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mlms.hu.edu.jo/"));
                startActivity(intent2);
                break;

        }
    }

    private void setListImage() {
        imageList = new ArrayList<>();
        imageList.add(new InfoImage(R.drawable.hu1));
        imageList.add(new InfoImage(R.drawable.hu22));
        imageList.add(new InfoImage(R.drawable.hu3));

    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.options_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    @SuppressLint("WrongConstant")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_my_summary:
                navDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
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

    private void showVideoFromAdMob() {
        rewardedAd = new RewardedAd(getContext(), "ca-app-pub-3940256099942544/5224354917");

        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                // Ad successfully loaded.
                Log.d(TAG, "onRewardedAdLoaded: ");
            }

            @Override
            public void onRewardedAdFailedToLoad(LoadAdError adError) {
                // Ad failed to load.
                Log.d(TAG, "onRewardedAdFailedToLoad: ");
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);

    }

    private void playVideo(int position) {
        if (rewardedAd.isLoaded()) {
            Activity activityContext = getActivity();
            RewardedAdCallback adCallback = new RewardedAdCallback() {
                @Override
                public void onRewardedAdOpened() {
                    // Ad opened.
                    Log.d(TAG, "onRewardedAdOpened: ");
                }

                @Override
                public void onRewardedAdClosed() {
                    // Ad closed.
                    Log.d(TAG, "onRewardedAdClosed: ");
                    goToBrowser(position);
                }

                @Override
                public void onUserEarnedReward(@NonNull RewardItem reward) {
                    // User earned reward.
                    Log.d(TAG, "onUserEarnedReward: ");

                }

                @Override
                public void onRewardedAdFailedToShow(AdError adError) {
                    // Ad failed to display.
                    Log.d(TAG, "onRewardedAdFailedToShow: ");
                }
            };
            rewardedAd.show(activityContext, adCallback);
        } else {
            Log.d(TAG, "The rewarded ad wasn't loaded yet.");
            goToBrowser(position);
        }
    }


}