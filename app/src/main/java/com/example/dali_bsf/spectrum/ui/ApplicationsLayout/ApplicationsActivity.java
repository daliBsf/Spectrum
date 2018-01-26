package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.Repostry.IApplicationRepository;
import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.DaggerActivity;
import butterknife.BindView;

/**
 * Created by khalil on 25/01/2018.
 */

public class ApplicationsActivity extends DaggerActivity implements ApplicationsContract.ApplicationView {

    @Inject
    ApplicationsContract.ApplicationPresenter presenter;

    @Inject
    IApplicationRepository applicationRepository;

    @BindView(R.id.rv)
    RecyclerView rv ;

    ApplicationAdapter mAdapter;
    ArrayList<Application> apps ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ButterKnife.bind(this);
        apps =new ArrayList<Application>();

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        mAdapter = new ApplicationAdapter(this,apps);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);

    }

    public void setPresenter(ApplicationsContract.ApplicationPresenter presenter) {
        this.presenter = presenter;
    }
}
