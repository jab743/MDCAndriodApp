package com.example.welook.mdcandriodapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.welook.mdcandriodapp.R;

/**
 * Created by Welook on 10/31/2015.
 */
public class DashboadFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_dashboard, container,false);
        return rootview;
    }
}
