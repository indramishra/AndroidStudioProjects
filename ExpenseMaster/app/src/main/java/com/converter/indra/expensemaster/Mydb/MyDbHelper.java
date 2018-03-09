package com.converter.indra.expensemaster.Mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import static android.R.attr.version;

/**
 * Created by Think.pad on 10/8/2017.
 */

public class MyDbHelper extends SQLiteOpenHelper {
    Cursor cursor;
    Context context;
    SQLiteDatabase db;
    String s = "";

    public MyDbHelper(Context context) {
        super(context, "ExpenseDB", null, 10);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CAT(_id integer primary key autoincrement, CAT_NAME varchar(255),AMOUNT varchar(255),DATE varchar(255), DESC varchar(255))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists CAT");
        //db.execSQL("drop table if exists INCOME");
        Toast.makeText(context, "Database Upgraded from " + oldVersion + "to " + newVersion, Toast.LENGTH_LONG).show();
        onCreate(db);

    }

    public long insertData(String cat_name, Double amount, String date, String desc, Context context) {
        this.context = context;

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        long res;
        if (cat_name.equals(null) && amount.equals(null) && date.equals(null) && desc.equals(null)) {

            Toast.makeText(context, "Please insert data correctly", Toast.LENGTH_LONG).show();
        } else {

            cv.put("CAT_NAME", cat_name);
            cv.put("AMOUNT", amount);
            cv.put("DATE", date);
            cv.put("DESC", desc);

        }

        res = db.insert("CAT", null, cv);

        return res;
    }

}
