package com.example.android.catordog;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.catordog.GalerieFragment;
import com.example.android.catordog.KameraFragment;
import com.example.android.catordog.StatistikFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new GalerieFragment();
            case 1:
                return new KameraFragment();
            case 2:
                return new StatistikFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}