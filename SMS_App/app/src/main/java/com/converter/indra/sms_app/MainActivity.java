package com.converter.indra.sms_app;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        Button btn=(Button)findViewById(R.id.send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String con=et1.getText().toString();
                String body=et2.getText().toString();

                try {
                    Intent sms=new Intent(Settings.ACTION_WIFI_SETTINGS);
                    startActivity(sms);
                    /*sms.setData(Uri.parse("sms:"));
                    sms.setType("vnd.android-dir/mms-sms");
                    sms.putExtra("address",con);
                    sms.putExtra("sms-body",body);
                    Intent.createChooser(sms,"Typed sms sent");*/
                   /* ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.SEND_SMS},1);
                    SmsManager.getDefault().sendTextMessage(con,null,"Hi",null,null);*/

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
