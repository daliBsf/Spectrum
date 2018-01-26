package com.example.dali_bsf.spectrum.ui.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.ui.ParentLayout.ParentActivity;
import com.github.clans.fab.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends Activity {
    @BindView(R.id.viewpager)
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }



}
