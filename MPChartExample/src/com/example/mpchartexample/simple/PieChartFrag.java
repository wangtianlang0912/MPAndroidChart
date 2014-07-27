package com.example.mpchartexample.simple;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mpchartexample.R;
import com.github.mikephil.charting.charts.PieChart;


public class PieChartFrag extends SimpleFragment {

    public static Fragment newInstance() {
        return new PieChartFrag();
    }

    private PieChart mChart;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_simple_pie, container, false);
        
        mChart = (PieChart) v.findViewById(R.id.pieChart1);
        mChart.setDescription("");
        
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Light.ttf");
        
        mChart.setValueTypeface(tf);
        mChart.setCenterTextTypeface(tf);
        mChart.setUsePercentValues(true);
        mChart.setCenterText("Quarterly\nRevenue");
        mChart.setCenterTextSize(23f);
        
        mChart.setData(generateLessData());
        
        return v;
    }
}