package com.converter.indra.adapter_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import static com.converter.indra.adapter_application.R.id.parent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        char[] str=new char[26];
        final String[] s=new String[26];
        long asc=0;

        for(int i=0;i<26;i++)
        {
            str[i]=(char)(97+(asc++));
            s[i]=String.valueOf(str[i]);


        }
        Spinner lv=(Spinner)findViewById(R.id.sp);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this, R.layout.mylayout,s);
        lv.setAdapter(myAdapter);

        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this, s[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

       /* }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

          /@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }*/
        });
    }
}

