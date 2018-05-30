package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import android.os.Bundle;

import com.example.dali_bsf.spectrum.data.model.Application;
import com.example.dali_bsf.spectrum.ui.BasePresenter;
import com.example.dali_bsf.spectrum.ui.BaseView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khalil on 25/01/2018.
 */

public interface ApplicationsContract {

    /**
     * Is the view part of the contract that offers methods to notifies the presenter of any changes
     */
    public interface ApplicationView extends BaseView<ApplicationsContract.ApplicationPresenter> {

        public void updateList(List<Application> applicationArrayList);


    }

    /**
     * Is the presenter part of the contract that offers methods to send data
     */
    public interface ApplicationPresenter extends BasePresenter {
        void updateApplication(Application application);

        void onBack();

        void homePressed();
    }
}
