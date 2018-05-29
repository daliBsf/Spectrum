package com.example.dali_bsf.spectrum.data.Repostry;

import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.List;

/**
 * Created by khalil on 26/01/2018.
 */

public interface IApplicationRepository {
    void addApplication(Application application, onUpdateCallback callback);
    void deleteApplication(String nom,onUpdateCallback callback);
    void getApplication(String nom,onGetCallback callback);
    void getAllApplication(onGetCallback callback);

    public interface onGetCallback{
        public void onSuccess(Application result);
        public void onSuccess(List<Application> result);
        public void onFail(Application result);
        public void onFail(List<Application> result);
    }
    public interface onUpdateCallback{
        public void onSuccess();
        public void onFail();
    }
}
