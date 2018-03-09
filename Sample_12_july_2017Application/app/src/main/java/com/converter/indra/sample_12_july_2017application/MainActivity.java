package com.converter.indra.sample_12_july_2017application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    public void Onshow(View view)
    {
      l1  =(LinearLayout)findViewById(R.id.ll1);
        l1.setVisibility(View.VISIBLE);
    }
    public void Onhide(View view)
    {
        l2=(LinearLayout)findViewById(R.id.ll1);
        l2.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
