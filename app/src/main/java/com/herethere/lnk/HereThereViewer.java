package com.herethere.lnk.herethere;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HereThereViewer extends FragmentActivity implements View.OnClickListener{

    Button btn[] = new Button[3];
    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herethere_viewer);

        //viewPager
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        btn[0] = (Button)findViewById(R.id.btn_map);
        btn[1] = (Button)findViewById(R.id.btn_diary);
        btn[2] = (Button)findViewById(R.id.btn_setting);

        for(int i = 0 ; i < btn.length ; i++) {
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_map:
                viewPager.setCurrentItem(0);
                Toast.makeText(this, "맵 버튼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_diary:
                viewPager.setCurrentItem(1);
                Toast.makeText(this, "다이어리 버튼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_setting:
                viewPager.setCurrentItem(2);
                Toast.makeText(this, "설정 버튼", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
