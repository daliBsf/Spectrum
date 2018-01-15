package com.example.dali_bsf.spectrum.ui.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import cfe.spectrum.R;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;


public class HomeActivity extends DaggerAppCompatActivity implements HomeContract.HomeView {
    @Inject
    HomeContract.HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void setPresenter(HomeContract.HomePresenter presenter) {

    }
}
