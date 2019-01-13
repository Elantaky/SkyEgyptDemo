package com.zecode.z.skyegyptdemo.Fragments;

public class SuggestedItemObject {

    private int imageResourceId = HASIMAGE;

    private static final int HASIMAGE = -1;

    public SuggestedItemObject(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    public boolean hasImage() {

        return HASIMAGE != imageResourceId;

    }
}
