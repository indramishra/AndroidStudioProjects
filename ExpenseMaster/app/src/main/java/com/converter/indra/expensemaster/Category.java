package com.converter.indra.expensemaster;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.converter.indra.expensemaster.Mydb.CategoryAdapter;
import com.converter.indra.expensemaster.Mydb.CategoryDb;
import com.converter.indra.expensemaster.Mydb.IncomeAdapter;
import com.converter.indra.expensemaster.Mydb.IncomeDb;
import com.converter.indra.expensemaster.Mydb.MyDbHelper;

import java.util.ArrayList;
import java.util.Arrays;


public class Category extends AppCompatActivity {
    CategoryDb cdb;
    Cursor c;
    CategoryAdapter categoryAdapter;
   /* ImageButton btn;
    android.app.FragmentManager fragmentManager = getFragmentManager();*/
   /* FragmentTransaction transaction = fragmentManager.beginTransaction();*/
    Spinner spinner;
    ImageButton cat_add;
    ImageButton calc;
    Button add, clear;
    Exception e;
    String msg="Category: ";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        spinner=(Spinner)findViewById(R.id.spinner);
        Log.e(msg, "onCreate: hello friends how /////////////// are you",e );
        try
        {
            cdb=new CategoryDb(this);
            SQLiteDatabase db=cdb.getReadableDatabase();
            c=db.rawQuery("select _id, Category from CATEGORY",null);
            categoryAdapter=new CategoryAdapter(this,c);
            spinner.setAdapter(categoryAdapter);
        } catch(Exception e)
        {
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }
        cat_add=(ImageButton)findViewById(R.id.add_category);
        calc=(ImageButton)findViewById(R.id.calc) ;
        add=(Button)findViewById(R.id.btn_add);
        //change activity from Category to AddCategory
        cat_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,AddCategory.class);
                startActivity(intent);
            }
        });
        //change activity from Category to Calculator
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,Calculator.class);
                startActivity(intent);
            }
        });


    }

 /* public void onAdd(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.add_rupees);
        EditText t2 = (EditText) findViewById(R.id.date);
        EditText t3 = (EditText) findViewById(R.id.cat_desc);
        spinnerlist= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        spinnerlist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        for(int i=0;i<cat.length;i++)
        {
            spinnerlist.add(cat[list.size()]+"/n");
        }
        spinner.setAdapter(spinnerlist);
        //Toast.makeText(this,cat,Toast.LENGTH_LONG).show();
        Double amount = Double.parseDouble(t1.getText().toString());
        String date = t2.getText().toString();
        String desc = t3.getText().toString();
        try {
            if(list!=null &&t1.getText().toString().length()!=0&&t2.getText().toString().length()!=0&&t3.getText().toString().length()!=0) {

                mdb = new MyDbHelper(this);
                long res = mdb.insertData(list.toString(), amount, date,desc, this);


                if (res < 0) {
                    Toast.makeText(this, "Unsuccessful",Toast.LENGTH_LONG).show();
                } else {

                }
                t1.setText("");
                t2.setText("");
                t3.setText("");
                Toast.makeText(this,"Successful!",Toast.LENGTH_LONG).show();
                spinner.requestFocus();
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
  /*  private void initialize()
    {
        btn = (ImageButton) findViewById(R.id.category);
        btn.setOnClickListener(this);
    }
*/

/* @Override
   public void onClick(View v) {
        BlankFragment fragment = new BlankFragment();
        transaction.add(R.id., fragment);
        transaction.commit();

    }*/



