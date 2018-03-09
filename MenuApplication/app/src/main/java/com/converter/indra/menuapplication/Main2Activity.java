package com.converter.indra.menuapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String[] str={"A","B","C","D","E"};
    ListView lv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv=(ListView)findViewById(R.id.lv1);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        lv.setAdapter(myAdapter);
        registerForContextMenu(lv);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        String selectedItem=lv.getItemAtPosition(info.position).toString();
        switch(item.getItemId())
        {
            case R.id.it1:
                selectedItem+="Apple";
                break;
            case R.id.it2:
                selectedItem+="Grapes";
                break;
            case R.id.it3:
                selectedItem+="Guava";
                break;



        }


        Toast.makeText(this,selectedItem,Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);

    }
}


