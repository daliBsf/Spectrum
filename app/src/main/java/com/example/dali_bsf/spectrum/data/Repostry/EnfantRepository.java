package com.example.dali_bsf.spectrum.data.Repostry;

import com.example.dali_bsf.spectrum.data.model.Enfant;
import com.example.dali_bsf.spectrum.ui.Application;

import java.util.List;
import java.util.UUID;

import io.realm.Realm;

/**
 * Created by khalil on 13/01/2018.
 */

public class EnfantRepository implements IEnfantRepository {

    Application application ;
    public EnfantRepository(Application application)
    {
        this.application=application;
    }

    @Override
    public void addEnfant(Enfant enfant, onUpdateCallback callback) {
        Realm realm = Realm.getInstance(application);
        realm.beginTransaction();
        Enfant e = realm.createObject(Enfant.class);
        e.setId(UUID.randomUUID().toString());
        e.setLogin(enfant.getLogin());
        e.setSexe(enfant.getSexe());
        e.setAvatar(enfant.getAvatar());
        realm.commitTransaction();
        if (callback != null)
            callback.onSuccess();
        else
            callback.onFail();
    }

    @Override
    public void deleteEnfant(String Id, onUpdateCallback callback) {
        Realm realm = Realm.getInstance(application);
        realm.beginTransaction();
        Enfant enfant = realm.where(Enfant.class).equalTo("Id", Id).findFirst();
        enfant.removeFromRealm();
        realm.commitTransaction();
        if (callback != null)
            callback.onSuccess();
        else
            callback.onFail();
    }

    @Override
    public void getEnfant(String Id, onGetCallback callback) {
        Realm realm = Realm.getInstance(application);
        Enfant result = realm.where(Enfant.class).equalTo("Id", Id).findFirst();
        if (callback != null)
            callback.onSuccess(result);
        else
            callback.onFail(result);
    }

    @Override
    public void getAllEnfant(onGetCallback callback) {
        Realm realm = Realm.getInstance(application);
        List<Enfant> result = (List<Enfant>) realm.where(Enfant.class);
        if (callback != null)
            callback.onSuccess(result);
        else
            callback.onFail(result);
    }
}
