package com.example.dali_bsf.spectrum.ui;

import android.app.Activity;

import com.example.dali_bsf.spectrum.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created by dali-bsf on 15/01/18.
 */

public class Application extends DaggerApplication
{





    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
