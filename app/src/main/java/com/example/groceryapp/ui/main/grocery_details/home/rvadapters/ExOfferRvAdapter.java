package com.example.groceryapp.ui.main.grocery_details.home.rvadapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.R;
import com.example.groceryapp.databinding.LayoutOfferItemBinding;
import com.example.groceryapp.model.GroceryItem;
import com.example.groceryapp.utils.AdapterDiffUtil;

import java.util.ArrayList;

public class ExOfferRvAdapter extends ListAdapter<GroceryItem, ExOfferRvAdapter.ExOfferItemViewHolder> {

    private ArrayList<GroceryItem> itemList = new ArrayList<>();
    private RvAdapterListener rvAdapterListener;

    public ExOfferRvAdapter(RvAdapterListener rvAdapterListener) {
        super(new AdapterDiffUtil());
        this.rvAdapterListener = rvAdapterListener;
    }

    @Override
    public void onBindViewHolder(@NonNull ExOfferItemViewHolder holder, int position) {
        GroceryItem groceryItem = getItem(position);

        holder.binding.ivGroceryImage.setImageResource(groceryItem.getImgId());
        holder.binding.tvGroceryName.setText(groceryItem.getName());

        holder.binding.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvAdapterListener.OnClickRvItem(groceryItem);
            }
        });
    }

    @NonNull
    @Override
    public ExOfferItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_offer_item, parent, false);
        return new ExOfferItemViewHolder(view);
    }

    public void submitList(ArrayList<GroceryItem> newItemList) {
        itemList.clear();
        itemList.addAll(newItemList);
        notifyDataSetChanged();
    }

    public class ExOfferItemViewHolder extends RecyclerView.ViewHolder {
        LayoutOfferItemBinding binding;

        public ExOfferItemViewHolder(View view) {
            super(view);
            binding = LayoutOfferItemBinding.bind(view);
        }
    }
}
