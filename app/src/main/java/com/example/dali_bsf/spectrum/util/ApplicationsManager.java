package com.example.dali_bsf.spectrum.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
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

    public ApplicationsManager(Context context) {
        this.context = context;
    }

    public List<Application> getListApplication() {
        List<Application> applications = new ArrayList<>();
        PackageManager pm = context.getPackageManager();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo applicationInfo : packages) {
            if (!isSystemPackage(applicationInfo)) {
                Drawable drawable = applicationInfo.loadIcon(pm);
                applications.add(new Application(applicationInfo.packageName, drawable, pm.getLaunchIntentForPackage(applicationInfo.packageName), false));

            }
        }

        return applications;
    }

    public List<Application> getAuthorizedApplication(Enfant enfant) {
        List<Application> allApps = this.getListApplication();
        List<Application> authotzied = new ArrayList<>();
        SharedPreferences sharedPreferences = this.sharedPreferencesManager.getSharedPrefernces(enfant.getLogin());
        for (Application application : allApps) {
            if (sharedPreferences.getBoolean(application.getName(), false)) {
                application.setAuthorized(true);
                authotzied.add(application);
            }
        }
        return authotzied;

    }
    private boolean isSystemPackage(ApplicationInfo applicationInfo) {
        return ((applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0) ? true : false;
    }

    public void updateApplication(Enfant enfant, List<Application> applications) {
        SharedPreferences preferences = sharedPreferencesManager.getSharedPrefernces(enfant.getLogin());
        SharedPreferences.Editor editor = preferences.edit();
        for (Application application : applications
                ) {

            editor.putBoolean(application.getName(), application.isAuthorized());


        }
    }

}
