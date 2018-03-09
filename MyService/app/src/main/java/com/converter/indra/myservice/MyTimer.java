package com.converter.indra.myservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Think.pad on 9/8/2017.
 */

public class MyTimer extends Service {
    MediaPlayer   player;
    class Media implements Runnable
    {

        @Override
        public void run()
        {
            player=MediaPlayer.create(MyTimer.this,R.raw.n);
            player.setLooping(true);
            player.start();

        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent,  int flags, int startId) {
        Toast.makeText(this,"started",Toast.LENGTH_LONG).show();
       Thread t=new Thread(new Media());
        t.start();


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"stopped",Toast.LENGTH_LONG).show();
        player.stop();
        super.onDestroy();
    }
}
