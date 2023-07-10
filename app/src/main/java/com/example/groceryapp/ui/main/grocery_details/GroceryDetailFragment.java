package com.example.groceryapp.ui.main.grocery_details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.groceryapp.databinding.FragmentGroceryDetailBinding;
import com.example.groceryapp.model.GroceryItem;
import com.example.groceryapp.utils.Constants;

import androidx.navigation.fragment.NavHostFragment;

public class GroceryDetailFragment extends Fragment {
    private FragmentGroceryDetailBinding binding;
    private GroceryItem groceryItem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGroceryDetailBinding.inflate(inflater, container, false);

        // Get the grocery item data from arguments
        groceryItem = getArguments().getParcelable(Constants.GROCERY_ITEM);

        initUi();

        return binding.getRoot();
    }

    private void initUi() {
        binding.tvGroceryName.setText(groceryItem.getName());



        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(GroceryDetailFragment.this).popBackStack();
            }
        });
    }
}
