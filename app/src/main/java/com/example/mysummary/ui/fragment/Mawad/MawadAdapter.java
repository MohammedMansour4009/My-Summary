package com.example.mysummary.ui.fragment.Mawad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.databinding.RowMatirialBinding;
import com.example.mysummary.model.home.Chapter;

import java.util.ArrayList;

public class MawadAdapter extends RecyclerView.Adapter<MawadAdapter.MawadHolder> {
    private ArrayList<Chapter> mawads;
    private Context context;
    private RowMatirialBinding binding;

    public MawadAdapter(ArrayList<Chapter> mawads) {
        this.mawads = mawads;
    }

    @NonNull
    @Override

    public MawadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding=RowMatirialBinding.inflate(LayoutInflater.from(parent.getContext()));
        MawadHolder holder=new MawadHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MawadHolder holder, int position) {
        Chapter mawad=mawads.get(position);
        holder.tv.setText(mawad.getNameCourse());
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
    private TextView tv;
    public MawadHolder(@NonNull RowMatirialBinding binding) {
        super(binding.getRoot());
        tv=binding.tvMatirial;
    }
}
}
