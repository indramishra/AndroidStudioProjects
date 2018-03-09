package com.converter.indra.adapter_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
//        String[] str=new String[]{"a","b","c","d"}*/
        char[] str=new char[26];
         final String[] s=new String[26];
        long asc=0;
        for(int i=0;i<26;i++)
        {
            str[i]=(char)(97+(asc++));
            s[i]=String.valueOf(str[i]);


        }
        ListView lv=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this, R.layout.mylayout,s);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(MainActivity.this, s[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
