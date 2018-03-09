package com.converter.indra.emailapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.converter.indra.emailapp.R.id.btn;

public class MainActivity extends AppCompatActivity {
    String email_from,email_sub,email_body;
    String[] email_to={"","","",""};
    String[] email_cc={"","","",""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final  EditText from=(EditText)findViewById(R.id.et1);
        final  EditText to=(EditText)findViewById(R.id.et2);
        final EditText cc=(EditText)findViewById(R.id.et3);
        final EditText sub=(EditText)findViewById(R.id.et4);
        final EditText body=(EditText)findViewById(R.id.et5);
        Button send=(Button)findViewById(btn);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email_from= from.getText().toString();
                for(int i=0;i<4;i++) {
                    email_to[i] = to.getText().toString();
                }
                for(int i=0;i<4;i++) {
                    email_cc[i] = cc.getText().toString();
                }
                email_sub= sub.getText().toString();
                email_body= body.getText().toString();
                Intent email=new Intent();
                email.setAction(Intent.ACTION_SEND);
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL,email_to);
                email.putExtra(Intent.EXTRA_CC,email_cc);
                email.putExtra(Intent.EXTRA_SUBJECT,email_sub);
                email.putExtra(Intent.EXTRA_TEXT,email_body);
                startActivity(email);

            }
        });
    }
}
