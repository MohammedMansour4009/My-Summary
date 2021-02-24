package com.example.mysummary.ui.fragment.Patrscolleges;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowPartsCollegesBinding;
import com.example.mysummary.model.home.Parts;

import java.util.List;

public class PartsAdapter extends RecyclerView.Adapter<PartsAdapter.PartsHolder> {
    private List<Parts> parts;
    private RowPartsCollegesBinding binding;

    public PartsAdapter(List<Parts> parts) {
        this.parts = parts;
    }

    @NonNull
    @Override
    public PartsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_chapters, parent, false);
        return new PartsAdapter.PartsHolder(RowPartsCollegesBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull PartsHolder holder, int position) {
        Parts part=parts.get(position);
        holder.binding.setModel(part);


    }

    @Override
    public int getItemCount() {
        return parts.size();
    }

    class PartsHolder extends RecyclerView.ViewHolder{
        RowPartsCollegesBinding binding;
        public PartsHolder(@NonNull RowPartsCollegesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
