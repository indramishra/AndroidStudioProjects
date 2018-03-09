package com.converter.indra.shared_preference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.EditText;

public class MyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_details);
        EditText et=(EditText)findViewById(R.id.editText);
        Linkify.addLinks(et,Linkify.ALL);
    }
}
