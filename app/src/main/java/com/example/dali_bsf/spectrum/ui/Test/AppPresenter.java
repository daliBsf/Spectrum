package com.example.dali_bsf.spectrum.ui.Test;

import android.os.Bundle;

import com.example.dali_bsf.spectrum.data.model.Enfant;
import com.example.dali_bsf.spectrum.util.ApplicationsManager;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by khalil on 26/01/2018.
 */

public class AppPresenter implements ApplicationsContract.ApplicationPresenter {

    ApplicationsContract.ApplicationView view;
    ApplicationsManager manager;
    Enfant enfant;


    public AppPresenter(ApplicationsContract.ApplicationView view, ApplicationsManager manager){
        this.view = view ;
        this.manager=manager;
    }

    @Override
    public void start() {

    }

    @Override
    public void create(@Nullable Bundle bundle) {
        if(bundle!=null)
            enfant=(Enfant)bundle.getSerializable("enfant");
        prepareMovieData();

    }

    private void prepareMovieData() {
        List<com.example.dali_bsf.spectrum.data.model.Application> list=manager.getListApplication();
        this.view.updateList(list);


    }
}