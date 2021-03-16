package com.example.mysummary.ui.fragment.Mawad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentMawadBinding;
import com.example.mysummary.model.mawad.Mawad;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;


public class MawadFragment extends Fragment {

    private  FragmentMawadBinding binding;
    private List<Mawad> mawadList;
    private MawadAdapter mawadAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewMawad();
        getRemoteMawad();
        setAdMobBanner();

        Toast.makeText(binding.getRoot().getContext(), getid()+" ", Toast.LENGTH_SHORT).show();

    }

    private int getid() {
    return MawadFragmentArgs.fromBundle(getArguments()).getId();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMawadBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void initRecyclerViewMawad() {
        mawadAdapter = new MawadAdapter(mawadList);
        binding.rvMawad.setAdapter(mawadAdapter);
    }

    private void getRemoteMawad() {
        mawadList = new ArrayList<>();
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));
        mawadList.add(new Mawad( "English101",1));


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


// switch (index){
//            case 1: {
//                Bundle bundle = new Bundle();
//                bundle.putSerializable(AppConstant.ARABIC101_KEY, linkList.Arabic101(binding.getRoot().getContext()));
//                Intent intent = new Intent(getView().getContext(), ChaptersFragment.class);
//                intent.putExtras(bundle);
//                this.startActivityForResult(intent,1);
//            }
//            break;
//            case 2:
//            {
//                Bundle bundle = new Bundle();
//                bundle.putSerializable(AppConstant.ENGLISH101_KEY, linkList.English101(binding.getRoot().getContext()));
//                Intent intent = new Intent(getView().getContext(), ChaptersFragment.class);
//                intent.putExtras(bundle);
//                this.startActivityForResult(intent,2);
//            }
//            break;
//            case 3:
//            {
//                Bundle bundle = new Bundle();
//                bundle.putSerializable(AppConstant.ASKARIA, linkList.Askaria(binding.getRoot().getContext()));
//                Intent intent = new Intent(getView().getContext(), ChaptersFragment.class);
//                intent.putExtras(bundle);
//                this.startActivityForResult(intent,3);
//            }
//
//            break;
//        }
}