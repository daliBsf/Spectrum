package com.example.dali_bsf.spectrum.ui.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;

import butterknife.BindInt;
import butterknife.BindView;

public class GridFragment extends Fragment {
    @BindView(R.id.grid_view_home)
    public RecyclerView gridView;

    @BindInt(R.integer.grid_col_number)
    public  int gridColNumber;
    private ArrayList<Application> applications;


    public GridFragment() {
        // Required empty public constructor
    }

    public static GridFragment newInstance(ArrayList<Application> applications ) {
        GridFragment fragment = new GridFragment();
        fragment.setApplications(applications);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeGridViewAdapter homeGridViewAdapter =new HomeGridViewAdapter(getContext(),applications );
        gridView.setAdapter(homeGridViewAdapter);
        gridView.setLayoutManager(new GridLayoutManager(getContext(),gridColNumber));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid, container, false);
    }


    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }


}
