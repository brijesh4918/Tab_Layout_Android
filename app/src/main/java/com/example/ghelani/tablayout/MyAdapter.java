package com.example.ghelani.tablayout;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager supportFragmentManager,int tabCount) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BlankFragment();
            case 1:
                return new BlankFragment2();
            case 2:
                return new BlankFragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
