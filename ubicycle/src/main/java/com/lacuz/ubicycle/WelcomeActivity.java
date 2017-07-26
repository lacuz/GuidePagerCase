package com.lacuz.ubicycle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {
    ViewPager viewPager;

    private List<View> listView = new ArrayList();
    private WelcomePagerAdapter mAdapter;
    private ImageView ivPoint1;
    private ImageView ivPoint2;
    private ImageView ivPoint3;


    private void pagerSelected(int paramInt) {
        this.ivPoint3.setVisibility(View.GONE);
        this.ivPoint2.setBackgroundResource(R.mipmap.welcome_point);
        this.ivPoint1.setBackgroundResource(R.mipmap.welcome_point);
        if (paramInt == 0)
            this.ivPoint1.setBackgroundResource(R.mipmap.welcome_point_press);
        while (paramInt != 1)
            return;
        this.ivPoint2.setBackgroundResource(R.mipmap.welcome_point_press);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        viewPager = findViewById(R.id.viewpager_welcome);
        this.ivPoint1 = ((ImageView) findViewById(R.id.iv_welcome_point_one));
        this.ivPoint2 = ((ImageView) findViewById(R.id.iv_welcome_point_two));
        this.ivPoint3 = ((ImageView) findViewById(R.id.iv_welcome_point_three));
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int paramAnonymousInt) {
            }

            public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2) {
                pagerSelected(paramAnonymousInt1);
            }

            public void onPageSelected(int paramAnonymousInt) {
            }
        });
        getLayoutInflater();
        LayoutInflater localLayoutInflater = LayoutInflater.from(this);
        this.listView.add(localLayoutInflater.inflate(R.layout.welcome_page_two, null));
        this.listView.add(localLayoutInflater.inflate(R.layout.welcome_page_three, null));
        this.mAdapter = new WelcomePagerAdapter(this.listView);
        this.viewPager.setAdapter(this.mAdapter);
    }

    public void welcome_in(View paramView) {

    }

}
