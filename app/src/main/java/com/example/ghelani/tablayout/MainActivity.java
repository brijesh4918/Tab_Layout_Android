package com.example.ghelani.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager Viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout=(TabLayout)findViewById(R.id.tablayout);
        Viewpager=(ViewPager)findViewById(R.id.Viewpager);

        TabLayout.Tab tab=tablayout.newTab();
        tab.setText("First");
        tab.setIcon(R.mipmap.ic_launcher);
        tablayout.addTab(tab);
        TabLayout.Tab tab1=tablayout.newTab();
        tab1.setText("Second");
        tab1.setIcon(R.mipmap.ic_launcher_round);
        tablayout.addTab(tab1);
        TabLayout.Tab tab2=tablayout.newTab();
        tab2.setText("Third");
        tab2.setIcon(R.mipmap.ic_launcher);
        tablayout.addTab(tab2);

        MyAdapter myAdapter=new MyAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        Viewpager.setAdapter(myAdapter);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Viewpager.setCurrentItem(tablayout.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        Viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
    }
}
