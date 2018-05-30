package com.example.dali_bsf.spectrum.data.model;


import android.content.Intent;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by dali-bsf on 16/01/18.
 */

public class Application extends RealmObject {
    private String name;
    private int icon ;
    @Ignore
    private Intent intent;
    private  boolean authorized;


    public Application(String name, int icon, Intent intent,boolean authorized) {
        this.name = name;
        this.icon = icon;
        this.intent = intent;
        this.authorized=authorized;
    }
    public Application(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public Application() {
    }


    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
}
