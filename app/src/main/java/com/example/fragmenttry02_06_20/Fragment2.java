package com.example.fragmenttry02_06_20;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */



public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
         View view = layoutInflater.inflate(R.layout.fragment_fragment2, container, false);


         return view;

    }

}
