package com.example.dali_bsf.spectrum.di;

import com.example.dali_bsf.spectrum.data.Repostry.ApplicationRepository;
import com.example.dali_bsf.spectrum.data.Repostry.EnfantRepository;
import com.example.dali_bsf.spectrum.data.Repostry.IApplicationRepository;
import com.example.dali_bsf.spectrum.data.Repostry.IEnfantRepository;
import com.example.dali_bsf.spectrum.data.Repostry.IParentRepository;
import com.example.dali_bsf.spectrum.data.Repostry.ParentRepository;
import com.example.dali_bsf.spectrum.ui.Application;
import com.example.dali_bsf.spectrum.util.ApplicationsManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dali-bsf on 15/01/18.
 */
@Module
public class AppModule {

    @Provides
    ApplicationsManager provideApplicationManager(Application application)
    {
        return new ApplicationsManager(application.getApplicationContext());
    }
    @Provides
    IEnfantRepository provideEnfantRepository(Application application)
    {
        return new EnfantRepository(application);
    }
    @Provides
    IParentRepository provideParentRepository(Application application)
    {
        return  new ParentRepository(application);
    }
    @Provides
    public IApplicationRepository provideApplicationRepository(Application application)
    {
        return new ApplicationRepository(application);
    }
}
