package com.converter.indra.expensemaster;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.converter.indra.expensemaster.Mydb.ExpenceAdapter;
import com.converter.indra.expensemaster.Mydb.MyDbHelper;

public class Stats extends AppCompatActivity {
    MyDbHelper mdb;
    Cursor c;
    View view;
    Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
     /*   btn_show=(Button)findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showData(view);
            }
        });*/


    }
    public void showData(View view)
    {
        try {
            ListView lv=(ListView)findViewById(R.id.lv);

            mdb=new MyDbHelper(this);
            SQLiteDatabase db=mdb.getReadableDatabase();

            c=db.rawQuery("select _id,CAT_NAME,AMOUNT,DATE,DESC from CAT",null);

            ExpenceAdapter adapter=new ExpenceAdapter(this,c);
            lv.setAdapter(adapter);

            // Button button = (Button) findViewById(R.id.b1);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(),Toast.LENGTH_LONG).show();
        }


    }
}
