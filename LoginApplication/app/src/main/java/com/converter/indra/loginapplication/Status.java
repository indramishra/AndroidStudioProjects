package com.converter.indra.loginapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Think.pad on 7/15/2017.
 */

public  class Status {
    public static void show(Context context,String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
