package com.example.dali_bsf.spectrum.ui.menu;

import com.example.dali_bsf.spectrum.ui.BasePresenter;
import com.example.dali_bsf.spectrum.ui.BaseView;
import com.example.dali_bsf.spectrum.ui.home.HomeContract;

/**
 * Created by dali-bsf on 26/01/18.
 */

public class MenuContract {
    public interface  MenuView extends BaseView<MenuContract.MenuPresenter> {

    }
    public interface  MenuPresenter extends BasePresenter { }
}
