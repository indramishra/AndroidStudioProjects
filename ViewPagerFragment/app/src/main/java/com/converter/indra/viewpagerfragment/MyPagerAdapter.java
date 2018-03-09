package com.converter.indra.viewpagerfragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;

/**
 * Created by Think.pad on 2/8/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> frag=new ArrayList<>();
    ArrayList<String> title=new ArrayList<>();
    public void AddFragment(Fragment fragment, String tabtitle)
    {
        frag.add(fragment);
        title.add(tabtitle);
    }
    public MyPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return frag.get(position);
    }

    @Override
    public int getCount() {
        return frag.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
