package com.example.fragmenttry02_06_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Button  btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btn1=findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment1 fragment1 = new Fragment1();
                FragmentManager fm = getSupportFragmentManager();
               // fm.beginTransaction().replace(R.id.holder,new Fragment1()).addToBackStack(null).commit();
                fm.beginTransaction().replace(R.id.holder,fragment1).disallowAddToBackStack().commit();

            }
        }
        );




        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment2  fragment2 = new Fragment2();
                FragmentManager fm = getSupportFragmentManager();
               // fm.beginTransaction().replace(R.id.holder,new Fragment2()).addToBackStack(null).commit();
                fm.beginTransaction().replace(R.id.holder,fragment2).disallowAddToBackStack().commit();
                                    }
                                }
        );


    }


}
