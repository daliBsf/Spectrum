package com.example.dali_bsf.spectrum.data.model;


import io.realm.RealmObject;

/**
 * Created by dali-bsf on 16/01/18.
 */

public class Application extends RealmObject {
    private String name;
    private int icon ;


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
}
