package com.example.dali_bsf.spectrum.ui.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dali_bsf.spectrum.R;
import com.example.dali_bsf.spectrum.data.model.Application;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dali-bsf on 16/01/18.
 */

public class HomeGridViewAdapter extends RecyclerView.Adapter<HomeGridViewAdapter.ViewHolder> {
    ArrayList<Application> applications;
    LayoutInflater inflater;

    public HomeGridViewAdapter(Context context, ArrayList<Application> applications )
    {
        this.applications=applications;
        this.inflater=LayoutInflater.from(context) ;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View  view = inflater.inflate(R.layout.home_grid_item,parent);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setApp_name(applications.get(position).getName());
        holder.setApp_icon(applications.get(position).getIcon());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.app_icon) private  ImageView app_icon;
        @BindView(R.id.app_name) private TextView app_name;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }

        public void setApp_name(String app_name) {
            this.app_name.setText( app_name) ;
        }
        public String getApp_name() {
            return app_name.getText().toString();
        }

        public void setApp_icon(int app_icon) {
            this.app_icon.setImageResource(app_icon);
        }
    }
}
