package com.example.dali_bsf.spectrum.ui.menu;

/**
 * Created by dali-bsf on 26/01/18.
 */

public class MenuPresenter implements MenuContract.MenuPresenter{


    public MenuContract.MenuView menuView;



    public MenuPresenter(MenuContract.MenuView menuView) {
        this.menuView = menuView;
    }
    @Override
    public void start() {

    }
}
