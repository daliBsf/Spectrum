package com.example.dali_bsf.spectrum.data.Repostry;

import com.example.dali_bsf.spectrum.data.model.Parent;

import java.util.List;

/**
 * Created by khalil on 13/01/2018.
 */

public interface IParentRepository {
    void addParent(Parent parent,onUpdateCallback callback);
    void deleteParent(String Id,onUpdateCallback callback);
    void getParent(String Id,onGetCallback callback);
    void getAllParent(onGetCallback callback);

    public interface onGetCallback{
        public void onSuccess(Parent result);
        public void onSuccess(List<Parent> result);
        public void onFail(List<Parent> result);
        public void onFail(Parent result);
    }
    public interface onUpdateCallback{
        public void onSuccess();
        public void onFail();
    }
}
