package com.example.dali_bsf.spectrum.ui.Test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by khalil on 25/01/2018.
 */

public class ApplicationAdapter extends RecyclerView.Adapter<ApplicationAdapter.ViewHolder>{

    ArrayList<Application> applications;
    LayoutInflater inflater;
    ApplicationsContract.ApplicationPresenter presenter;

    public ApplicationAdapter(Context context, ArrayList<Application> applications,ApplicationsContract.ApplicationPresenter presenter )
    {
        this.applications=applications;
        this.inflater=LayoutInflater.from(context) ;
        this.presenter = presenter;

    }

    @Override
    public ApplicationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ApplicationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ApplicationAdapter.ViewHolder holder, final int position) {
        holder.app_icon.setImageDrawable(applications.get(position).getIcon());
        holder.app_name.setText(applications.get(position).getName().toString());
        holder.app_cb.setChecked(applications.get(position).isAuthorized());
        holder.app_cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    applications.get(position).setAuthorized(b);
                    presenter.updateApp(applications.get(position));

            }
        });
    }

    @Override
    public int getItemCount() {
        return applications.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.app_icon) public ImageView app_icon;
        @BindView(R.id.app_name) public TextView app_name;
        @BindView(R.id.checkBox) public CheckBox app_cb;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
