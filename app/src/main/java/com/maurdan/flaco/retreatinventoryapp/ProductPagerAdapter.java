package com.maurdan.flaco.retreatinventoryapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ProductPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ProductPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PetesFragment();
            case 1:
                return new BFullerFragment();
            case 3:
                return new CamposFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
