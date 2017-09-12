package com.android.zzw.generalaffairs;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.zzw.generalaffairs.Adapter.AdapterFragment;
import com.android.zzw.generalaffairs.personalcenter.personalcenterFragment;
import com.android.zzw.generalaffairs.service.servicefragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private LinearLayout homepage,service,myinfo;
    private ImageView ivhomepage,ivservice,ivinfo;
    private ArrayList<Fragment> fragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        initview();
    }
    private void initview(){
        homepage= (LinearLayout) findViewById(R.id.homepage);
        service= (LinearLayout) findViewById(R.id.service);
        myinfo = (LinearLayout) findViewById(R.id.myinfo);
        ivhomepage= (ImageView) findViewById(R.id.ivHomepage);
        ivinfo = (ImageView) findViewById(R.id.ivMyinfo);
        ivservice = (ImageView) findViewById(R.id.ivservice);
        homepageFragment homepageFragment = new homepageFragment();
        servicefragment servicefragment = new servicefragment();
        personalcenterFragment personalcenterFragment=new personalcenterFragment();
        fragments.add(homepageFragment);
        fragments.add(servicefragment);
        fragments.add(personalcenterFragment);
        ivhomepage.setImageResource(R.drawable.homepagepressed);
        homepage.setOnClickListener(this);
        service.setOnClickListener(this);
        myinfo.setOnClickListener(this);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                changeTab(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
        viewPager.setOffscreenPageLimit(2); //设置向左和向右都缓存limit个页面
        AdapterFragment adapter = new AdapterFragment(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);

    }
    @Override
    public void onClick(View v) {
        changeTab(v.getId());
    }
    private void changeTab(int id) {

        switch (id) {
            case R.id.homepage:
                viewPager.setCurrentItem(0);
                ivhomepage.setImageResource(R.drawable.homepagepressed);
                ivservice.setImageResource(R.drawable.service);
                ivinfo.setImageResource(R.drawable.myinfo);
                break;
            case 0:
                ivhomepage.setImageResource(R.drawable.homepagepressed);
                ivservice.setImageResource(R.drawable.service);
                ivinfo.setImageResource(R.drawable.myinfo);
                break;
            case R.id.service:
                viewPager.setCurrentItem(1);
                ivhomepage.setImageResource(R.drawable.homepage);
                ivservice.setImageResource(R.drawable.servicepressed);
                ivinfo.setImageResource(R.drawable.myinfo);
                break;
            case 1:
                ivhomepage.setImageResource(R.drawable.homepage);
                ivservice.setImageResource(R.drawable.servicepressed);
                ivinfo.setImageResource(R.drawable.myinfo);
                break;
            case R.id.myinfo:
                viewPager.setCurrentItem(2);
                ivhomepage.setImageResource(R.drawable.homepage);
                ivservice.setImageResource(R.drawable.service);
                ivinfo.setImageResource(R.drawable.myinfopressed);
                break;
            case 2:
                ivhomepage.setImageResource(R.drawable.homepage);
                ivservice.setImageResource(R.drawable.service);
                ivinfo.setImageResource(R.drawable.myinfopressed);
                break;
            default:
                break;
        }
    }
}



