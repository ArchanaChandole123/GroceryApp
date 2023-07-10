package com.example.groceryapp.ui.main.grocery_details.home.rvadapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.R;
import com.example.groceryapp.databinding.LayoutBestsellingItemBinding;
import com.example.groceryapp.model.GroceryItem;
import com.example.groceryapp.utils.AdapterDiffUtil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class BestSellingRvAdapter extends ListAdapter<GroceryItem, BestSellingRvAdapter.BestSellingItemViewHolder> {

    private RvAdapterListener adapterListener;

    public BestSellingRvAdapter(RvAdapterListener adapterListener) {
        super(new AdapterDiffUtil());
        this.adapterListener = adapterListener;
    }

    @Override
    public void onBindViewHolder(@NonNull BestSellingItemViewHolder holder, int position) {
        GroceryItem groceryItem = getItem(position);

        holder.binding.tvGroceryName.setText(groceryItem.getName());
        holder.binding.ivGroceryImage.setImageResource(groceryItem.getImgId());

        // When the user clicks on a grocery item, open the Detail Fragment to show details
        holder.binding.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterListener.OnClickRvItem(groceryItem);
            }
        });
    }

    @NonNull
    @Override
    public BestSellingItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_bestselling_item, parent, false);
        return new BestSellingItemViewHolder(view);
    }

    public class BestSellingItemViewHolder extends RecyclerView.ViewHolder {
        LayoutBestsellingItemBinding binding;

        public BestSellingItemViewHolder(View view) {
            super(view);
            binding = LayoutBestsellingItemBinding.bind(view);
        }
    }
}

