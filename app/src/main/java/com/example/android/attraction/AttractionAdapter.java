package com.example.android.attraction;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction>  {

    private int mColorResourceId;

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attraction_text_view);

        attractionTextView.setText(currentAttraction.getAttraction());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        defaultTextView.setText(currentAttraction.getDescription());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentAttraction.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}