package com.example.mysummary.ui.fragment.mulakasat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentMula5satBinding;
import com.example.mysummary.model.colleges.Colleges;
import com.example.mysummary.model.home.UrlList;
import com.example.mysummary.model.home.listenr;
import com.example.mysummary.model.mawad.Mawad;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MulaksatFragment extends Fragment implements listenr {

    FragmentMula5satBinding binding;
    private List<Colleges> collegesList;
    private CollegesAdapter collegesAdapter;
    private List<Mawad> mawadList;
    private Mawad5tearyAdapter mawadAdapter;
    private UrlList linkList;


    public MulaksatFragment() {
    }

    ;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemoteColleges();
        initRecyclerViewColleges();
        getRemoteMawad();
        initRecyclerViewMawad();
        setAdMobBanner();
    }

    private void getRemoteMawad() {
        linkList = new UrlList();
        mawadList = new ArrayList<>();

        mawadList.add(new Mawad("Arabic101", 1));
        mawadList.add(new Mawad("Askaria", 2));
        mawadList.add(new Mawad("English101", 3));


        mawadAdapter = new Mawad5tearyAdapter(mawadList, this::OnItemClick);
    }

    private void initRecyclerViewMawad() {

        binding.rvMawad.setAdapter(mawadAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMula5satBinding.inflate(getLayoutInflater());
        searchOrder();
        return binding.getRoot();
    }

    private void initRecyclerViewColleges() {
        collegesAdapter = new CollegesAdapter(collegesList);
        binding.rvCollege.setAdapter(collegesAdapter);

    }

    private void getRemoteColleges() {
        List<String> listName = new ArrayList<>();
        collegesList = new ArrayList<>();

        listName.addAll(Arrays.asList(getResources().getStringArray(R.array.colleges)));

        int[] icon = {
                R.drawable.ic_doctors,
                R.drawable.ic_eng,
                R.drawable.ic_nurse,
                R.drawable.ic_earth,
                R.drawable.ic_baby,
                R.drawable.ic_drags,
                R.drawable.ic_earth,
                R.drawable.ic_dollor,
                R.drawable.ic_poetry,
                R.drawable.ic_sport,
                R.drawable.ic_it,
                R.drawable.ic_mountain,
                R.drawable.ic_baby,
                R.drawable.ic_book,
                R.drawable.ic_flask,
        };


        for (int i = 0; i < 13; i++) {
            collegesList.add(new Colleges(i + 1, icon[i], listName.get(i)));
        }

    }

    private void searchOrder() {
        binding.etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable idoOrder) {
                filter(idoOrder.toString());
            }


        });
    }

    private void filter(String idoOrder) {
        List<Colleges> filteredList = new ArrayList<>();
        for (Colleges item : collegesList) {
            if (item.getNameCollege().toLowerCase().contains(idoOrder.toLowerCase())) {
                filteredList.add(item);

            }
        }
        collegesAdapter.filterList(filteredList);
    }


    @Override
    public void OnItemClick(int index) {
        NavDirections action = MulaksatFragmentDirections.actionMulaksatToChaptersFragment(index);
        Navigation.findNavController(binding.getRoot()).navigate(action);
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

}