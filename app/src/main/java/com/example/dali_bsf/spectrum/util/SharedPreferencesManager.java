package com.example.dali_bsf.spectrum.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dali-bsf on 29/05/18.
 */

public class SharedPreferencesManager {
    private  Context context;

    public SharedPreferencesManager(Context context)
    {
        this.context=context;

    }

    public SharedPreferences getSharedPrefernces(String user ) {
        return this.context.getSharedPreferences(user,Context.MODE_PRIVATE);


    }




}
