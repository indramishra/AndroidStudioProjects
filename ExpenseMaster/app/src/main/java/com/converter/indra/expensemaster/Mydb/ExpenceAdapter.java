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
 * Created by Think.pad on 10/7/2017.
 */

public class ExpenceAdapter extends CursorAdapter {
    public ExpenceAdapter(Context context, Cursor c) {
        super(context, c,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.listlayout,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tv1=(TextView)view.findViewById(R.id.cat_name);
        TextView tv2=(TextView)view.findViewById(R.id.cat_amount);
        TextView tv3=(TextView)view.findViewById(R.id.cat_date);
        TextView tv4=(TextView)view.findViewById(R.id.cat_description);
        String category= cursor.getString( cursor.getColumnIndex("CAT_NAME"));
        String amount= cursor.getString( cursor.getColumnIndex("AMOUNT"));
        String date= cursor.getString( cursor.getColumnIndex("DATE"));
        String desc= cursor.getString( cursor.getColumnIndex("DESC"));
        tv1.setText(category);
        tv2.setText(amount);
        tv3.setText(date);
        tv4.setText(desc);

    }
}
