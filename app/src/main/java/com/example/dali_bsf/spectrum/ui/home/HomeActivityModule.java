package com.example.dali_bsf.spectrum.ui.home;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by dali-bsf on 15/01/18.
 */
@Module
public abstract class HomeActivityModule {


    @Binds
    public abstract HomeContract.HomeView provideView(HomeActivity homeActivity);
    @Provides
    public static HomeContract.HomePresenter providePresenter(HomeContract.HomeView homeView)
    {
        return new HomePresenter(homeView);
    }
}
