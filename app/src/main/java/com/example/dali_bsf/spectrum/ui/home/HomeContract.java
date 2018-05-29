package com.example.dali_bsf.spectrum.ui.home;

import com.example.dali_bsf.spectrum.ui.BasePresenter;
import com.example.dali_bsf.spectrum.ui.BaseView;

/**
 * Created by dali-bsf on 15/01/18.
 */

public interface HomeContract {

    /**
     * Is the view part of the contract that offers methods to notifies the presenter of any changes
     */
    public interface  HomeView extends BaseView<HomeContract.HomePresenter>{

    }

    /**
     * Is the presenter part of the contract that offers methods to send data
     */
    public interface  HomePresenter extends BasePresenter { }
}
