package com.example.mysummary.ui.fragment.Mawad;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentMawadBinding;
import com.example.mysummary.model.mawad.Mawad;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MawadFragment extends Fragment {

    private static final String TAG = "MawadFragment";
    private  FragmentMawadBinding binding;
    private List<Mawad> mawadList;
    private MawadAdapter mawadAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getRemoteMawad();
        setContent(getID());
        initRecyclerViewMawad();
        setAdMobBanner();
        Listener();
    }

    private void Listener() {
        binding.bAddMawad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMawadBinding.inflate(getLayoutInflater());
        searchOrder();
        return binding.getRoot();
    }

    private void initRecyclerViewMawad() {
        mawadAdapter = new MawadAdapter(mawadList, getID());
        binding.rvMawad.setAdapter(mawadAdapter);
    }

    private void getRemoteMawad() {
        mawadList = new ArrayList<>();
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

    private int getID() {
        return MawadFragmentArgs.fromBundle(getArguments()).getId();
    }


    private void setContent(int id) {
        getRemoteMawad();
        switch (id) {
            case 1: {
                List<String> nameParts = Arrays.asList(getResources().getStringArray(R.array.doctorMawad));
                for (int i = 0; i < nameParts.size(); i++)
                    mawadList.add(new Mawad(nameParts.get(i), i));
                break;
            }
            case 2:
                List<String> nameParts = Arrays.asList(getResources().getStringArray(R.array.NameEng));
                for (int i = 0; i < nameParts.size(); i++)
                    mawadList.add(new Mawad(nameParts.get(i), i));
                break;
            case 3:
                List<String> nameNurse = Arrays.asList(getResources().getStringArray(R.array.NurseMawad));
                for (int i = 0; i < nameNurse.size(); i++)
                    mawadList.add(new Mawad(nameNurse.get(i), i));
                break;
            case 4:
                List<String> namebaby = Arrays.asList(getResources().getStringArray(R.array.babyMawad));
                for (int i = 0; i < namebaby.size(); i++)
                    mawadList.add(new Mawad(namebaby.get(i), i));
                break;

            case 5:
                Toast.makeText(getContext(), "سيتم توفير مصادر قريباً", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                List<String> nameEco = Arrays.asList(getResources().getStringArray(R.array.EconomiMawad));
                for (int i = 0; i < nameEco.size(); i++)
                    mawadList.add(new Mawad(nameEco.get(i), i));
                break;

            case 8:
                List<String> nameSport = Arrays.asList(getResources().getStringArray(R.array.sportsMawad));
                for (int i = 0; i < nameSport.size(); i++)
                    mawadList.add(new Mawad(nameSport.get(i), i));
                break;
            case 9:
                List<String> nameit = Arrays.asList(getResources().getStringArray(R.array.itMawad));
                for (int i = 0; i < nameit.size(); i++)
                    mawadList.add(new Mawad(nameit.get(i), i));
                break;
            case 10:
                List<String> nametor = Arrays.asList(getResources().getStringArray(R.array.NameTorisem));
                for (int i = 0; i < nametor.size(); i++)
                    mawadList.add(new Mawad(nametor.get(i), i));
                break;
            case 11:
                List<String> nameAplide=Arrays.asList(getResources().getStringArray(R.array.AppliedMawad));
                for(int i=0;i<nameAplide.size();i++)
                    mawadList.add(new Mawad(nameAplide.get(i),i));
                break;

            case 12:
                mawadList.add(new Mawad("قسم الرياضيات",1));
                break;
            case 13:
                mawadList.add(new Mawad("قسم الاحياء",2));
                break;
            case 100:
                List<String> nameComputer=Arrays.asList(getResources().getStringArray(R.array.Eng_CompMawad));
                for(int i=0;i<nameComputer.size();i++)
                    mawadList.add(new Mawad(nameComputer.get(i),i));
                break;
            case 101:
                List<String> nameCivil=Arrays.asList(getResources().getStringArray(R.array.Eng_CivilMawad));
                for(int i=0;i<nameCivil.size();i++)
                    mawadList.add(new Mawad(nameCivil.get(i),i));
                break;

            case 102:
                List<String> nameElctro=Arrays.asList(getResources().getStringArray(R.array.Eng_electricMawad));
                for(int i=0;i<nameElctro.size();i++)
                    mawadList.add(new Mawad(nameElctro.get(i),i));
                break;
            case 103:
                List<String> nameMicatro=Arrays.asList(getResources().getStringArray(R.array.Eng_MicMawad));
                for(int i=0;i<nameMicatro.size();i++)
                    mawadList.add(new Mawad(nameMicatro.get(i),i));
                break;
            case 104:
                List<String> nameIdents=Arrays.asList(getResources().getStringArray(R.array.Eng_industrial));
                for(int i=0;i<nameIdents.size();i++)
                    mawadList.add(new Mawad(nameIdents.get(i),i));
                break;
            case 106:
                List<String> nameMath=Arrays.asList(getResources().getStringArray(R.array.MathMawad));
                for(int i=0;i<nameMath.size();i++)
                    mawadList.add(new Mawad(nameMath.get(i),i));
                break;
            case 107:
                List<String> nameEnglish=Arrays.asList(getResources().getStringArray(R.array.NameEnglish));
                for(int i=0;i<nameEnglish.size();i++)
                    mawadList.add(new Mawad(nameEnglish.get(i),i));
                break;
            case 108:
                List<String> nameArabic=Arrays.asList(getResources().getStringArray(R.array.NameArabic));
                for(int i=0;i<nameArabic.size();i++)
                    mawadList.add(new Mawad(nameArabic.get(i),i));
                break;
            case 109:
                List<String> nameBio=Arrays.asList(getResources().getStringArray(R.array.Eng_midcinMawad));
                for(int i=0;i<nameBio.size();i++)
                    mawadList.add(new Mawad(nameBio.get(i),i));
                break;


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
        List<Mawad> filteredList = new ArrayList<>();
        for (Mawad item : mawadList) {
            if (item.getNameCourse().toLowerCase().contains(idoOrder.toLowerCase())) {
                filteredList.add(item);

            }
        }
        mawadAdapter.filterList(filteredList);
    }

    private void sendMail() {
        String recipientList = ">mysummary.je.mo@gmail.com";
        String[] recipients = recipientList.split(",");
        String subject = "ارسال مواد ";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }


}
