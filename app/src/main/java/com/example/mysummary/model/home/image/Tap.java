package com.example.mysummary.model.home.image;

import androidx.fragment.app.Fragment;

public class Tap {
    String tabName;
    Fragment fragment;

    public Tap(String tabName, Fragment fragment) {
        this.tabName = tabName;
        this.fragment = fragment;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
