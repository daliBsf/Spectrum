package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import android.content.Context;
import android.content.Intent;

import com.example.dali_bsf.spectrum.util.ApplicationsManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by khalil on 26/01/2018.
 */

@Module
public abstract class ApplicationActivityModule {

    @Binds
    public abstract ApplicationsContract.ApplicationView provideView(ApplicationsActivity activity);

    @Provides
    public static ApplicationsContract.ApplicationPresenter providePresenter(ApplicationsContract.ApplicationView view, ApplicationsManager manager){
        return new AppPresenter(view,manager);
    }


}
