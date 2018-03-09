package com.converter.indra.myapplication5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 frag1=new Fragment1();
        Fragment2 frag2=new Fragment2();
        FragmentManager fm=getFragmentManager();

        FragmentTransaction transport=getSupportFragmentManager()
    }
}
