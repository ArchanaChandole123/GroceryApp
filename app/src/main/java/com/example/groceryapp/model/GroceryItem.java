package com.example.groceryapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class GroceryItem implements Parcelable {

    private String name;
    private  double price;
    private int quantity;
    private String priceType;
    private int imgId;

    public GroceryItem(String name, double price, int quantity, String priceType, int imgId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.priceType = priceType;
        this.imgId = imgId;
    }

    protected GroceryItem(Parcel in) {
        name = in.readString();
        price = in.readDouble();
        quantity = in.readInt();
        priceType = in.readString();
        imgId = in.readInt();
    }

    public static final Creator<GroceryItem> CREATOR = new Creator<GroceryItem>() {
        @Override
        public GroceryItem createFromParcel(Parcel in) {
            return new GroceryItem(in);
        }

        @Override
        public GroceryItem[] newArray(int size) {
            return new GroceryItem[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeDouble(price);
        parcel.writeInt(quantity);
        parcel.writeString(priceType);
        parcel.writeInt(imgId);
    }
}
