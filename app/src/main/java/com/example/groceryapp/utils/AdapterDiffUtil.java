package com.example.groceryapp.utils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.example.groceryapp.model.GroceryItem;

import androidx.recyclerview.widget.DiffUtil;

public class AdapterDiffUtil extends DiffUtil.ItemCallback<GroceryItem> {

    @Override
    public boolean areContentsTheSame(@NonNull GroceryItem oldItem, @NonNull GroceryItem newItem) {
        return oldItem.getName().equals(newItem.getName());
    }

    @Override
    public boolean areItemsTheSame(@NonNull GroceryItem oldItem, @NonNull GroceryItem newItem) {
        return oldItem.getName().equals(newItem.getName());
    }
}
