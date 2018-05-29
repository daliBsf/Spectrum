package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

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
    public static ApplicationsContract.ApplicationPresenter providePresenter(ApplicationsContract.ApplicationView view){
        return new AppPresenter(view);
    }
}
