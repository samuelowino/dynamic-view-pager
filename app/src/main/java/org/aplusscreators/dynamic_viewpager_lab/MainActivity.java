package org.aplusscreators.dynamic_viewpager_lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    ViewPagerAdapter pagerAdapter;
    List<View> views = new ArrayList<>();

    LinearLayout pagerViewOne;
    LinearLayout pagerViewTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        pagerViewOne = findViewById(R.id.pager_view_one);
        pagerViewTwo = findViewById(R.id.pager_view_two);

        tabLayout.setupWithViewPager(viewPager);

        pagerViewTwo.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        views.add(0,pagerViewOne);
        views.add(1,pagerViewTwo);

        pagerAdapter = new ViewPagerAdapter(views,MainActivity.this);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }
}
