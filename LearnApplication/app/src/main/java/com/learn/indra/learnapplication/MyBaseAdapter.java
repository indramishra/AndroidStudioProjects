package com.learn.indra.learnapplication;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by Think.pad on 7/22/2017.
 */

public class MyBaseAdapter extends CursorAdapter{



    public MyBaseAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        return LayoutInflater.from(context).inflate(R.layout.viewlayout,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView tv1=(TextView)view.findViewById(R.id.tv1);
        TextView tv2=(TextView)view.findViewById(R.id.tv2);
        TextView tv3=(TextView)view.findViewById(R.id.tv3);

        String name=cursor.getString( cursor.getColumnIndex("NAME"));
        String email=cursor.getString( cursor.getColumnIndex("EMAIL"));
        String contact=cursor.getString( cursor.getColumnIndex("CONTACT"));

        tv1.setText(name);
        tv2.setText(email);
        tv3.setText(contact);



    }
}