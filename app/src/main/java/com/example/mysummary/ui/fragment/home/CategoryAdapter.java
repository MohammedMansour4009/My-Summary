package com.example.mysummary.ui.fragment.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowCategoryBinding;
import com.example.mysummary.model.home.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.carViewHolder> {
    private List<Category> categoryList;
    private Context context;
    private int index = 0;

    public CategoryAdapter(List<Category> categories) {//Because get data from out
        this.categoryList = categories;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context = recyclerView.getContext();
    }

    @NonNull
    @Override
    public CategoryAdapter.carViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//inflate of layout and Components
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_category, parent, false);
        return new CategoryAdapter.carViewHolder(RowCategoryBinding.bind(view));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.carViewHolder holder, final int position) {// put new data ever time
        Category category = categoryList.get(position);
        holder.binding.setModel(category);
        holder.binding.ivCategory.setBackgroundResource(category.getImage());

        holder.binding.vCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = position;
                notifyDataSetChanged();
            }
        });
        if (index == position) {
            Drawable drawable=context.getDrawable(R.drawable.design_selected);
            holder.binding.vCategory.setImageDrawable(drawable);
            holder.binding.tvNameCategory.setTextColor(context.getResources().getColor(R.color.colorW));

        } else {
            Drawable drawable=context.getDrawable(R.drawable.design_corner);
            holder.binding.vCategory.setImageDrawable(drawable);
            holder.binding.tvNameCategory.setTextColor(context.getResources().getColor(R.color.colorGray));
        }
    }


    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class carViewHolder extends RecyclerView.ViewHolder {//declare elements and but resources
        RowCategoryBinding binding;

        public carViewHolder(@NonNull RowCategoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }


}
