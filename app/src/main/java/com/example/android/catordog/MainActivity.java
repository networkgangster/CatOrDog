package com.example.android.catordog;

import android.support.design.widget.TabItem;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        Tablayout tabLayout = findViewById(R.id.tablayout);
        TabItem tabChats = findViewById(R.id.tabGalerie);
        TabItem tabStatus = findViewById(R.id.tabKamera);
        TabItem tabCalls = findViewById(R.id.tabStatistik);
        ViewPager viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(pageAdapter);
    }
}
