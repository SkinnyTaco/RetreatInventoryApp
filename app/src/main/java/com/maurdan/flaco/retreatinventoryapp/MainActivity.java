package com.maurdan.flaco.retreatinventoryapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maurdan.flaco.retreatinventoryapp.Adapters.ProductPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        ProductPagerAdapter productAdapter = new ProductPagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(productAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
