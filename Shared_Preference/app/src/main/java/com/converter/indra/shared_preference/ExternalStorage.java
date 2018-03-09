package com.converter.indra.shared_preference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExternalStorage extends AppCompatActivity {
    EditText et;
    TextView tv;
    Button bt1,bt2;
    String str;
    File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_storage);
        et=(EditText)findViewById(R.id.et);
        tv=(TextView)findViewById(R.id.tv);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=et.getText().toString();
                if(str.length()>0) {
                    try {
                        file = new File(getExternalFilesDir("Mydir"), "ab.txt");
                        FileOutputStream fos = new FileOutputStream(file, true);
                        fos.write(str.getBytes());
                        fos.close();
                        Toast.makeText(ExternalStorage.this, "Submitted", Toast.LENGTH_LONG).show();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    FileInputStream fis=new FileInputStream(file);
                    int ch;
                    String str="";
                    while((ch=fis.read())!=-1)
                    {
                        str=str+String.valueOf((char)ch);
                    }
                    fis.close();
                    tv.setText(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
