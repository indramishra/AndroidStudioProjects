package com.converter.indra.moneyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ConverterActivity extends AppCompatActivity {
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Button b1=(Button)findViewById(R.id.dollar);
        final EditText e1=(EditText)findViewById(R.id.e1);
        Button b2=(Button)findViewById(R.id.euro);
        Button b3=(Button)findViewById(R.id.riyal);
        Button b4=(Button)findViewById(R.id.yen);
        ImageButton ib=(ImageButton)findViewById(R.id.ib1);
        e1.setEnabled(true);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i!=0)
                    e1.setText("$ "+(i*65));
                else {
                    i = Integer.parseInt(e1.getText().toString());
                    e1.setText("$ " + (i * 65));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i!=0)
                e1.setText("$ "+(i*80));
            else
                {
                    i=Integer.parseInt(e1.getText().toString());
                    e1.setText("$ "+(i*80));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i!=0)
                    e1.setText("$ "+(i*45));
                else {
                    i = Integer.parseInt(e1.getText().toString());
                    e1.setText("$ " + (i * 45));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i!=0)
                    e1.setText("$ "+(i*17));
                else {
                    i = Integer.parseInt(e1.getText().toString());
                    e1.setText("$ " + (i * 17));
                }
            }
            });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });
    }
}
