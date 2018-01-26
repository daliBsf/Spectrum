package com.example.dali_bsf.spectrum.ui.menu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dali_bsf.spectrum.ui.menu.GridFragment;

import java.util.ArrayList;

/**
 * Created by dali-bsf on 16/01/18.
 */

public class MenuPagerAdapter extends FragmentPagerAdapter {
    ArrayList<GridFragment> fragments;

    public MenuPagerAdapter(FragmentManager fm, ArrayList<GridFragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
