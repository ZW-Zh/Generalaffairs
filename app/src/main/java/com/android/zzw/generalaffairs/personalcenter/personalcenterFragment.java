package com.android.zzw.generalaffairs.personalcenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.zzw.generalaffairs.R;

/**
 * Created by zzw on 2017/9/12.
 */

public class personalcenterFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.myinfo_fragment,container,false);
        return view;
    }
}
