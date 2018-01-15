package com.example.dali_bsf.spectrum.data.model;

import io.realm.RealmObject;
import io.realm.annotations.*;

/**
 * Created by dali-bsf on 13/01/18.
 */

public class Enfant extends RealmObject {
    @PrimaryKey
    private String Id;

    @Required
    private String login;

    @Required
    private String sexe;

    private String avatar;

    public String getId() {
        return Id;
    }

    public String getLogin() {
        return login;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


}
