package com.converter.indra.shared_preference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {
    EditText et1;
    TextView tv1;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1=(EditText)findViewById(R.id.et1);
        tv1=(TextView)findViewById(R.id.tv1);
        Button btn=(Button)findViewById(R.id.btn);
        Button btn1=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=et1.getText().toString();

                try {
                    FileOutputStream fos=openFileOutput("Icsd.txt",MODE_PRIVATE);

                    fos.write(s.getBytes());
                    fos.close();
                    Toast.makeText(Main2Activity.this,"Submitted",Toast.LENGTH_LONG).show();
                } catch (FileNotFoundException e) {
                    Toast.makeText(Main2Activity.this,e.toString(),Toast.LENGTH_LONG).show();
                }
                catch(IOException i)
                {
                    Toast.makeText(Main2Activity.this,i.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    FileInputStream fis=openFileInput("Icsd.txt");
                    int ch;
                    String str="";
                    while((ch=fis.read())!=-1)
                    {
                        str=str+String.valueOf((char)ch);
                    }
                    fis.close();
                    tv1.setText(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
