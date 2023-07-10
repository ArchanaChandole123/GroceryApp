package com.example.groceryapp.ui.main.grocery_details.home.rvadapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.R;
import com.example.groceryapp.databinding.LayoutWideGroceriesItemBinding;
import com.example.groceryapp.model.GroceryItem;
import com.example.groceryapp.utils.AdapterDiffUtil;


public class GroceriesWideAdapter extends ListAdapter<GroceryItem, GroceriesWideAdapter.GroceriesItemViewHolder> {
    private RvAdapterListener adapterListener;

    public GroceriesWideAdapter(RvAdapterListener adapterListener) {
        super(new AdapterDiffUtil());
        this.adapterListener = adapterListener;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceriesItemViewHolder holder, int position) {
        GroceryItem groceryItem = getItem(position);

        holder.binding.ivGroceryImage.setImageResource(groceryItem.getImgId());
        holder.binding.tvGroceryName.setText(groceryItem.getName());

        switch (position % 2) {
            case 0:
                holder.binding.itemLayout.setCardBackgroundColor(holder.binding.getRoot().getResources().getColor(R.color.creamy, null));
                break;
            case 1:
                holder.binding.itemLayout.setCardBackgroundColor(holder.binding.getRoot().getResources().getColor(R.color.creamy_blue, null));
                break;
        }

        holder.binding.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterListener.OnClickRvItem(groceryItem);
            }
        });
    }

    @NonNull
    @Override
    public GroceriesItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_wide_groceries_item, parent, false);
        return new GroceriesItemViewHolder(view);
    }

    public class GroceriesItemViewHolder extends RecyclerView.ViewHolder {
        LayoutWideGroceriesItemBinding binding;

        public GroceriesItemViewHolder(View view) {
            super(view);
            binding = LayoutWideGroceriesItemBinding.bind(view);
        }
    }
}
