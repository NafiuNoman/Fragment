package com.example.fragmenttry02_06_20;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    Context ctx;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment1, container, false);


        //not showing the UI if you return null
       // return null;

        Toast.makeText(ctx, "Frag1 going onCreateView", Toast.LENGTH_SHORT).show();


        return view;

    }

    // FIRST THE SYSTEM WILL CALL  1)onAttach -> 2)onCreate -> 3)onCreateView -> 4)onActivityCreated
    //                              5)onStart-> 6)onResume -> 7)onPause->
    //                              8)onStop -> 9)onDestroyView ->
    //                              10)onDestroy -> 11)onDetach
    // it will maintain this sequence because its SYSTEM CALL .

    // I didn't maintain the sequence to implement the method to show it will maintain by it self because its SYSTEM CALL

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(ctx, "From farg 1 -> going to STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toast.makeText(ctx, "From farg 1 onActivityCreated", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(ctx, "its going to RESUME", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(ctx, "farg 1 going to onDetach", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(ctx, "From frag 1-> going to PAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(ctx, "its going to START", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(ctx, "Frag1 going onCreate ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(ctx, "farg 1 going to onDestroyView", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(ctx, "farg 1 going to onDestroy", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onAttach(Context context) {

        ctx = context;
        super.onAttach(context);

        Toast.makeText(ctx, "farg 1 onAttach ", Toast.LENGTH_SHORT).show();



    }
}
