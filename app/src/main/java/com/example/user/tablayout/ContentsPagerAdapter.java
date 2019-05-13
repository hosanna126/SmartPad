package com.example.user.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.user.tablayout.Fragment.CheckFragment;
import com.example.user.tablayout.Fragment.NumberFragment;
import com.example.user.tablayout.Fragment.PhotoFragment;


public class ContentsPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public ContentsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        this.mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                NumberFragment NumberFragment = new NumberFragment();
                return NumberFragment;

            case 1:
                CheckFragment CheckFragment = new CheckFragment();
                return CheckFragment;

            case 2:
                PhotoFragment PhotoFragment = new PhotoFragment();
                return PhotoFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}