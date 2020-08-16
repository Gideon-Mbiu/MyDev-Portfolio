package com.example.mydevportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.mydevportfolio.controller.DevPagerAdapater;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.ViewPager_Id);
        viewPager.setAdapter(new DevPagerAdapater(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.TabLayout_Id);
        tabs.setupWithViewPager(viewPager);

        tabs.setTabTextColors(Color.GRAY, Color.WHITE);
    }
}
