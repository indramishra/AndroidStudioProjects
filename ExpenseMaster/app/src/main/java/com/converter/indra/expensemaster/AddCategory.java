package com.converter.indra.expensemaster;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.converter.indra.expensemaster.Mydb.CategoryDb;
import com.converter.indra.expensemaster.Mydb.IncomeDb;
import com.converter.indra.expensemaster.Mydb.MyDbHelper;

public class AddCategory extends AppCompatActivity {
    CategoryDb mdb;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
       /* String cat = String.valueOf(c.list);
        Toast.makeText(this, cat, Toast.LENGTH_LONG).show();*/
       back=(Button)findViewById(R.id.btn_cancle);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent in=new Intent(AddCategory.this,Category.class);
                startActivity(in);
            }
        });

    }
    public void onEdit(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.cat_name);




        String category = t1.getText().toString();

        try {
            if(category!="") {

                mdb = new CategoryDb(this);
                long res = mdb.insertCategory(category, this);


                if (res < 0) {
                    Toast.makeText(this, "Unsuccessful",Toast.LENGTH_LONG).show();
                } else {


                    t1.setText("");

                    Toast.makeText(this, "Successful!", Toast.LENGTH_LONG).show();
                    // showIncome(view);
                    t1.requestFocus();

                }
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
    }
}

