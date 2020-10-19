package com.example.android.attraction;


public class Attraction {
    private int mDescription;
    private int mAttraction;
    private int mImageResourceId;

    public Attraction(int description, int attraction, int imageResourceId) {
        mDescription = description;
        mAttraction = attraction;
        mImageResourceId = imageResourceId;
    }
    public int getDescription() {
        return mDescription;
    }

    public int getAttraction() {
        return mAttraction;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

}