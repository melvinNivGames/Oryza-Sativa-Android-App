package com.oryza.martinez.oryza;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Uy on 5/29/2017.
 */

public class SixthFragment extends Fragment {
    @Nullable

    View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.sixth_layout, container, false);
        return myView;
    }
}
