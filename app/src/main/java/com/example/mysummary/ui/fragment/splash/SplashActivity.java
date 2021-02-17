package com.example.mysummary.ui.fragment.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.databinding.library.baseAdapters.BuildConfig;

import com.example.mysummary.databinding.ActivitySplashBinding;
import com.example.mysummary.ui.main.BaseBindingActivity;
import com.example.mysummary.ui.main.MainActivity;


public class SplashActivity extends BaseBindingActivity<ActivitySplashBinding> {

    private static final String TAG = "SplashActivity";

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        handler = new Handler();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        binding.tvVersion.setText("V " + BuildConfig.VERSION_NAME);
        setHandler(2);
    }

    @Override
    protected ActivitySplashBinding getViewBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    private void setHandler(int secondsDelayed) {
        handler.postDelayed(() -> {

            startActivity(new Intent(this, MainActivity.class));
            finish();

        }, secondsDelayed * 1000);
    }


}
