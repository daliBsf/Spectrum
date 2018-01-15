package com.example.dali_bsf.spectrum.di;

import com.example.dali_bsf.spectrum.ui.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by dali-bsf on 15/01/18.
 */
@Component(modules = {AndroidSupportInjectionModule.class,AppModule.class,ActivityBuilder.class})
public interface AppComponent extends  AndroidInjector<Application> {

        @Component.Builder
        abstract class Builder extends AndroidInjector.Builder<Application> {

        }
}
