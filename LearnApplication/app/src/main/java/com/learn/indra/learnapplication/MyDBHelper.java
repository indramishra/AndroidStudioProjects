package com.learn.indra.learnapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Think.pad on 7/20/2017.
 */

public class MyDBHelper extends SQLiteOpenHelper {

    String s = "";
    Cursor cursor;
    SQLiteDatabase db;
    Context context;


    public MyDBHelper(Context context) {
        super(context, "MyDB123", null, 14);
        this.context = context;
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CON(_id integer primary key autoincrement, NAME varchar(255),EMAIL varchar(255),CONTACT varchar(255))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists CON");
        Status.display(context, "Database Upgraded from " + oldVersion + "to " + newVersion);
        onCreate(db);

    }

    public long insertData(String Name, String Email, String Mobile, Context context) {
        this.context = context;

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        long res;
        if(Name.equals(null)&&Email.equals(null)&&Mobile.equals(null)) {

            Status.display(context, "Please insert data correctly");
        }

        else {

        cv.put("NAME", Name);
        cv.put("EMAIL", Email);
        cv.put("CONTACT", Mobile);

    }

        res = db.insert("CON", null, cv);

        return res;

    }





    /*public String retrievData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        // Cursor cursor=db.rawQuery("select * from CONTACT",null);

        String[] columns={"ID","NAME","EMAIL","CONTACT"};
        cursor=db.query("DATA",columns,null,null,null,null,null);
        while(cursor.moveToNext())
        {

                s+= "ID-" + cursor.getString(0);
                s+= "  NAME-" + cursor.getString(1);
                s+= "EMAIL-" + cursor.getString(2);
                s+= "CONTACT-" + cursor.getString(3);


        }
        db.close();
        return s;
    }*/
    public long updateData(String Name, String Email, String Mobile) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NAME", Name);
        cv.put("EMAIL", Email);
        cv.put("CONTACT", Mobile);
        long res = db.update("CON", cv, "NAME=?", new String[]{Name});
        db.close();
        return res;
    }

    public long deleteData(String Name) {
        SQLiteDatabase db = this.getWritableDatabase();

        long res = db.delete("CON", "NAME=?", new String[]{Name});
        db.close();
        return res;
    }

    public String searchData() {
        String[] columns = {"ID", "NAME", "EMAIL", "CONTACT"};
        cursor = db.query("DATA", columns, "NAME=?", null, null, null, null);
        while (cursor.moveToNext()) {

            s += "ID-" + cursor.getString(0);
            s += "  NAME-" + cursor.getString(1);
            s += "EMAIL-" + cursor.getString(2);
            s += "CONTACT-" + cursor.getString(3);


        }
        db.close();
        return s;

    }
}

