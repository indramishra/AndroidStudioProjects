package com.example.thinkpad.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv=(TextView)findViewById(R.id.textView);
        Bundle bun=getIntent().getExtras();
        double d=bun.getDouble("d");
        tv.setText("The Division is"+" "+d);
        Button b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent my=new Intent(Settings.ACTION_SETTINGS);
                startActivity(my);
            }
        });
    }
}
