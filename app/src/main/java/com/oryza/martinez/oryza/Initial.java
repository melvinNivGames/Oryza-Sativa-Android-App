package com.oryza.martinez.oryza;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by melvin.g.uy on 8/13/2017.
 */

public class Initial extends Fragment {
    View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.initial_main, container, false);
        return myView;
    }
}
