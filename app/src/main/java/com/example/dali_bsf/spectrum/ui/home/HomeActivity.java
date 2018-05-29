package com.example.dali_bsf.spectrum.ui.home;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.Repostry.IParentRepository;
import com.example.dali_bsf.spectrum.ui.ParentLayout.ParentActivity;
import com.github.clans.fab.FloatingActionButton;

import java.util.logging.Logger;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.DaggerActivity;


public class HomeActivity extends DaggerActivity implements HomeContract.HomeView {
    @Inject
    HomeContract.HomePresenter presenter;
    @Inject
    IParentRepository parentRepository;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.control_parental)
    public void onParentFloatButton(FloatingActionButton parent)
    {
        Intent intent = new Intent(getApplicationContext(), ParentActivity.class);
        startActivity(intent);
    }


    @Override
    public void setPresenter(HomeContract.HomePresenter presenter) {

    }
}
