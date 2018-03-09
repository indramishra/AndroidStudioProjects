package com.converter.indra.inflater_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl);
        LinearLayout ll=(LinearLayout)findViewById(R.id.ll);
        LayoutInflater inflater=getLayoutInflater();
        View v=inflater.inflate(R.layout.design_main,rl);
        View v1=inflater.inflate(R.layout.my_button,ll);
       // ll.addView(v);
    }
}
