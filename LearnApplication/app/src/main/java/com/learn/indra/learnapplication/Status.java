package com.learn.indra.learnapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Think.pad on 7/22/2017.
 */

public class Status {
   public static void display(Context context, String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
