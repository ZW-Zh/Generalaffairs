package com.android.zzw.generalaffairs.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.android.zzw.generalaffairs.R;

/**
 * Created by zzw on 2017/9/12.
 */

public class servicefragment extends Fragment {
    private ImageButton repair;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.service_fragment,container,false);

        setToolbar(v);
        return v;
    }
    private void setToolbar(View v){
        repair = (ImageButton) v.findViewById(R.id.repairs);
        Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        toolbar.setTitle("");

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        repair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),repairActivity.class);
                startActivity(intent);
            }
        });
    }
}
