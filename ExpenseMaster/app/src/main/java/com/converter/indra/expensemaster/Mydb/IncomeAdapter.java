package com.converter.indra.expensemaster.Mydb;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.converter.indra.expensemaster.R;

/**
 * Created by Think.pad on 10/10/2017.
 */

public class IncomeAdapter extends CursorAdapter {

    public IncomeAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }



    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.viewlayout,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tv1=(TextView)view.findViewById(R.id.in_amount);
        TextView tv2=(TextView)view.findViewById(R.id.in_source);
        TextView tv3=(TextView)view.findViewById(R.id.in_date);
        String income= cursor.getString( cursor.getColumnIndex("INCOME_AMOUNT"));
        String source= cursor.getString( cursor.getColumnIndex("SOURCE"));
        String date= cursor.getString( cursor.getColumnIndex("DATE"));
        tv1.setText(income);
        tv2.setText(source);
        tv3.setText(date);

    }
}
