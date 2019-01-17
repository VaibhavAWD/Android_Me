package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    // To initialize the fragment in the activity
    public BodyPartFragment() {
    }

    // Inflates fragment layout to display the body part images
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view to display body part
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Initialize the ImageView that will display the body parts
        ImageView displayBodyPart = rootView.findViewById(R.id.image_body_part);

        // Display a body part image
        displayBodyPart.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}
