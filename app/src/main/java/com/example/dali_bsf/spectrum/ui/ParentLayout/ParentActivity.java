package com.example.dali_bsf.spectrum.ui.ParentLayout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.ui.ApplicationsLayout.ApplicationsActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.DaggerActivity;

public class ParentActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.application_manage)
    public void manageApplication()
    {
        Intent intent =new Intent(getApplicationContext(), ApplicationsActivity.class);
        startActivity(intent);

    }
}
