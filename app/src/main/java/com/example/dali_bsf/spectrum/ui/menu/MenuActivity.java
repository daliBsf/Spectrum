package com.example.dali_bsf.spectrum.ui.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.ui.Application;
import com.example.dali_bsf.spectrum.ui.home.HomeContract;
import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.DaggerActivity;

public class MenuActivity extends DaggerActivity implements  MenuContract.MenuView {
    @BindView(R.id.viewpager)
    public ViewPager pager;
    @BindInt(R.integer.grid_col_number)
    public int gridColNumber;
    // la list des application qui va etre affiché par chaque fragment
    private List<List<Application>> applicationsList;
    //la list de tous les application qui sont accessible par l'enfant
    private List<Application> applications;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        applicationsList=new ArrayList<>();
        applications=new ArrayList<>();
        int fragmentNumber=applications.size()/(gridColNumber*2);
        //zid thebet fel partie hedhi 5astan les index i,j
        for(int i=0; i < fragmentNumber-1;i++) {
            List<Application> apps=new ArrayList<>();
            for ( int j=i*(gridColNumber*2);j<i*(gridColNumber*2+1);j++) {
                apps.add(applications.get(j));
            }
            applicationsList.add(apps);
        }


    }




    @Override
    public void setPresenter(HomeContract.HomePresenter presenter) {

    }
}
