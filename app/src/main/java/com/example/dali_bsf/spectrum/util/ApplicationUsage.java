package com.example.dali_bsf.spectrum.util;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.Calendar;
import java.util.List;

public class ApplicationUsage {
    Context context;
    UsageStatsManager mUsageStatsManager;


    public UsageStats getStats(Application application) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mUsageStatsManager = (UsageStatsManager) context.getSystemService(Context.USAGE_STATS_SERVICE);
            List<UsageStats> usageStatsList = mUsageStatsManager.queryUsageStats(UsageStatsManager.INTERVAL_DAILY, cal.getTimeInMillis(), System.currentTimeMillis());

            for (UsageStats usageStats
                    : usageStatsList
                    ) {

                if (usageStats.getPackageName().equalsIgnoreCase(application.getName()))
                    return usageStats;
            }
        }
        return null;

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private boolean isLimitReached(Application application)
    {

        UsageStats usageStats=getStats(application);
        long usage=usageStats.getTotalTimeInForeground();
        return  true;
    }

}
