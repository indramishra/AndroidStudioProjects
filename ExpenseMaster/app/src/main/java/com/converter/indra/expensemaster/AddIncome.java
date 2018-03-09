package com.converter.indra.expensemaster;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.converter.indra.expensemaster.Mydb.ExpenceAdapter;
import com.converter.indra.expensemaster.Mydb.IncomeAdapter;
import com.converter.indra.expensemaster.Mydb.IncomeDb;
import com.converter.indra.expensemaster.Mydb.MyDbHelper;

public class AddIncome extends AppCompatActivity {
    IncomeDb mdb;
    Cursor c;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_income);
        showIncome(view);
    }
    public void AddIncome(View view)
    {
        EditText t1 = (EditText) findViewById(R.id.income);
        EditText t2 = (EditText) findViewById(R.id.income_source);
        EditText t3 = (EditText) findViewById(R.id.income_date);


        Double income = Double.parseDouble(t1.getText().toString());
        String source = t2.getText().toString();
        String date = t3.getText().toString();
        try {
            if(t1.getText().toString().length()!=0&&t2.getText().toString().length()!=0&&t3.getText().toString().length()!=0) {

                mdb = new IncomeDb(this);
                long res = mdb.insertIncome(income,source,date, this);


                if (res < 0) {
                    Toast.makeText(this, "Unsuccessful",Toast.LENGTH_LONG).show();
                } else {


                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    Toast.makeText(this, "Successful!", Toast.LENGTH_LONG).show();
                   // showIncome(view);
                    t1.requestFocus();
                    showIncome(view);
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
    public void showIncome(View view)
    {
        try {
            ListView lv=(ListView)findViewById(R.id.listview);

            mdb=new IncomeDb(this);
            SQLiteDatabase db=mdb.getReadableDatabase();

            c=db.rawQuery("select _id,INCOME_AMOUNT,SOURCE,DATE from INCOME",null);

            IncomeAdapter adapter=new IncomeAdapter(this,c);
            lv.setAdapter(adapter);

            // Button button = (Button) findViewById(R.id.b1);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(),Toast.LENGTH_LONG).show();
        }


    }
}
