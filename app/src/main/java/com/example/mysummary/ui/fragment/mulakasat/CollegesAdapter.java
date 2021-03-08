package com.example.mysummary.ui.fragment.mulakasat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowCollegeBinding;
import com.example.mysummary.databinding.RowMawadBinding;
import com.example.mysummary.model.home.Colleges;
import com.example.mysummary.ui.fragment.Mawad.MawadAdapter;

import java.util.ArrayList;
import java.util.List;

public class CollegesAdapter extends RecyclerView.Adapter<CollegesAdapter.CollegesHolder> {
    private RowCollegeBinding binding;
    private List<Colleges> colleges;
    private Context context;

    public CollegesAdapter(List<Colleges> colleges) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_college, parent, false);
        return new CollegesAdapter.CollegesHolder(RowCollegeBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull CollegesHolder holder, int position) {
        Colleges college=colleges.get(position);
        holder.binding.ivColleges.setBackgroundResource(college.getImg());
        holder.binding.setModel(college);
        holder.binding.lCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action =MulaksatFragmentDirections.actionMulaksatToMawadFragment2(college.getId());
                Navigation.findNavController(holder.binding.getRoot()).navigate(action);
            }
        });

    }


    @Override
    public int getItemCount() {
        return colleges.size();
    }

    class CollegesHolder extends RecyclerView.ViewHolder{
         RowCollegeBinding binding;
        public CollegesHolder(@NonNull RowCollegeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getAdapterPosition();
                }
            });


        }
    }


    public void filterList(List<Colleges> filteredList) {
        colleges = filteredList;
        notifyDataSetChanged();
    }


}
