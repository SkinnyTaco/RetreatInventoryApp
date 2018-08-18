package com.maurdan.flaco.retreatinventoryapp.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.maurdan.flaco.retreatinventoryapp.Fragments.BFullerFragment;
import com.maurdan.flaco.retreatinventoryapp.Fragments.CamposFragment;
import com.maurdan.flaco.retreatinventoryapp.Fragments.PetesFragment;
import com.maurdan.flaco.retreatinventoryapp.R;

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
            case 2:
                return new CamposFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.petes_tab_name);
            case 1:
                return mContext.getString(R.string.bfuller_tab_name);
            case 2:
                return mContext.getString(R.string.campos_tab_name);
            default:
                return mContext.getString(R.string.unknown_vendor_tab_name);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
