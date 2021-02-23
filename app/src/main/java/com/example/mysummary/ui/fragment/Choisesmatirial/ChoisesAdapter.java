package com.example.mysummary.ui.fragment.Choisesmatirial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.databinding.RowChoisesBinding;
import com.example.mysummary.databinding.RowCategoryBinding;
import com.example.mysummary.databinding.RowChoisesBinding;
import com.example.mysummary.model.home.Choises;

import java.util.ArrayList;

public class ChoisesAdapter extends RecyclerView.Adapter<ChoisesAdapter.ChoisesHolder> {
    private ArrayList<Choises> choises;
    private RowChoisesBinding binding;
    private Context context;

    public ChoisesAdapter(ArrayList<Choises> choises) {
        this.choises = choises;
    }

    @NonNull
    @Override

    public ChoisesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding= RowChoisesBinding.inflate(LayoutInflater.from(parent.getContext()));
        ChoisesHolder holder=new ChoisesHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChoisesHolder holder, int position) {
        Choises choise=choises.get(position);
        holder.iv.setImageURI(choise.getUri());
        holder.tv.setText(choise.getName());

    }

    @Override
    public int getItemCount() {
        return choises.size();
    }

    class ChoisesHolder extends RecyclerView.ViewHolder{
        TextView tv;
        ImageView iv;
        public ChoisesHolder(@NonNull RowChoisesBinding binding) {
            super(binding.getRoot());
            tv=binding.tvNameChoises;
            iv=binding.ivChoises;
        }
    }
}
