package com.example.dali_bsf.spectrum.data.Repostry;

import com.example.dali_bsf.spectrum.App;
import com.example.dali_bsf.spectrum.data.model.Parent;

import java.util.List;
import java.util.UUID;

import io.realm.Realm;

/**
 * Created by khalil on 13/01/2018.
 */

public class ParentRepository implements IParentRepository {
    @Override
    public void addParent(Parent parent, onUpdateCallback callback) {
        Realm realm = Realm.getInstance(App.getInstance());
        realm.beginTransaction();
        Parent p = realm.createObject(Parent.class);
        p.setId(UUID.randomUUID().toString());
        p.setPassword(parent.getPassword());
        realm.commitTransaction();
        if (callback != null)
            callback.onSuccess();
        else
            callback.onFail();
    }

    @Override
    public void deleteParent(String Id, onUpdateCallback callback) {
        Realm realm = Realm.getInstance(App.getInstance());
        realm.beginTransaction();
        Parent parent= realm.where(Parent.class).equalTo("Id", Id).findFirst();
        parent.removeFromRealm();
        realm.commitTransaction();
        if (callback != null)
            callback.onSuccess();
        else
            callback.onFail();
    }

    @Override
    public void getParent(String Id, onGetCallback callback) {
        Realm realm = Realm.getInstance(App.getInstance());
        Parent result = realm.where(Parent.class).equalTo("Id", Id).findFirst();
        if (callback != null)
            callback.onSuccess(result);
        else
            callback.onFail(result);
    }

    @Override
    public void getAllParent(onGetCallback callback) {
        Realm realm = Realm.getInstance(App.getInstance());
        List<Parent> result = (List<Parent>) realm.where(Parent.class);
        if (callback != null)
            callback.onSuccess(result);
        else
            callback.onFail(result);
    }
}
