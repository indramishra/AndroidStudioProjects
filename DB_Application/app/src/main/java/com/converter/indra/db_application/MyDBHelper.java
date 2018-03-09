package com.converter.indra.db_application;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by Think.pad on 7/13/2017.
 */

public  class MyDBHelper extends SQLiteOpenHelper {

    public  MyDBHelper(Context context) {
        super(context,"MyContacts", null, 1);
    }




    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CONTACT(ID integer primary key autoincrement, NAME varchar(255),EMAIL varchar(255), CONTACT varchar(255))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exist CONTACT");
        onCreate(db);

    }
    public long insertData(String Name,String Email,String Mobile)
    {

            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("NAME", Name);
            cv.put("EMAIL", Email);
            cv.put("CONTACT", Mobile);
            long res = db.insert("CONTACT", null, cv);
            return res;

    }
    public String retrievData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
       // Cursor cursor=db.rawQuery("select * from CONTACT",null);
        String s= "";
        String[] columns={"ID","NAME","EMAIL","CONTACT"};
        Cursor cursor=db.query("CONTACT",columns,null,null,null,null,null);
        while(cursor.moveToNext())
        {
            s=s+"ID-"+cursor.getString(0);
            s=s+"  NAME-"+cursor.getString(1);
            s=s+"EMAIL-"+cursor.getString(2);
            s=s+"CONTACT-"+cursor.getString(3);
            s=s+"\n";
        }
        db.close();
        return s;
    }
    public long updateData(String Name,String Email,String Mobile)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NAME", Name);
        cv.put("EMAIL", Email);
        cv.put("CONTACT", Mobile);
        long res = db.update("CONTACT",cv,"NAME=?",new String[]{Name});
        db.close();
        return res;
    }
    public long deleteData(String Name)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        long res = db.delete("CONTACT","NAME=?",new String[]{Name});
        db.close();
        return res;
    }

}
