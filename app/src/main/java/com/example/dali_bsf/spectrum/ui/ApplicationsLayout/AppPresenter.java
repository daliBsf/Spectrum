package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import android.os.Bundle;

import com.example.dali_bsf.spectrum.data.model.Enfant;
import com.example.dali_bsf.spectrum.util.ApplicationsManager;

import java.util.List;


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
    public void create(Bundle bundle) {
        enfant = (Enfant) bundle.getSerializable("enfant");

        prepareApplicationData();
    }

    @Override
    public void updateApplication(com.example.dali_bsf.spectrum.data.model.Application application) {
        this.manager.updateApplication(enfant,application);

    }

    private void prepareApplicationData() {
        List<com.example.dali_bsf.spectrum.data.model.Application> list=manager.getListApplication();
        this.view.updateList(list);

    }

    @Override
    public void onBack() {
        commitChanges();
    }

    @Override
    public void homePressed() {
        commitChanges();
    }

    @Override
    public void start() {

    }
    private  void commitChanges(){
        this.manager.commitUpdateApp();
    }

}
