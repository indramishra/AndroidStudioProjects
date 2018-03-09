package com.learn.indra.learnapplication;

import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * Created by Think.pad on 7/24/2017.
 */

public class NaN {
    Context context;
    public  String NotNull(String str,Context context)
    {

        this.context=context;
        if(str.equals(null))
        {

                Status.display(context, "Please insert data correctly!");


        }

            return str;
    }
}
