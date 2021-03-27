package com.example.mysummary.ui.fragment.Mawad;

import android.content.Intent;
import android.os.Bundle;
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
        return binding.getRoot();
    }

    private void initRecyclerViewMawad() {
        mawadAdapter = new MawadAdapter(mawadList,getID());
        binding.rvMawad.setAdapter(mawadAdapter);
    }

    private void getRemoteMawad() {
       mawadList=new ArrayList<>();
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

    private int getID(){
        return MawadFragmentArgs.fromBundle(getArguments()).getId();
    }


    private void setContent(int id){
        getRemoteMawad();
        switch (id){
            case 1: {
                Toast.makeText(getContext(), "سيتم توفير مصادر قريباً", Toast.LENGTH_SHORT).show();
            break;
            }
            case 2:
                List<String> nameParts= Arrays.asList(getResources().getStringArray(R.array.NameEng));
                for(int i=0;i<nameParts.size();i++)
                    mawadList.add(new Mawad(nameParts.get(i),i));
                break;
            case 3:
                List<String> nameNurse=Arrays.asList(getResources().getStringArray(R.array.NurseMawad));
               for(int i=0;i<nameNurse.size();i++)
                   mawadList.add(new Mawad(nameNurse.get(i),i));
                break;
            case 4:
                List<String> namebaby=Arrays.asList(getResources().getStringArray(R.array.babyMawad));
                for(int i=0;i<namebaby.size();i++)
                    mawadList.add(new Mawad(namebaby.get(i),i));
                break;

            case 5:
                Toast.makeText(getContext(), "سيتم توفير مصادر قريباً", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                List<String> nameEco=Arrays.asList(getResources().getStringArray(R.array.EconomiMawad));
                for(int i=0;i<nameEco.size();i++)
                    mawadList.add(new Mawad(nameEco.get(i),i));
                break;
            case 7:
                Toast.makeText(getContext(), "سيتم توفير مصادر قريباً", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(getContext(), "سيتم توفير مصادر قريباً", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                List<String> nameit=Arrays.asList(getResources().getStringArray(R.array.itMawad));
                for(int i=0;i<nameit.size();i++)
                    mawadList.add(new Mawad(nameit.get(i),i));
                break;
            case 10:
                Toast.makeText(getContext(), "سيتم توفير مصادر قريباً", Toast.LENGTH_SHORT).show();
                break;
            case 11:
                List<String> nameAplide=Arrays.asList(getResources().getStringArray(R.array.AppliedMawad));
                for(int i=0;i<nameAplide.size();i++)
                    mawadList.add(new Mawad(nameAplide.get(i),i));
                break;

            case 12:
                mawadList.add(new Mawad("قسم الرياضيات",1));
        }

        }

    private void sendMail() {
        String recipientList =  ">mysummary.je.mo@gmail.com";
        String[] recipients = recipientList.split(",");
        String subject = "ارسال مواد ";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }


}
