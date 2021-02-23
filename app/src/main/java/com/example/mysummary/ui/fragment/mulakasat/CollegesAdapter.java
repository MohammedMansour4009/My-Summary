package com.example.mysummary.ui.fragment.mulakasat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.databinding.RowCollegeBinding;
import com.example.mysummary.model.home.Colleges;

import java.util.ArrayList;

public class CollegesAdapter extends RecyclerView.Adapter<CollegesAdapter.CollegesHolder> {
    private RowCollegeBinding binding;
    private ArrayList<Colleges> colleges;
    private Context context;

    public CollegesAdapter(ArrayList<Colleges> colleges) {
        this.colleges = colleges;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context=recyclerView.getContext();
    }



    @NonNull
    @Override
    public CollegesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding= RowCollegeBinding.inflate(LayoutInflater.from(parent.getContext()));
        CollegesHolder holder=new CollegesHolder(binding);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CollegesHolder holder, int position) {
        Colleges college=colleges.get(position);
        holder.iv.setImageURI(college.getImg());
        holder.tv.setText(college.getNameCollege());
    }


    @Override
    public int getItemCount() {
        return colleges.size();
    }

    class CollegesHolder extends RecyclerView.ViewHolder{
        TextView tv;
        ImageView iv;
        public CollegesHolder(@NonNull RowCollegeBinding binding) {
            super(binding.getRoot());
            tv=binding.tvColleges;
            iv=binding.ivColleges;

        }
    }

}
