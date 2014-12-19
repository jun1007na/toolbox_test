package com.junya.toolboxtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

        public MyFragmentStatePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            switch(i){
                case 0:
                    return new Fragment1();
                default:
                    return new Fragment2();
                //天気予報つける？
            }

        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Tab 1";
                default:
                    return "Tab 2";
            }
        }

    }