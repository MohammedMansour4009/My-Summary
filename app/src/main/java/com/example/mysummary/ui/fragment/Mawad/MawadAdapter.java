package com.example.mysummary.ui.fragment.Mawad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowMawadBinding;
import com.example.mysummary.model.home.Mawad;

import java.util.ArrayList;
import java.util.List;

public class MawadAdapter extends RecyclerView.Adapter<MawadAdapter.MawadHolder> {
    private List<Mawad> mawads;
    private Context context;

    public MawadAdapter(List<Mawad> mawads) {
        this.mawads = mawads;
    }

    @NonNull
    @Override

    public MawadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_chapters, parent, false);
        return new MawadAdapter.MawadHolder(RowMawadBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MawadHolder holder, int position) {
        Mawad mawad=mawads.get(position);


    }

    @Override
    public int getItemCount() {
        return mawads.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context=recyclerView.getContext();
    }

    class MawadHolder extends RecyclerView.ViewHolder{
        RowMawadBinding binding;
    public MawadHolder(@NonNull RowMawadBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
}
