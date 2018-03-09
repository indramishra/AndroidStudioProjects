package com.converter.indra.loginapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Think.pad on 7/15/2017.
 */

public class MyDBHelper extends SQLiteOpenHelper {
    public MyDBHelper(Context context){
        super(context,"MyData",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table REGISTER(ID integer primary key autoincrement,NAME varchar(255) ,DOB varchar(255),MOBILE varchar(255),EMAIL varchar(255)) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exist REGISTER");
        onCreate(db);

    }
    public long insertData(String Name,String Dob,String Mobile,String Email)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("NAME",Name);
        cv.put("DOB",Dob);
        cv.put("MOBILE",Mobile);
        cv.put("EMAIL",Email);
        long res=db.insert("REGISTER",null,cv);
        return res;
    }
    public String retrievData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from REGISTER",null);
        String s="";
        while(cursor.moveToNext())
        {
            s=s+"ID-"+cursor.getString(0);
            s=s+"  NAME-"+cursor.getString(1);

        }
        return s;
    }
}
