package com.example.mysummary.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.mysummary.R;
import com.example.mysummary.databinding.ActivityMainBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding>  {
    private static final String TAG = "MainActivity";
    private NavController navController;
    private FragmentTransaction fragmentTransaction;
    private RewardedAd rewardedAd;
    AppBarConfiguration appBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        navController = Navigation.findNavController(this, R.id.f_main);
        binding.bottomNav.setSelectedItemId(R.id.mulaksat);
        initNavController();
        initToolbar();
        setNavBottomAndDrawerNav();
        initVideoFromAdMob();


    }

    private void initNavController() {
        navController = ((NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.f_main)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setDrawerLayout(binding.drawerLayout).build();

    }

    @Override
    protected ActivityMainBinding getViewBinding() {
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        return binding;
    }

    private void initToolbar() {
        setSupportActionBar(binding.toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return NavigationUI.onNavDestinationSelected(item, navController) || super.onOptionsItemSelected(item);
    }

    private void setNavBottomAndDrawerNav() {
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
        NavigationUI.setupWithNavController(binding.navView, navController);
        binding.navView.setNavigationItemSelectedListener(selectedListener);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

    }
NavigationView.OnNavigationItemSelectedListener selectedListener=new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_support:
                playVideo();
                break;

            case R.id.ic_connect_with_us:
                conectWithUs();
            break;

    }
        return true;
}};




    private void initVideoFromAdMob() {
        rewardedAd = new RewardedAd(binding.getRoot().getContext(), "ca-app-pub-3940256099942544/5224354917");

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

    private void playVideo() {
        if (rewardedAd.isLoaded()) {
            Activity activityContext = MainActivity.this;
            RewardedAdCallback adCallback = new RewardedAdCallback() {
                @Override
                public void onRewardedAdOpened() {
                    // Ad opened.
                    Log.d(TAG, "onRewardedAdOpened: "+"open");
                }

                @Override
                public void onRewardedAdClosed() {
                    // Ad closed.
                    Log.d(TAG, "onRewardedAdClosed: ");
                    Toast.makeText(activityContext, "شكرا لك", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(this, "لا يتوفر فيديو", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override //play backButton at toolbar
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }


    private void conectWithUs(){
        String Link="https://web.facebook.com/mulaksat.hu";
        Uri uri=Uri.parse(Link);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}