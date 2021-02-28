package com.example.mysummary.ui.fragment.chapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowChaptersBinding;
import com.example.mysummary.model.home.Chapter;

import java.util.List;

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ChapterHolder> {
    private List<Chapter> chapters;
    private Context context;
    private int index=0;

    public ChapterAdapter(List<Chapter> chapters) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_chapters, parent, false);
        return new ChapterAdapter.ChapterHolder(RowChaptersBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull ChapterHolder holder, int position) {
        Chapter chapter=chapters.get(position);
        holder.binding.setModel(chapter);

    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }

    class ChapterHolder extends RecyclerView.ViewHolder{
        RowChaptersBinding binding;

        public ChapterHolder(@NonNull RowChaptersBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

    }
}
