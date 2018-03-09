package com.converter.indra.shared_preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.LauncherActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    SharedPreferences setting;
    Button save,remove,clear,get;
    String s1,s2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setting=getSharedPreferences("Login", Context.MODE_PRIVATE);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        save=(Button)findViewById(R.id.bt1);
        remove=(Button)findViewById(R.id.bt2);
        clear=(Button)findViewById(R.id.bt3);
        get=(Button)findViewById(R.id.bt4);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor=setting.edit();
                editor.putString("user",et1.getText().toString());
                editor.putString("pass",et2.getText().toString());
                editor.apply();
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();

            }
        });
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=setting.edit();
                editor.remove("user");
                editor.apply();
                Toast.makeText(MainActivity.this,"Removed",Toast.LENGTH_LONG).show();

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=setting.edit();
                editor.clear();
                editor.apply();
                Toast.makeText(MainActivity.this,"Clear",Toast.LENGTH_LONG).show();
            }
        });
       /* get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {*/
                 s1=setting.getString("user","");
                s2=setting.getString("pass","");
               // Toast.makeText(MainActivity.this,s1+""+s2,Toast.LENGTH_LONG).show();
                try {
                    if(s1.length()>0&&s2.length()>0) {
                        //this.finish();

                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                   //* intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    //*
                        startActivity(intent);
                    }
               } catch (Exception e) {
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }
           // }
       // });

       // try {

         /*   }
        } catch (Exception e) {
            Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
        }*/


    }
}
