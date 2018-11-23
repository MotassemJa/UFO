package com.github.motassemja.ufo.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.motassemja.ufo.R;

import androidx.fragment.app.Fragment;

/**
 * Name: DashboardFragment
 * Autor: moja
 * Datum: 08.11.2018
 */
public class DashboardFragment extends Fragment {

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_dashboard, container, false);
    }
}
