package com.example.dali_bsf.spectrum.data.Repostry;

import com.example.dali_bsf.spectrum.data.model.Enfant;

import java.util.List;

/**
 * Created by khalil on 13/01/2018.
 */

public interface IEnfantRepository {
    void addEnfant(Enfant enfant,onUpdateCallback callback);
    void deleteEnfant(String Id,onUpdateCallback callback);
    void getEnfant(String Id,onGetCallback callback);
    void getAllEnfant(onGetCallback callback);

    public interface onGetCallback{
        public void onSuccess(Enfant result);
        public void onSuccess(List<Enfant> result);
        public void onFail(Enfant result);
        public void onFail(List<Enfant> result);
    }
    public interface onUpdateCallback{
        public void onSuccess();
        public void onFail();
    }

}
