package com.converter.indra.menuapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final CheckBox ch2=(CheckBox)findViewById(R.id.ch2);
        final CheckBox ch3=(CheckBox)findViewById(R.id.ch3);
        final CheckBox ch4=(CheckBox)findViewById(R.id.ch4);
        final CheckBox ch1=(CheckBox)findViewById(R.id.ch1);
        final Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="";
                if(ch1.isChecked())
                {
                    str+=ch1.getText()+"\n";
                }
                if(ch2.isChecked())
                {
                    str+=ch2.getText()+"\n";
                }
                if(ch3.isChecked())
                {
                    str+=ch3.getText()+"\n";
                }
                if(ch4.isChecked())
                {
                    str+=ch4.getText()+"\n";
                }
                Toast.makeText(Main4Activity.this,str,Toast.LENGTH_LONG).show();

            }
        });

    }
}
