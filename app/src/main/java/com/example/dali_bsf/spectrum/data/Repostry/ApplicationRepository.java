package com.example.dali_bsf.spectrum.data.Repostry;

import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.List;

import io.realm.Realm;

/**
 * Created by khalil on 26/01/2018.
 */

public class ApplicationRepository implements IApplicationRepository {

    com.example.dali_bsf.spectrum.ui.Application _application ;
    public ApplicationRepository(com.example.dali_bsf.spectrum.ui.Application _application){this._application= _application;}

    @Override
    public void addApplication(Application application, onUpdateCallback callback) {
        Realm realm = Realm.getInstance(_application);
        realm.beginTransaction();
        Application app = realm.createObject(Application.class);
        app.setIcon(application.getIcon());
        app.setName(application.getName());
        realm.commitTransaction();
        if (callback != null)
            callback.onSuccess();
        else
            callback.onFail();
    }


    @Override
    public void deleteApplication(String nom, onUpdateCallback callback) {
    Realm realm =Realm.getInstance(_application);
    realm.beginTransaction();
    Application application = realm.where(Application.class).equalTo("Name", nom).findFirst();
    application.removeFromRealm();
    realm.commitTransaction();
    if (callback != null)
            callback.onSuccess();
    else
            callback.onFail();
    }

    @Override
    public void getApplication(String nom, onGetCallback callback) {
        Realm realm =Realm.getInstance(_application);
        Application result = realm.where(Application.class).equalTo("Name", nom).findFirst();
        if (callback != null)
            callback.onSuccess(result);
        else
            callback.onFail(result);
    }

    @Override
    public void getAllApplication(onGetCallback callback) {
        Realm realm =Realm.getInstance(_application);
        List<Application> result = realm.where(Application.class).findAll();
        if (callback != null)
            callback.onSuccess(result);
        else
            callback.onFail(result);
    }

}
