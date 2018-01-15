package com.example.dali_bsf.spectrum;

import android.app.Application;

import com.example.dali_bsf.spectrum.data.model.RealmModule;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by khalil on 13/01/2018.
 */

public class App extends Application {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        RealmConfiguration config = new RealmConfiguration.Builder(getApplicationContext()).setModules(new RealmModule()).build();
        Realm.setDefaultConfiguration(config);
    }

    public static App getInstance() {
        return instance;
    }
}
