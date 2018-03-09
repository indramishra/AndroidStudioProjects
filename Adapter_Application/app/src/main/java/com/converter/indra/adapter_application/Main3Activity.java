package com.converter.indra.adapter_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String[] name={"A","B","C","D","e"};
        String[] contact={"12","23","34","45","56"};
        int[] img={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
        ListView ls=(ListView)findViewById(R.id.lv);
        MyBaseAdapter adapter=new MyBaseAdapter(name,contact,img,this);
        ls.setAdapter(adapter);
    }
}
