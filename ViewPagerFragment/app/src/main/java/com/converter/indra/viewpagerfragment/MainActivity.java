package com.converter.indra.viewpagerfragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {
   TabLayout  tab;
    ViewPager viewPager;
    MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=(TabLayout)findViewById(R.id.tablayout);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        mAdapter=new MyPagerAdapter(getSupportFragmentManager());
        mAdapter.AddFragment(new Tab1(),"Captain_America");
        mAdapter.AddFragment(new Tab2(),"Hulk");
        mAdapter.AddFragment(new Tab3(),"Hawk_Eye");
        mAdapter.AddFragment(new Tab4(),"Iron_Man");
        viewPager.setAdapter(mAdapter);
        tab.setupWithViewPager(viewPager);
    }
}
