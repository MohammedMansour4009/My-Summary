package com.example.mysummary.ui.fragment.Choisesmatirial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowChoisesBinding;
import com.example.mysummary.databinding.RowCategoryBinding;
import com.example.mysummary.databinding.RowChoisesBinding;
import com.example.mysummary.model.home.Choises;

import java.util.ArrayList;
import java.util.List;

public class ChoisesAdapter extends RecyclerView.Adapter<ChoisesAdapter.ChoisesHolder> {
    private List<Choises> choises;
    private Context context;

    public ChoisesAdapter(List<Choises> choises) {
        this.choises = choises;
    }

    @NonNull
    @Override

    public ChoisesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_choises, parent, false);
        return new ChoisesAdapter.ChoisesHolder(RowChoisesBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull ChoisesHolder holder, int position) {
        Choises choise=choises.get(position);
        holder.binding.setModel(choise);
    }

    @Override
    public int getItemCount() {
        return choises.size();
    }

    class ChoisesHolder extends RecyclerView.ViewHolder{
        RowChoisesBinding binding;
        public ChoisesHolder(@NonNull RowChoisesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
