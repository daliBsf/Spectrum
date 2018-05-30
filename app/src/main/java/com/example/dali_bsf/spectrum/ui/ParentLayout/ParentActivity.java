package com.example.dali_bsf.spectrum.ui.ParentLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.ui.ApplicationsLayout.ApplicationsActivity;
import com.example.dali_bsf.spectrum.ui.Test.Test;
import com.example.dali_bsf.spectrum.ui.home.HomeActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.DaggerActivity;

public class ParentActivity extends DaggerActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.application_manage)
    public void manageApplication()
    {
        Intent intent =new Intent(getApplicationContext(), Test.class);
        Log.i("heyyyyyyyy","heyyyyyyyyyyyyyy");
        startActivity(intent);

    }
}
