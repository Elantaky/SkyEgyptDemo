package com.zecode.z.skyegyptdemo.Fragments;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.zecode.z.skyegyptdemo.R;

import java.util.ArrayList;

public class SuggesstionAdapter extends ArrayAdapter<SuggestedItemObject> {


    public SuggesstionAdapter(Activity context, ArrayList<SuggestedItemObject> words) {

        super(context, 0, words);

    }


    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        SuggestedItemObject suggestedItemObject = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (suggestedItemObject.hasImage()) {

            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to imageView
            imageView.setImageResource(suggestedItemObject.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {

            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to imageView
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
