package com.example.dali_bsf.spectrum.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by dali-bsf on 25/01/18.
 */

public class ApplicationsManager {
    private Context context;
    public ApplicationsManager(Context context)
    {
        this.context=context;
    }
    public List<Application> getListApplication() {
        List<Application> applications = new ArrayList<>();
        PackageManager pm = context.getPackageManager();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo packageInfo : packages) {
            applications.add(new Application(packageInfo.packageName, packageInfo.icon, pm.getLaunchIntentForPackage(packageInfo.packageName)));
        }
    return  applications;
    }


}
