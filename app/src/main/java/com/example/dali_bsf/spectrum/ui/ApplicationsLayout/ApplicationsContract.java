package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import com.example.dali_bsf.spectrum.ui.BasePresenter;
import com.example.dali_bsf.spectrum.ui.BaseView;

/**
 * Created by khalil on 25/01/2018.
 */

public interface ApplicationsContract {

    /**
     * Is the view part of the contract that offers methods to notifies the presenter of any changes
     */
    public interface ApplicationView extends BaseView<ApplicationsContract.ApplicationPresenter>{}

    /**
     * Is the presenter part of the contract that offers methods to send data
     */
    public interface ApplicationPresenter extends BasePresenter {
        public void prepareMovieData();
    }
}
