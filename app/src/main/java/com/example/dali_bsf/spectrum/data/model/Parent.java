package com.example.dali_bsf.spectrum.data.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by dali-bsf on 13/01/18.
 */

public class Parent extends RealmObject {
    @PrimaryKey
    private String Id;

    @Required
    private String password;

    public void setId(String id) {
        Id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getId() {
        return Id;
    }

    public String getPassword() {
        return password;
    }
}
