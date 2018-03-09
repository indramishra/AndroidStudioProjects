package com.converter.indra.expensemaster.Mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Think.pad on 10/16/2017.
 */

public class CategoryDb extends SQLiteOpenHelper {
    Context context;
    public CategoryDb(Context context) {
        super(context, "CategoryDB", null, 4);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CATEGORY(_id integer primary key autoincrement, Category varchar(255))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists CATEGORY");
        Toast.makeText(context, "Database Upgraded from " + oldVersion + "to " + newVersion, Toast.LENGTH_LONG).show();
        onCreate(db);

    }
    public long insertCategory(String category,Context context)
    {
        this.context=context;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues con = new ContentValues();
        long res;
        if(category.equals(null))
        {
            Toast.makeText(context, "Please insert data correctly", Toast.LENGTH_LONG).show();
        }
        else {

            con.put("Category", category);



        }
        res = db.insert("CATEGORY", null, con);

        return res;
    }
}
