package com.example.dali_bsf.spectrum.ui.Test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    public ApplicationAdapter(Context context, ArrayList<Application> applications )
    {
        this.applications=applications;
        this.inflater=LayoutInflater.from(context) ;

    }

    @Override
    public ApplicationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ApplicationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ApplicationAdapter.ViewHolder holder, int position) {
        holder.app_icon.setImageDrawable(applications.get(position).getIcon());
        holder.app_name.setText(applications.get(position).getName().toString());
    }

    @Override
    public int getItemCount() {
        return applications.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.app_icon) public ImageView app_icon;
        @BindView(R.id.app_name) public TextView app_name;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
