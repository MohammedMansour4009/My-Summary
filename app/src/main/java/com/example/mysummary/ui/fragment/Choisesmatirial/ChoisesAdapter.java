package com.example.mysummary.ui.fragment.Choisesmatirial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowChoisesBinding;
import com.example.mysummary.model.choises.Choises;

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
        holder.binding.cvE5teari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action =MatirialChoisesFragmintDirections.actionMatirialChoisesFragmint2ToChaptersFragment(choise.getId(),200);
                Navigation.findNavController(holder.binding.getRoot()).navigate(action);
            }
        });
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
