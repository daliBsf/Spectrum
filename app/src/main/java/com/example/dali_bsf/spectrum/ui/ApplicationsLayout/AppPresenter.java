package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

/**
 * Created by khalil on 26/01/2018.
 */

public class AppPresenter implements ApplicationsContract.ApplicationPresenter {

    ApplicationsContract.ApplicationView view;

    public AppPresenter(ApplicationsContract.ApplicationView view){ this.view = view ;}

    @Override
    public void start() {
        prepareMovieData();
    }

    @Override
    public void prepareMovieData() {

    }
}