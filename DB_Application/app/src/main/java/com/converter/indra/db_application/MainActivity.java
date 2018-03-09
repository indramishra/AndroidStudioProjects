package com.converter.indra.db_application;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.media.TimedText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MyDBHelper mdb;
    public void saveData(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.et1);
        EditText t2 = (EditText) findViewById(R.id.et2);
        EditText t3 = (EditText) findViewById(R.id.et3);
        String name = t1.getText().toString();
        String email =t2.getText().toString();
        String mobile = t3.getText().toString();
        try {
            mdb = new MyDBHelper(this);
            long res = mdb.insertData(name, email, mobile);
            if (res < 0) {
                Status.show(this,"Unsuccessful");
            } else
                Status.show(this,"Successful");


        } catch(Exception e)
        {
            //Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert=new AlertDialog.Builder(this);

            alert.setMessage(e.toString());
            AlertDialog dialog=alert.create();
            dialog.show();
        }
    }
    public void showData(View view)
    {
        mdb=new MyDBHelper(this);
        String str=mdb.retrievData();
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
    public  void onSearch(View view)
    {

    }
    public void onDelete(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.et1);

        String name = t1.getText().toString();

        try {
            mdb = new MyDBHelper(this);
            long res = mdb.deleteData(name);
            if (res < 0) {
                Status.show(this,"Unsuccessful Delete");
            } else
                Status.show(this,"Successful Delete");


        } catch(Exception e) {
            //Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setMessage(e.toString());
            AlertDialog dialog = alert.create();
            dialog.show();
        }

    }
    public void onUpdate(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.et1);
        EditText t2 = (EditText) findViewById(R.id.et2);
        EditText t3 = (EditText) findViewById(R.id.et3);
        String name = t1.getText().toString();
        String email =t2.getText().toString();
        String mobile = t3.getText().toString();
        try {
            mdb = new MyDBHelper(this);
            long res = mdb.updateData(name, email, mobile);
            if (res < 0) {
                Status.show(this,"Unsuccessful update");
            } else
                Status.show(this,"Successful update");


        } catch(Exception e) {
            //Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setMessage(e.toString());
            AlertDialog dialog = alert.create();
            dialog.show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.b1);



    }

}
