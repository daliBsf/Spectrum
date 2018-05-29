package com.example.dali_bsf.spectrum.ui.ParentLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dali_bsf.spectrum.R;

import butterknife.ButterKnife;

public class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        ButterKnife.bind(this);
    }
}
