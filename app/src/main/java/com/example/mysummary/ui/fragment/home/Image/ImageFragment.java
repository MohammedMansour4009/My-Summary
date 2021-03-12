package com.example.mysummary.ui.fragment.home.Image;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysummary.databinding.FragmentImageBinding;
import com.example.mysummary.model.home.image.InfoImage;

import java.util.List;


public class ImageFragment extends Fragment {

    private static InfoImage infoImage;

    private FragmentImageBinding binding;




    public ImageFragment() {
        // Required empty public constructor
    }


    public static ImageFragment newInstance(InfoImage infoImages) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();

         infoImage = infoImages;

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentImageBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.ivMain.setBackgroundResource(infoImage.getSrcImage());
    }


}