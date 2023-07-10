package com.example.groceryapp.ui.main.grocery_details.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.groceryapp.R;
import com.example.groceryapp.databinding.FragmentHomeBinding;
import com.example.groceryapp.model.DummyData;
import com.example.groceryapp.model.GroceryItem;
import com.example.groceryapp.ui.main.grocery_details.home.rvadapters.BestSellingRvAdapter;
import com.example.groceryapp.ui.main.grocery_details.home.rvadapters.ExOfferRvAdapter;
import com.example.groceryapp.ui.main.grocery_details.home.rvadapters.GroceriesWideAdapter;
import com.example.groceryapp.ui.main.grocery_details.home.rvadapters.RvAdapterListener;
import com.example.groceryapp.utils.Constants;

import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

public class HomeFragment extends Fragment implements RvAdapterListener {

    private FragmentHomeBinding binding;
    private ExOfferRvAdapter exlusiveOffierRvAdapter;
    private GroceriesWideAdapter groceriesWideAdapter;
    private BestSellingRvAdapter bestSellingRvAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        initUi();
        return binding.getRoot();
    }

    private void initUi() {


        // Initializing Exclusive Offers Recycler View
        exlusiveOffierRvAdapter = new ExOfferRvAdapter(this);
        exlusiveOffierRvAdapter.submitList(DummyData.fruitsList);
        binding.rvExclusiveOffers.setAdapter(exlusiveOffierRvAdapter);
        binding.rvExclusiveOffers.setHasFixedSize(true);
        binding.rvExclusiveOffers.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        // Initializing Grocery Recycler View
        groceriesWideAdapter = new GroceriesWideAdapter(this);
        groceriesWideAdapter.submitList(DummyData.groceriesList);
        binding.rvGroceries.setAdapter(groceriesWideAdapter);
        binding.rvGroceries.setHasFixedSize(true);
        binding.rvGroceries.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initializing Best Selling Groceries Recycler View
        bestSellingRvAdapter = new BestSellingRvAdapter(this);
        bestSellingRvAdapter.submitList(DummyData.bestSellingList);
        binding.rvBestSellingGrocries.setAdapter(bestSellingRvAdapter);
        binding.rvBestSellingGrocries.setHasFixedSize(true);
        binding.rvBestSellingGrocries.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    @Override
    public void OnClickRvItem(GroceryItem groceryItem) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.GROCERY_ITEM, groceryItem);
        NavHostFragment.findNavController(this).navigate(R.id.action_homeFragment_to_groceryDetailFragment, bundle);
    }
}
