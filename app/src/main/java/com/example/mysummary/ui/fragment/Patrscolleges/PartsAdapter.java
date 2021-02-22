package com.example.mysummary.ui.fragment.Patrscolleges;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.databinding.CvPartsCollegesBinding;
import com.example.mysummary.model.home.Chapter;

import java.util.ArrayList;

public class PartsAdapter extends RecyclerView.Adapter<PartsAdapter.PartsHolder> {
    private ArrayList<Chapter> parts;
    private CvPartsCollegesBinding binding;

    public PartsAdapter(ArrayList<Chapter> parts) {
        this.parts = parts;
    }

    @NonNull
    @Override
    public PartsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding=CvPartsCollegesBinding.inflate(LayoutInflater.from(parent.getContext()));
        PartsHolder holder=new PartsHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PartsHolder holder, int position) {
        Chapter part=parts.get(position);
        holder.tv.setText(part.getNameCourse());


    }

    @Override
    public int getItemCount() {
        return parts.size();
    }

    class PartsHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public PartsHolder(@NonNull CvPartsCollegesBinding binding) {
            super(binding.getRoot());
            tv=binding.tvNamePatrs;
        }
    }
}
