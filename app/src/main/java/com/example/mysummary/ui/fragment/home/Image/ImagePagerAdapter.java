package com.example.mysummary.ui.fragment.home.Image;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.mysummary.model.home.image.Tap;
import com.example.mysummary.ui.fragment.home.OnHomeClickListener;

import java.util.ArrayList;
import java.util.List;

public class ImagePagerAdapter extends FragmentStatePagerAdapter {
    private List<Tap> tapList ;

    public ImagePagerAdapter(FragmentManager fm, List<Tap> list) {
        super(fm);
        this.tapList = list;
    }


    public List<Tap> getTapList() {
        return tapList;
    }

    public void setTapList(List<Tap> tapList) {
        this.tapList = tapList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tapList.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tapList.get(position).getTabName();
    }

    @Override
    public int getCount() {
        return tapList.size();
    }
}
