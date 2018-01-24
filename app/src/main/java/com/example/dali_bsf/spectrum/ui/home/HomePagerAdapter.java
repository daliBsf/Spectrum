package com.example.dali_bsf.spectrum.ui.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by dali-bsf on 16/01/18.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {
    ArrayList<GridFragment> fragments;

    public HomePagerAdapter(FragmentManager fm, ArrayList<GridFragment> fragments) {
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
