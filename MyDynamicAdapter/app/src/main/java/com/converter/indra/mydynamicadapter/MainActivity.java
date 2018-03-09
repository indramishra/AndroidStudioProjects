package com.converter.indra.mydynamicadapter;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

TabLayout tabLayout;
ViewPager viewPager;
MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       android.support.v7.widget.Toolbar toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        adapter=new MyAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Tab1(),"Register");
        adapter.AddFragment(new Tab2(),"ViewList");
        adapter.AddFragment(new Tab3(),"Blank");
        adapter.AddFragment(new Tab1(),"Register");
        adapter.AddFragment(new Tab2(),"ViewList");
        adapter.AddFragment(new Tab3(),"Blank");

        adapter.AddFragment(new Tab1(),"Register");
        adapter.AddFragment(new Tab2(),"ViewList");
        adapter.AddFragment(new Tab3(),"Blank");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
