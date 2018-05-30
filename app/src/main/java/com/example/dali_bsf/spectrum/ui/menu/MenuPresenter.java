package com.example.dali_bsf.spectrum.ui.menu;

import android.os.Bundle;

import javax.annotation.Nullable;

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

    @Override
    public void create(@Nullable Bundle bundle) {

    }
}
