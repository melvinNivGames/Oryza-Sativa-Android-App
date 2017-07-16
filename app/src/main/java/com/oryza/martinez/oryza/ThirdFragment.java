package com.oryza.martinez.oryza;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.numetriclabz.numandroidcharts.ChartData;
import com.numetriclabz.numandroidcharts.GaugeChart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Uy on 5/29/2017.
 */

public class ThirdFragment extends Fragment {
    @Nullable

    View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.third_layout, container, false);


        GaugeChart gauge = (GaugeChart) myView.findViewById(R.id.gauge_chart);

        List values = new ArrayList<>();
        values.add(new ChartData(60f));
        values.add(new ChartData(65f));
        values.add(new ChartData(55f));

        gauge.setData(values);
        gauge.setAngle(90);

        return myView;
    }
}
