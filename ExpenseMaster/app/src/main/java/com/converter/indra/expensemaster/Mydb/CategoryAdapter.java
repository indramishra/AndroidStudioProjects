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
 * Created by Think.pad on 10/16/2017.
 */

public class CategoryAdapter extends CursorAdapter {
    public CategoryAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.category_layout,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tv4=(TextView)view.findViewById(R.id.textView);
        String category= cursor.getString( cursor.getColumnIndex("CATEGORY"));


        tv4.setText(category);

    }
}
