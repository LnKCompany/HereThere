package com.herethere.lnk.herethere;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Administrator on 2015-12-13.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    Fragment[] fragments = new Fragment[3];

    public ViewPagerAdapter(FragmentManager fManager) {
        super(fManager);
        fragments[0] = new MapFragment();
        fragments[1] = new DiaryFragment();
        fragments[2] = new SettingFragment();
    }

    //몇번째 프레그먼트
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    //보여질 프레그먼트가 몇개
    @Override
    public int getCount() {
        return fragments.length;
    }
}
