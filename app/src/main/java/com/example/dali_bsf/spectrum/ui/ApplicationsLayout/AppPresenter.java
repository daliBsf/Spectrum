package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import com.example.dali_bsf.spectrum.ui.Application;
import com.example.dali_bsf.spectrum.util.ApplicationsManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khalil on 26/01/2018.
 */

public class AppPresenter implements ApplicationsContract.ApplicationPresenter {

    ApplicationsContract.ApplicationView view;
    ApplicationsManager manager;


    public AppPresenter(ApplicationsContract.ApplicationView view, ApplicationsManager manager){
        this.view = view ;
        this.manager=manager;
    }

    @Override
    public void start() {
        prepareMovieData();
    }

    @Override
    public void prepareMovieData() {
        List<com.example.dali_bsf.spectrum.data.model.Application> list=manager.getListApplication();
        this.view.updateList(list);


    }
}