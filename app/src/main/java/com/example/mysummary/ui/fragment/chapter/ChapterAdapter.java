package com.example.mysummary.ui.fragment.chapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowChaptersBinding;
import com.example.mysummary.model.home.Url;
import com.example.mysummary.model.home.listenr;

import com.example.mysummary.model.chapter.Chapter;

import com.example.mysummary.model.home.Chapter;
import com.example.mysummary.model.home.Url;
import com.example.mysummary.model.home.listenr;


import java.util.List;

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ChapterHolder> {
    private List<Url> chapters;
    private Context context;
    private int index=0;
    private listenr lr;

    public ChapterAdapter(List<Url> chapters,listenr lr) {
        this.chapters = chapters;
        this.lr=lr;
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
        Url chapter=chapters.get(position);
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
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lr.OnItemClick(getAdapterPosition());
                }
            });

        }

    }


}
