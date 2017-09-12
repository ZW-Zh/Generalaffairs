package com.android.zzw.generalaffairs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.zzw.generalaffairs.Adapter.InfoAdapter;
import com.android.zzw.generalaffairs.Bean.mainRecyclerview;
import com.android.zzw.generalaffairs.view.ButtonView;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;
import cn.bingoogolapple.bgabanner.BGABannerUtil;

/**
 * Created by zzw on 2017/9/10.
 */

public class homepageFragment extends Fragment {
    private BGABanner mBanner;
    private RecyclerView recyclerView;
    private List<mainRecyclerview> list=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.homepage_fragment,container,false);
        setBannerView(view);
        setToolbar(view);
        setButtonView(view);
        setRecyclerview(view);
        return view;
    }
    private void setToolbar(View v){
        Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        toolbar.setTitle("");
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

    }
    private void setBannerView(View v){
        mBanner = (BGABanner) v.findViewById(R.id.banner_guide_content);
        List<View> views = new ArrayList<>();
        views.add(BGABannerUtil.getItemImageView(getActivity(), R.drawable.banner2));
        views.add(BGABannerUtil.getItemImageView(getActivity(), R.drawable.banner3));
        views.add(BGABannerUtil.getItemImageView(getActivity(), R.drawable.banner1));
        mBanner.setData(views);
    }
    private void setButtonView(View v){
        ButtonView buttonView1= (ButtonView) v.findViewById(R.id.btn1);
        ButtonView buttonView2= (ButtonView) v.findViewById(R.id.btn2);
        ButtonView buttonView3= (ButtonView) v.findViewById(R.id.btn3);
        ButtonView buttonView4= (ButtonView) v.findViewById(R.id.btn4);
        ButtonView buttonView5= (ButtonView) v.findViewById(R.id.btn5);
        ButtonView buttonView6= (ButtonView) v.findViewById(R.id.btn6);
        ButtonView buttonView7= (ButtonView) v.findViewById(R.id.btn7);
        ButtonView buttonView8= (ButtonView) v.findViewById(R.id.btn8);
        buttonView1.setRoundImg(R.drawable.button);
        buttonView2.setRoundImg(R.drawable.button);
        buttonView3.setRoundImg(R.drawable.button);
        buttonView4.setRoundImg(R.drawable.button);
        buttonView5.setRoundImg(R.drawable.button);
        buttonView6.setRoundImg(R.drawable.button);
        buttonView7.setRoundImg(R.drawable.button);
        buttonView8.setRoundImg(R.drawable.button);
        buttonView1.setTextView("班车查询");
        buttonView2.setTextView("自习室查询");
        buttonView3.setTextView("校历查询");
        buttonView4.setTextView("邮单查询");
        buttonView5.setTextView("电话查询");
        buttonView6.setTextView("总务要闻");
        buttonView7.setTextView("总务通知");
        buttonView8.setTextView("学校官网");
    }
    private void setRecyclerview(View v){
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        mainRecyclerview a = new mainRecyclerview("2017-09-10 周日下午11：47",R.drawable.banner2);
        list.add(a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        InfoAdapter infoAdapter = new InfoAdapter(getContext(),list);
        recyclerView.setAdapter(infoAdapter);
    }
}
