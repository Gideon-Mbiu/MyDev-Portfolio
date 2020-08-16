package com.example.mydevportfolio.controller;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mydevportfolio.views.AboutFragment;
import com.example.mydevportfolio.views.ContactFragment;
import com.example.mydevportfolio.views.SkillsFragment;
import com.example.mydevportfolio.views.WorkFragment;

public class DevPagerAdapater extends FragmentPagerAdapter {
    public DevPagerAdapater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return super.getPageTitle(position);
    }
}
