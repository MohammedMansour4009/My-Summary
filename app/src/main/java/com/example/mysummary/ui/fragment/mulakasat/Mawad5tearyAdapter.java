package com.example.mysummary.ui.fragment.mulakasat;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mysummary.R;
import com.example.mysummary.databinding.RowMawad5tearyBinding;
import com.example.mysummary.model.home.Url;
import com.example.mysummary.model.mawad.Mawad;
import com.example.mysummary.model.home.listenr;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.List;
public class Mawad5tearyAdapter extends RecyclerView.Adapter<Mawad5tearyAdapter.MawadHolder> {
    private List<Mawad> mawads;
    private Context context;
    private listenr lr;
    private InterstitialAd mInterstitialAd;

    public Mawad5tearyAdapter(List<Mawad> mawads,listenr lr) {
        this.mawads = mawads;
        this.lr=lr;
    }

    @NonNull
    @Override

    public MawadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mawad_5teary, parent, false);
        return new MawadHolder(RowMawad5tearyBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MawadHolder holder, int position) {
        Mawad mawad=mawads.get(position);
        holder.binding.setModel(mawad);
        holder.binding.tvNameMawad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.initAdMobInterstitial();

            }
        });
    }

    @Override
    public int getItemCount() {
        return mawads.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context = recyclerView.getContext();
    }

    class MawadHolder extends RecyclerView.ViewHolder {
        RowMawad5tearyBinding binding;
    public MawadHolder(@NonNull RowMawad5tearyBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lr.OnItemClick(getAdapterPosition());
            }
        });


    }

    private void initAdMobInterstitial() {
        MobileAds.initialize(context, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());mInterstitialAd.loadAd(new AdRequest.Builder().build());

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG00", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                Log.d("TAG000", "onAdFailedToLoad: " + adError.getMessage() );
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
            }
        });

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

    }

}}
