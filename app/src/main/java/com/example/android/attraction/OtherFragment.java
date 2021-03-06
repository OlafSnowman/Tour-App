package com.example.android.attraction;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class OtherFragment extends Fragment {

    public OtherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.test, R.string.other,
                R.drawable.thumbs_up_512));
        attractions.add(new Attraction(R.string.test, R.string.other,
                R.drawable.thumbs_up_512));
        attractions.add(new Attraction(R.string.test, R.string.other,
                R.drawable.thumbs_up_512));
        attractions.add(new Attraction(R.string.test, R.string.other,
                R.drawable.thumbs_up_512));
        attractions.add(new Attraction(R.string.test, R.string.other,
                R.drawable.thumbs_up_512));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}