package com.converter.indra.loginapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    MyDBHelper mdb;
    public void onLogin(View view)
    {
        EditText t1=(EditText)findViewById(R.id.le1);
        EditText t2=(EditText)findViewById(R.id.le2);
        EditText t3=(EditText)findViewById(R.id.le3);
        String name=t1.getText().toString();
        String mobile=t2.getText().toString();
        String email=t3.getText().toString();
        mdb=new MyDBHelper(this);
        if(name.equals(mdb.))
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
