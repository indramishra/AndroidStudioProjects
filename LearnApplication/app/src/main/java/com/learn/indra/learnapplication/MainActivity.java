package com.learn.indra.learnapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
   /* String name;
    String email;
    String mobile;*/ ImageButton im;
   Cursor c;
    Context context;
    NaN nan;

    MyDBHelper mdb;
    public void saveData(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.et1);
        EditText t2 = (EditText) findViewById(R.id.et2);
        EditText t3 = (EditText) findViewById(R.id.et3);

       /* String name;
        String email;
        String mobile;*/


                String name = t1.getText().toString();
                String email = t2.getText().toString();
                String mobile = t3.getText().toString();
               // if(t3.getText().toString().length()>10||t3.getText().toString().length()<10)
                   //1jj Status.display(this,"The length of contact number should must be 10");


                try {
                    if(t1.getText().toString().length()!=0&&t2.getText().toString().length()!=0&&t3.getText().toString().length()!=0) {

                        mdb = new MyDBHelper(this);
                        long res = mdb.insertData(name, email, mobile, this);


                        if (res < 0) {
                            Status.display(this, "Unsuccessful");
                        } else {

                        }
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t1.requestFocus();
                    }
                    else
                        Status.display(this,"Please insert data correctly!");


                } catch (Exception e) {
                    //Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                    AlertDialog.Builder alert = new AlertDialog.Builder(this);

                    alert.setMessage(e.toString());
                    AlertDialog dialog = alert.create();
                    dialog.show();
                }
            }






   public void showData(View view)
    {
         try {
            ListView lv=(ListView)findViewById(R.id.lv);

            mdb=new MyDBHelper(this);
            SQLiteDatabase db=mdb.getReadableDatabase();

            c=db.rawQuery("select _id,NAME,EMAIL,CONTACT from CON",null);

            MyBaseAdapter adapter=new MyBaseAdapter(this,c);
            lv.setAdapter(adapter);

            // Button button = (Button) findViewById(R.id.b1);
        } catch (Exception e) {
            Status.display(this,e.getMessage());
        }


    }


    public  void onSearch(View view)
    {
        try {
            ListView lv=(ListView)findViewById(R.id.lv);

            mdb=new MyDBHelper(this);
           String str=mdb.searchData();

            // Button button = (Button) findViewById(R.id.b1);
        } catch (Exception e) {
            Status.display(this,e.getMessage());
        }

    }
    public void onDelete(final View view) {
       final EditText t1 = (EditText) findViewById(R.id.et1);

       final String name = t1.getText().toString();
        final AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                try {
                    if(name.length()==0)
                    {Status.display(MainActivity.this,"Please insert name to delete list!");}
                    else {

                        mdb = new MyDBHelper(MainActivity.this);
                        long res = mdb.deleteData(name);
                        if (res < 0) {
                            Status.display(MainActivity.this, "Unsuccessful Delete");
                        } else {
                            Status.display(MainActivity.this, "Successful Delete");
                            ListView v = (ListView) findViewById(R.id.lv);

                            showData(view);
                            t1.setText("");
                            t1.requestFocus();


                        }
                    }




                } catch (Exception e) {
                    //Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                    AlertDialog.Builder alert1 = new AlertDialog.Builder(MainActivity.this);

                    alert1.setMessage(e.toString());
                    AlertDialog dialog1 = alert1.create();
                    dialog1.show();
                }


            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Status.display(MainActivity.this,"Data is not deleted");

            }

        });

        alert.setMessage("Do you wand to delete");
        AlertDialog ad=alert.create();
        ad.show();

    }

    public void onUpdate(View view) {
        EditText t1 = (EditText) findViewById(R.id.et1);
        EditText t2 = (EditText) findViewById(R.id.et2);
        EditText t3 = (EditText) findViewById(R.id.et3);
        String name = t1.getText().toString();
        String email = t2.getText().toString();
        String mobile = t3.getText().toString();
        try {
            mdb = new MyDBHelper(MainActivity.this);
            long res = mdb.updateData(name, email, mobile);
            if (res < 0) {
                Status.display(this, "Unsuccessful update");
            } else
                Status.display(this, "Successful update");


        } catch (Exception e) {
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




   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }*/
}}