package com.example.dali_bsf.spectrum.di;

import com.example.dali_bsf.spectrum.ui.ApplicationsLayout.ApplicationActivityModule;
import com.example.dali_bsf.spectrum.ui.ApplicationsLayout.ApplicationsActivity;
import com.example.dali_bsf.spectrum.ui.ParentLayout.ParentActivity;
import com.example.dali_bsf.spectrum.ui.Test.Test;
import com.example.dali_bsf.spectrum.ui.home.HomeActivity;
import com.example.dali_bsf.spectrum.ui.home.HomeActivityModule;
import com.example.dali_bsf.spectrum.ui.menu.MenuActivity;
import com.example.dali_bsf.spectrum.ui.menu.MenuActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by dali-bsf on 15/01/18.
 */

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    public abstract HomeActivity bindHomeActivity();
    @ContributesAndroidInjector(modules = MenuActivityModule.class)
    public abstract MenuActivity bindMenuActivity();

    @ContributesAndroidInjector(modules = ApplicationActivityModule.class)
    public abstract ApplicationsActivity bindApplicationsActivity();
    @ContributesAndroidInjector(modules = ApplicationActivityModule.class)
    public abstract ParentActivity bindParentActivity();
    @ContributesAndroidInjector(modules = com.example.dali_bsf.spectrum.ui.Test.ApplicationActivityModule.class)
    public abstract Test bindTestActivity();


    /* ce code est equivalent a :
    @Binds
    @IntoMap
    @ActivityKey(HomeActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity> bindHomeActivity(HomeActivityComponent.Builder builder);

     */

}
