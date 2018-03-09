package com.converter.indra.menuapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String selectedItem="";
        switch(item.getItemId())
        {
            case R.id.it1:
                selectedItem="Apple";
                break;
            case R.id.it2:
                selectedItem="Grape";
                break;
            case R.id.it3:
                selectedItem="Guava";
                break;
        }
        Toast.makeText(this,selectedItem,Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }
}
