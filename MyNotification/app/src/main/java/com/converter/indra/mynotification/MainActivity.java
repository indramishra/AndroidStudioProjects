package com.converter.indra.mynotification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    String str="MyChannelID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      btn  =(Button) findViewById(R.id.button);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this);
              builder.setSmallIcon(R.drawable.ic_stat_name);
              builder.setContentTitle("ICSD");
              builder.setContentText("You have gotten a notification");
              Intent i=new Intent(MainActivity.this,Main2Activity.class);
              PendingIntent pi= PendingIntent.getActivity(MainActivity.this,3,i,0);
              builder.setContentIntent(pi);
              NotificationManager mger=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
              mger.notify(0,builder.build());

          }
      });

    }
}
