package com.example.dali_bsf.spectrum.ui;

/**
 * Created by dali-bsf on 13/01/18.
 */

public interface BaseView<T extends BasePresenter> {
    public void setPresenter(T presenter);
}
