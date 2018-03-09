package com.converter.indra.menuapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
      final   Button btn=(Button)findViewById(R.id.btn);
       //final RadioGroup rg=(RadioGroup)findViewById(R.id.rg);
       final Switch sw=(Switch)findViewById(R.id.s1);
       final ToggleButton tg=(ToggleButton)findViewById(R.id.tog);
        final SeekBar sk=(SeekBar)findViewById(R.id.sb1);
        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw.isChecked())
                {
                   Toast.makeText(Main5Activity.this,"Wifi status"+sw.getText().toString(),Toast.LENGTH_LONG).show();
                }

            }
        });
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main5Activity.this,tg.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int sel_id=rg.getCheckedRadioButtonId();
              //  RadioButton rb=(RadioButton)findViewById(sel_id);

               // Toast.makeText(Main5Activity.this,rb.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
