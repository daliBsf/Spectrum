package com.example.dali_bsf.spectrum.ui.home;

import com.example.dali_bsf.spectrum.ui.BasePresenter;
import com.example.dali_bsf.spectrum.ui.BaseView;

/**
 * Created by dali-bsf on 15/01/18.
 */

public interface HomeContract {
    public interface  HomeView extends BaseView<HomeContract.HomePresenter>{

    }
    public interface  HomePresenter extends BasePresenter { }
}
