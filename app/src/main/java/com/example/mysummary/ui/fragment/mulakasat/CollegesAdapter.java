package com.example.mysummary.ui.fragment.mulakasat;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowCollegeBinding;
import com.example.mysummary.model.colleges.Colleges;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.List;

public class CollegesAdapter extends RecyclerView.Adapter<CollegesAdapter.CollegesHolder> {
    private RowCollegeBinding binding;
    private List<Colleges> colleges;
    private Context context;
    private InterstitialAd mInterstitialAd;
    private int IdColleg;


    public CollegesAdapter(List<Colleges> colleges,int id) {
        this.colleges = colleges;
        this.IdColleg=id;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context=recyclerView.getContext();
    }



    @NonNull
    @Override
    public CollegesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_college, parent, false);
        return new CollegesAdapter.CollegesHolder(RowCollegeBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull CollegesHolder holder, int position) {
        Colleges college=colleges.get(position);
        holder.binding.ivColleges.setBackgroundResource(college.getImg());
        holder.binding.setModel(college);
        holder.binding.lCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setAdMobInterstitial();
                if(college.getId()==2||college.getId()==12 ){
                    NavDirections action =MulaksatFragmentDirections.actionMulaksatToPartsragment(college.getId());
                    Navigation.findNavController(holder.binding.getRoot()).navigate(action);
                }
                else{
                NavDirections action =MulaksatFragmentDirections.actionMulaksatToMawadFragment2(college.getId(),IdColleg);
                Navigation.findNavController(holder.binding.getRoot()).navigate(action);
            }}
        });

    }


    @Override
    public int getItemCount() {
        return colleges.size();
    }

    class CollegesHolder extends RecyclerView.ViewHolder{
         RowCollegeBinding binding;
        public CollegesHolder(@NonNull RowCollegeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getAdapterPosition();
                }
            });


        }
    }


    public void filterList(List<Colleges> filteredList) {
        colleges = filteredList;
        notifyDataSetChanged();
    }


//    private void setAdMobInterstitial() {
//        MobileAds.initialize(context, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });
//
//
//        // Interstitial
//        mInterstitialAd = new InterstitialAd(context);
//        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());mInterstitialAd.loadAd(new AdRequest.Builder().build());
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        } else {
//            Log.d("TAG", "The interstitial wasn't loaded yet.");
//        }
        //مخير تحطها او لا
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                // Code to be executed when an ad finishes loading.
//            }
//
//            @Override
//            public void onAdFailedToLoad(LoadAdError adError) {
//                // Code to be executed when an ad request fails.
//            }
//
//            @Override
//            public void onAdOpened() {
//                // Code to be executed when the ad is displayed.
//            }
//
//            @Override
//            public void onAdClicked() {
//                // Code to be executed when the user clicks on an ad.
//            }
//
//            @Override
//            public void onAdLeftApplication() {
//                // Code to be executed when the user has left the app.
//            }
//
//            @Override
//            public void onAdClosed() {
//                // Code to be executed when the interstitial ad is closed.
//            }
//        });
//
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                // Load the next interstitial.
//                mInterstitialAd.loadAd(new AdRequest.Builder().build());
//            }
//
//        });

    }


