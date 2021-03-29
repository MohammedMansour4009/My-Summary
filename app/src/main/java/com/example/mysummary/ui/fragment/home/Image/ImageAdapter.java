package com.example.mysummary.ui.fragment.home.Image;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysummary.R;
import com.example.mysummary.databinding.RowImageInMainBinding;
import com.example.mysummary.model.home.image.InfoImage;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.carViewHolder> {
    private List<InfoImage> imageList;
    private Context context;
    private int index = 0;

    public ImageAdapter(List<InfoImage> categories) {//Because get data from out
        this.imageList = categories;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        context = recyclerView.getContext();
    }

    @NonNull
    @Override
    public ImageAdapter.carViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//inflate of layout and Components
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image_in_main, parent, false);
        return new ImageAdapter.carViewHolder(RowImageInMainBinding.bind(view));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.carViewHolder holder, final int position) {// put new data ever time
        InfoImage image = imageList.get(position);
        holder.binding.ivLogo.setBackgroundResource(image.getSrcImage());

    }


    @Override
    public int getItemCount() {
        return imageList.size();
    }

    class carViewHolder extends RecyclerView.ViewHolder {//declare elements and but resources
        RowImageInMainBinding binding;

        public carViewHolder(@NonNull RowImageInMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }


}
