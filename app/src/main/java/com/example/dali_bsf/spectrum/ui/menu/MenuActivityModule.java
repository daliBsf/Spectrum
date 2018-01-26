package com.example.dali_bsf.spectrum.ui.menu;

import android.view.Menu;

import com.example.dali_bsf.spectrum.ui.home.HomeActivity;
import com.example.dali_bsf.spectrum.ui.home.HomeContract;
import com.example.dali_bsf.spectrum.ui.home.HomePresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by dali-bsf on 26/01/18.
 */
@Module
public abstract  class MenuActivityModule {
    @Binds
    public abstract MenuContract.MenuView provideView(MenuActivity menuActivity);
    @Provides
    public static MenuContract.MenuPresenter providePresenter(MenuContract.MenuView menuView)
    {
        return new MenuPresenter(menuView);
    }
}
