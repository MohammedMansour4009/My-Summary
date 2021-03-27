package com.example.mysummary.ui.fragment.parts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mysummary.R;
import com.example.mysummary.databinding.RowPartsEngBinding;
import com.example.mysummary.model.colleges.Parts;

import java.util.ArrayList;

public class PartsAdapter extends RecyclerView.Adapter<PartsAdapter.PartsHolder> {
private ArrayList<Parts> partsArrayList;
private Context context;

    public PartsAdapter(ArrayList<Parts> partsArrayList) {
        this.partsArrayList = partsArrayList;
    }

    @NonNull
    @Override
    public PartsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_parts_eng, parent, false);
        return new PartsAdapter.PartsHolder(RowPartsEngBinding.bind(view));

    }

    @Override
    public void onBindViewHolder(@NonNull PartsHolder holder, int position) {
        Parts parts=this.partsArrayList.get(position);
        holder.binding.setModel(parts);
        holder.binding.cvPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action=PartsFragmentDirections.actionPartsragmentToMawadFragment(parts.getId());
                Navigation.findNavController(holder.binding.getRoot()).navigate(action);
            }
        });
    }

    @Override
    public int getItemCount() {
        return partsArrayList.size();
    }
    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context=recyclerView.getContext();
    }
    class PartsHolder extends RecyclerView.ViewHolder{
        RowPartsEngBinding binding;
        public PartsHolder(@NonNull RowPartsEngBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
}}
