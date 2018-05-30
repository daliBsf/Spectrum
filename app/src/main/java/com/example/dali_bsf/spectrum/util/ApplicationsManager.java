package com.example.dali_bsf.spectrum.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v4.app.AppLaunchChecker;
import android.util.Log;

import com.example.dali_bsf.spectrum.data.model.Application;
import com.example.dali_bsf.spectrum.data.model.Enfant;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by dali-bsf on 25/01/18.
 */

public class ApplicationsManager {
    private Context context;
    private SharedPreferencesManager sharedPreferencesManager;
    private SharedPreferences.Editor editor;


    public ApplicationsManager(Context context) {
        this.context = context;
    }

    public List<Application> getListApplication() {
        List<Application> applications = new ArrayList<>();
        PackageManager pm = context.getPackageManager();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo packageInfo : packages) {
            applications.add(new Application(packageInfo.packageName, packageInfo.loadIcon(pm), pm.getLaunchIntentForPackage(packageInfo.packageName),false));
        }
        return applications;
    }

    public List<Application> getAuthorizedApplication(Enfant enfant) {
        List<Application> allApps = this.getListApplication();
        List<Application> authotzied = new ArrayList<>();
        SharedPreferences sharedPreferences = this.sharedPreferencesManager.getSharedPrefernces(enfant.getLogin());
        for (Application application : allApps) {
            if (sharedPreferences.getBoolean(application.getName(), false))
            { application.setAuthorized(true);
                authotzied.add(application);
        }}
        return authotzied;

    }

    public void updateApplication(Enfant enfant, Application application) {
        SharedPreferences.Editor editor = getEditor(enfant);
        editor.putBoolean(application.getName(),application.isAuthorized());

    }
    public  void commitUpdateApp(){
        editor.commit();
        editor=null;
    }
    private SharedPreferences.Editor getEditor(Enfant enfant){
        if(editor==null)
            editor= sharedPreferencesManager.getSharedPrefernces(enfant.getLogin()).edit();
        return editor;


    }

}
