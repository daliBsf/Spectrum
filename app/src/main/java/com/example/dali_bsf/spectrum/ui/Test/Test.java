package com.example.dali_bsf.spectrum.ui.Test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.Repostry.IApplicationRepository;
import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.DaggerActivity;

public class Test extends DaggerActivity implements  ApplicationsContract.ApplicationView {

    @Inject
    public com.example.dali_bsf.spectrum.ui.Test.ApplicationsContract.ApplicationPresenter presenter;

    @Inject
    public IApplicationRepository applicationRepository;

    @BindView(R.id.rv)
    public RecyclerView rv ;

    ApplicationAdapter mAdapter;
    ArrayList<Application> apps ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        Log.i("MSG","onCreate Executed ");
        apps =new ArrayList<>();
        mAdapter = new ApplicationAdapter(this,apps);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);

        presenter.prepareMovieData();
    }

    @Override
    public void updateList(List<Application> applicationArrayList) {
        this.apps.addAll(apps.size(),applicationArrayList);
        Log.i("SIZE",""+apps.size());
        this.mAdapter.notifyDataSetChanged();
    }

    @Override
    public void setPresenter(ApplicationsContract.ApplicationPresenter presenter) {
        this.presenter=presenter;
    }
}
