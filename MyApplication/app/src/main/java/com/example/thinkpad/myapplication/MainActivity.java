package com.example.thinkpad.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText t1=(EditText)findViewById(R.id.editText);
        final EditText t2=(EditText)findViewById(R.id.editText2);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try{
                    double n1=Double.parseDouble(t1.getText().toString());
                    double n2=Double.parseDouble(t2.getText().toString());
                    double div=n1/n2;
                    Intent nt=new Intent(MainActivity.this,Main2Activity.class);
                    nt.putExtra("num1",t1.getText());
                    nt.putExtra("num2",t2.getText());
                    nt.putExtra("d",div);
                    startActivity(nt);
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
