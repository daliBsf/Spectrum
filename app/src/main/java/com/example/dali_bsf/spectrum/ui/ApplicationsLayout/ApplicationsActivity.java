package com.example.dali_bsf.spectrum.ui.ApplicationsLayout;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.Repostry.IApplicationRepository;
import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.DaggerActivity;
import butterknife.BindView;

/**
 * Created by khalil on 25/01/2018.
 */

public class ApplicationsActivity extends DaggerActivity implements ApplicationsContract.ApplicationView {

    @Inject
    public ApplicationsContract.ApplicationPresenter presenter;

    @Inject
    public IApplicationRepository applicationRepository;

    @BindView(R.id.rv)
    public RecyclerView rv ;

    ApplicationAdapter mAdapter;
    ArrayList<Application> apps ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applications);
        ButterKnife.bind(this);
        apps =new ArrayList<>();
        mAdapter = new ApplicationAdapter(this,apps);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);
        Log.i("MSG","onCreate Executed ");

        presenter.prepareMovieData();

    }

    public void setPresenter(ApplicationsContract.ApplicationPresenter presenter) {
        this.presenter = presenter;
    }
    public void updateList(List<Application> applicationArrayList)
    {
        this.apps.addAll(apps.size(),applicationArrayList);
        Log.i("SIZE",""+apps.size());
        this.mAdapter.notifyDataSetChanged();
    }
}
