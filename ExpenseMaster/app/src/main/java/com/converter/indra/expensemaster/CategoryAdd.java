package com.converter.indra.expensemaster;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.converter.indra.expensemaster.Mydb.MyDbHelper;

public class CategoryAdd extends AppCompatActivity {
    Category c;
    MyDbHelper mdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_add);
    }
   /* public void onAdd(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.add_rupees);
        EditText t2 = (EditText) findViewById(R.id.date);
        EditText t3 = (EditText) findViewById(R.id.cat_desc);
        String cat=String.valueOf(c.list);
        Toast.makeText(this,cat,Toast.LENGTH_LONG).show();
        Double amount = Double.parseDouble(t1.getText().toString());
        String date = t2.getText().toString();
        String desc = t3.getText().toString();
        try {
            if(cat.length() !=0 &&t1.getText().toString().length()!=0&&t2.getText().toString().length()!=0&&t3.getText().toString().length()!=0) {

                mdb = new MyDbHelper(this);
                long res = mdb.insertData(cat, amount, date,desc, this);


                if (res < 0) {
                    Toast.makeText(this, "Unsuccessful",Toast.LENGTH_LONG).show();
                } else {

                }
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t1.requestFocus();
            }
            else
                Toast.makeText(this,"Please insert data correctly!",Toast.LENGTH_LONG).show();


        } catch (Exception e) {
            //Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setMessage(e.toString());
            AlertDialog dialog = alert.create();
            dialog.show();
        }
    }*/

}

