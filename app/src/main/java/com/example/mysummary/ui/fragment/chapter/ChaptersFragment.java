package com.example.mysummary.ui.fragment.chapter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.mysummary.R;
import com.example.mysummary.databinding.FragmentChaptersBinding;
import com.example.mysummary.model.home.Chapter;

import java.util.ArrayList;
import java.util.List;

public class ChaptersFragment extends Fragment {

    private FragmentChaptersBinding binding;

    private List<Chapter> chapterList;
    private ChapterAdapter chapterAdapter;

    public ChaptersFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerViewChapter();
        getRemoteChapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentChaptersBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    private void initRecyclerViewChapter() {
        chapterList = new ArrayList<>();
        chapterAdapter = new ChapterAdapter(chapterList);
        binding.rvChapters.setAdapter(chapterAdapter);
    }
    private void getRemoteChapter() {
      

    }

}