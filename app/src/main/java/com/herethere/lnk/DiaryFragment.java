package com.herethere.lnk.herethere;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2015-12-13
 */
public class DiaryFragment extends Fragment {

    static View v;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        try {
            v = inflater.inflate(R.layout.diary_fragment, container, false);
        } catch (InflateException e) {

        }
        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(v!=null) {
            ViewGroup parent = (ViewGroup)v.getParent();
            if(parent!=null) {
                parent.removeView(v);
            }
        }
    }
}
