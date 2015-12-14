package com.herethere.lnk.herethere;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Administrator on 2015-12-13
 */
public class MapFragment extends Fragment{

    private SupportMapFragment fragment;
    private GoogleMap mMap;

    static View v;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FragmentManager fm = getChildFragmentManager();
        fragment = (SupportMapFragment) fm.findFragmentById(R.id.map);
        if (fragment == null) {
            fragment = SupportMapFragment.newInstance();
            fm.beginTransaction().replace(R.id.map, fragment).commit();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        try {
            v = inflater.inflate(R.layout.map_fragment, container, false);
        } catch (InflateException e) {

        }
        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        if (mMap == null) {
            mMap = fragment.getMap();
            LatLng startingPoint = new LatLng(37.540705, 126.956764);


            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(startingPoint, 16));
        }
        if (mMap != null) {

        }
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
