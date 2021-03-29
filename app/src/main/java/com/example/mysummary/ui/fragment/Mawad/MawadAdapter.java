package com.example.mysummary.ui.fragment.Mawad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowMawadBinding;
import com.example.mysummary.model.mawad.Mawad;

import java.util.List;

public class MawadAdapter extends RecyclerView.Adapter<MawadAdapter.MawadHolder> {
    private List<Mawad> mawads;
    private Context context;
    private int idCollege;
    public MawadAdapter(List<Mawad> mawads,int id) {
        this.mawads = mawads;
        this.idCollege=id;
    }


    @NonNull
    @Override

    public MawadHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mawad, parent, false);
        return new MawadAdapter.MawadHolder(RowMawadBinding.bind(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MawadHolder holder, int position) {
        Mawad mawad=mawads.get(position);
        holder.binding.setModel(mawad);
        holder.binding.cvMawad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action=MawadFragmentDirections.actionMawadFragmentToChaptersFragment(mawad.getId(),idCollege);
                Navigation.findNavController(holder.binding.getRoot()).navigate(action);

            }
        });
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
    public void filterList(List<Mawad> filteredList) {
        mawads = filteredList;
        notifyDataSetChanged();
    }
}
