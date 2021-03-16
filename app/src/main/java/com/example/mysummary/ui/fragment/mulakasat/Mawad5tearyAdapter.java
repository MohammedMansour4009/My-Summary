package com.example.mysummary.ui.fragment.mulakasat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.constant.AppConstant;
import com.example.mysummary.databinding.RowMawad5tearyBinding;
import com.example.mysummary.model.home.listenr;
import com.example.mysummary.model.mawad.Mawad;
import com.example.mysummary.ui.fragment.chapter.ChaptersFragment;
import com.google.android.gms.ads.InterstitialAd;

import java.util.List;

public class Mawad5tearyAdapter extends RecyclerView.Adapter<Mawad5tearyAdapter.MawadHolder> {
    private List<Mawad> mawads;
    private Context context;
    private listenr lr;
    private InterstitialAd mInterstitialAd;

    public Mawad5tearyAdapter(List<Mawad> mawads, listenr lr) {
        this.mawads = mawads;
        this.lr = lr;
    }

    @NonNull
    @Override

    public MawadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mawad_5teary, parent, false);
        return new MawadHolder(RowMawad5tearyBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MawadHolder holder, int position) {
        Mawad mawad = mawads.get(position);
        holder.binding.setModel(mawad);
    }

    @Override
    public int getItemCount() {
        return mawads.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context = recyclerView.getContext();
    }

    class MawadHolder extends RecyclerView.ViewHolder {
        RowMawad5tearyBinding binding;

        public MawadHolder(@NonNull RowMawad5tearyBinding binding) {
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
