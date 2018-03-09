package com.converter.indra.expensemaster.Mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Think.pad on 10/11/2017.
 */

public class IncomeDb extends SQLiteOpenHelper {
    Context context;
    SQLiteDatabase db;
    public IncomeDb(Context context) {
        super(context,"IncomeDB", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table INCOME(_id integer primary key autoincrement, INCOME_AMOUNT varchar(255),SOURCE varchar(255),DATE varchar(255))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists INCOME");
        Toast.makeText(context, "Database Upgraded from " + oldVersion + "to " + newVersion, Toast.LENGTH_LONG).show();
        onCreate(db);


    }
    public long insertIncome(Double income,String source,String date,Context context)
    {
        this.context=context;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues con = new ContentValues();
        long res;
        if(income.equals(null)&&source.equals(null)&&date.equals(null))
        {
            Toast.makeText(context, "Please insert data correctly", Toast.LENGTH_LONG).show();
        }
        else {

            con.put("INCOME_AMOUNT", income);
            con.put("SOURCE", source);
            con.put("DATE", date);


        }
        res = db.insert("INCOME", null, con);

        return res;
    }
}
