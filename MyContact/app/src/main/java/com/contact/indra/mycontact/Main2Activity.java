package com.contact.indra.mycontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void reset(View view){


        EditText t1=(EditText)findViewById(R.id.e21);
        EditText t2=(EditText)findViewById(R.id.e22);
        EditText t3=(EditText)findViewById(R.id.e23);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t1.requestFocus();
    }
}
