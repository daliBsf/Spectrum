package com.example.dali_bsf.spectrum.ui.home;

/**
 * Created by dali-bsf on 15/01/18.
 */

public class HomePresenter implements  HomeContract.HomePresenter{
    HomeContract.HomeView view ;
    public HomePresenter(HomeContract.HomeView view ) {
        this.view = view;
    }
    @Override
    public void start() {

    }
}
