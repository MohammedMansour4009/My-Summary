package com.example.mysummary.ui.fragment.home;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowItemInHomeBinding;
import com.example.mysummary.model.category.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.carViewHolder> {
    private List<Category> categoryList;
    private Context context;
    private OnHomeClickListener listener;

    public CategoryAdapter(List<Category> categories ,OnHomeClickListener listener) {//Because get data from out
        this.categoryList = categories;
        this.listener =listener;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context = recyclerView.getContext();
    }

    @NonNull
    @Override
    public CategoryAdapter.carViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//inflate of layout and Components
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_in_home, parent, false);
        return new CategoryAdapter.carViewHolder(RowItemInHomeBinding.bind(view));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.carViewHolder holder, final int position) {// put new data ever time
      Category  category = categoryList.get(position);
        holder.binding.setModel(category);
        holder.binding.ivCategory.setBackgroundResource(category.getImage());


        holder.bind(category);


    }



    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class carViewHolder extends RecyclerView.ViewHolder {//declare elements and but resources
        RowItemInHomeBinding binding;
        Category category;
        public carViewHolder(@NonNull RowItemInHomeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(category);
                }
            });
        }

        void bind(Category category) {
            this.category = category;
        }

    }




}
