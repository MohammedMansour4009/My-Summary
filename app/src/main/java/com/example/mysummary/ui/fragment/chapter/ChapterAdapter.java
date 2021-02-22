package com.example.mysummary.ui.fragment.chapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.CvMatirialBinding;
import com.example.mysummary.model.home.Chapter;

import java.util.ArrayList;

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ChapterHolder> {
    private ArrayList<Chapter> chapters;
    private Context context;
    private int index=0;
    private CvMatirialBinding binding;

    public ChapterAdapter(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context=recyclerView.getContext();
    }

    @NonNull
    @Override
    public ChapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate Layout and set her in holder and return Holder
        binding=CvMatirialBinding.inflate(LayoutInflater.from(parent.getContext()));
        ChapterHolder holder=new ChapterHolder(binding.getRoot());
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChapterHolder holder, int position) {
        Chapter chapter=chapters.get(position);
        holder.tv.setText(chapter.getNameCourse());

    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }

    class ChapterHolder extends RecyclerView.ViewHolder{
        private TextView tv;

        public ChapterHolder(@NonNull View itemView) {
            //set values in dataFiled
            super(itemView);
            tv=itemView.findViewById(binding.tvMatirial.getId());


        }

    }
}
