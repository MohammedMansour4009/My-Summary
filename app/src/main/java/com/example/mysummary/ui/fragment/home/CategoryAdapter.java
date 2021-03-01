package com.example.mysummary.ui.fragment.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowItemInHomeBinding;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_in_home, parent, false);
        return new CategoryAdapter.carViewHolder(RowItemInHomeBinding.bind(view));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.carViewHolder holder, final int position) {// put new data ever time
        Category category = categoryList.get(position);
        holder.binding.setModel(category);
        holder.binding.ivCategory.setBackgroundResource(category.getImage());

        holder.binding.lItemInHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(category.getId()==1)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mlms.hu.edu.jo/login/index.php"));
                    context.startActivity(intent);
                }
             if(category.getId()==2)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mlms.hu.edu.jo/login/index.php"));
                    context.startActivity(intent);
                }
             if(category.getId()==3)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://reg2.hu.edu.jo/"));
                    context.startActivity(intent);
                }

            }

        });

    }


    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class carViewHolder extends RecyclerView.ViewHolder {//declare elements and but resources
        RowItemInHomeBinding binding;

        public carViewHolder(@NonNull RowItemInHomeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }


}
