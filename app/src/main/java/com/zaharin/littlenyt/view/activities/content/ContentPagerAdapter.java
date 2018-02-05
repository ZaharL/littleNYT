package com.zaharin.littlenyt.view.activities.content;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zaharin.littlenyt.view.fragments.contentList.ContentListFragment;

/**
 * Created by zah_arin on 2/5/18.
 */

public class ContentPagerAdapter extends FragmentPagerAdapter {

    public ContentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ContentListFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 3;
    }
}