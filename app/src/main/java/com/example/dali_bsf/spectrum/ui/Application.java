package com.example.dali_bsf.spectrum.ui;

import com.example.dali_bsf.spectrum.data.model.RealmModule;
import com.example.dali_bsf.spectrum.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by dali-bsf on 15/01/18.
 */

public class Application extends DaggerApplication
{

    @Override
    public void onCreate() {
        super.onCreate();
        RealmConfiguration config = new RealmConfiguration.Builder(getApplicationContext()).setModules(new RealmModule()).build();
        Realm.setDefaultConfiguration(config);

    }



    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        return  DaggerAppComponent.builder().create(this);
    }
}
