package com.example.groceryapp.model;

import com.example.groceryapp.R;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static final List<GroceryItem> fruitsList = new ArrayList<GroceryItem>() {{
        add(new GroceryItem("Organic Bananas", 4.99, 7, "pcs", R.drawable.img_banana));
        add(new GroceryItem("Organic Bananas", 4.99, 1, "kg", R.drawable.img_apple));
        add(new GroceryItem("Organic Bananas", 4.99, 7, "pcs", R.drawable.img_banana));
        add(new GroceryItem("Organic Bananas", 4.99, 1, "kg", R.drawable.img_apple));
        add(new GroceryItem("Organic Bananas", 4.99, 7, "pcs", R.drawable.img_banana));
        add(new GroceryItem("Organic Bananas", 4.99, 1, "kg", R.drawable.img_apple));
        add(new GroceryItem("Organic Bananas", 4.99, 7, "pcs", R.drawable.img_banana));
        add(new GroceryItem("Organic Bananas", 4.99, 1, "kg", R.drawable.img_apple));
    }};

    public static final List<GroceryItem> groceriesList = new ArrayList<GroceryItem>() {{
        add(new GroceryItem("Pulses", 4.99, 1, "kg", R.drawable.img_pulses));
        add(new GroceryItem("Rice", 4.99, 1, "kg", R.drawable.img_rice));
        add(new GroceryItem("Pulses", 4.99, 1, "kg", R.drawable.img_pulses));
        add(new GroceryItem("Rice", 4.99, 1, "kg", R.drawable.img_rice));
    }};

    public static final List<GroceryItem> bestSellingList = new ArrayList<GroceryItem>() {{
        add(new GroceryItem("Bell Pepper Red", 4.99, 1, "kg", R.drawable.img_red_pepper));
        add(new GroceryItem("Ginger", 4.99, 1, "kg", R.drawable.img_ginger));
        add(new GroceryItem("Bell Pepper Red", 4.99, 1, "kg", R.drawable.img_red_pepper));
        add(new GroceryItem("Ginger", 4.99, 1, "kg", R.drawable.img_ginger));
        add(new GroceryItem("Bell Pepper Red", 4.99, 1, "kg", R.drawable.img_red_pepper));
        add(new GroceryItem("Ginger", 4.99, 1, "kg", R.drawable.img_ginger));
        add(new GroceryItem("Bell Pepper Red", 4.99, 1, "kg", R.drawable.img_red_pepper));
        add(new GroceryItem("Ginger", 4.99, 1, "kg", R.drawable.img_ginger));
    }};
}

