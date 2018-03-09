package com.converter.indra.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    MyDBHelper mdb;
    public void onRegister(View view)
    {
        EditText t1=(EditText)findViewById(R.id.e1);
        EditText t2=(EditText)findViewById(R.id.e2);
        EditText t3=(EditText)findViewById(R.id.e3);
        EditText t4=(EditText)findViewById(R.id.e4);
        String name=t1.getText().toString();
        String dob=t2.getText().toString();
        String email=t3.getText().toString();
        String mobile=t4.getText().toString();
        mdb=new MyDBHelper(this);
        long res=mdb.insertData(name,dob,mobile,email);
        if(res<0)
            Status.show(this,"Unsuccessful Registration");
        else
        {
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
