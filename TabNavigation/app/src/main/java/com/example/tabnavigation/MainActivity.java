package com.example.tabnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    TabLayout tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.pager);
        vp.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tl = findViewById(R.id.tab);
        tl.setupWithViewPager(vp);
    }
    class TabAdapter extends FragmentPagerAdapter{

        public TabAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch(position){
                case 0:
                    return new Chats();
                case 1:
                    return new Status();
                case 2:
                    return new Calls();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
        public CharSequence getPageTitle(int position){
            switch(position){
                case 0:
                    return "Chats";
                case 1:
                    return "Status";
                case 2:
                    return "Calls";
            }

            return null;
        }
    }

}