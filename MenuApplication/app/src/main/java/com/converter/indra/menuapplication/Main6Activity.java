package com.converter.indra.menuapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        AutoCompleteTextView act=(AutoCompleteTextView)findViewById(R.id.ac1);
        MultiAutoCompleteTextView mact=(MultiAutoCompleteTextView)findViewById(R.id.ac2);
        String cities[]={"Allahabad","Varanasi","Lucknow","Mumbai"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,cities);
        act.setAdapter(adapter);
        mact.setAdapter(adapter);
        mact.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        act.setThreshold(1);
        mact.setThreshold(1);
    }
}
