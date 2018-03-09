package com.converter.indra.expensemaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    int pre_val,current_val;
    boolean equal_click;
    String opr="";

































































































































    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final EditText e=(EditText)findViewById(R.id.edit1);
        e.setEnabled(false);
        Button btn00=(Button)findViewById(R.id.btn00);
        final Button btn0=(Button)findViewById(R.id.btn0);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        Button btn3=(Button)findViewById(R.id.btn3);
        Button btn4=(Button)findViewById(R.id.btn4);
        Button btn5=(Button)findViewById(R.id.btn5);
        Button btn6=(Button)findViewById(R.id.btn6);
        Button btn7=(Button)findViewById(R.id.btn7);
        Button btn8=(Button)findViewById(R.id.btn8);
        Button btn9=(Button)findViewById(R.id.btn9);
        Button btn_clr=(Button)findViewById(R.id.btn_clr);
        Button btn_equal=(Button)findViewById(R.id.btn_equal);
        Button btn_add=(Button)findViewById(R.id.btn_addition);
        Button btn_sub=(Button)findViewById(R.id.btn_subtraction);
        Button btn_mul=(Button)findViewById(R.id.btn_multiplication);

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("00");
                else
                    e.setText(s+"00");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("1");
                else
                    e.setText(s+"1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("2");
                else
                    e.setText(s+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("3");
                else
                    e.setText(s+"3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("4");
                else
                    e.setText(s+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("5");
                else
                    e.setText(s+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("6");
                else
                    e.setText(s+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("7");
                else
                    e.setText(s+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("8");
                else
                    e.setText(s+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=String.valueOf(e.getText());
                if(s.equals("0"))
                    e.setText("9");
                else
                    e.setText(s+"9");
            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText("0");

            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(opr.equals("+"))
                {
                    current_val=Integer.parseInt(e.getText().toString().substring(e.getText().toString().indexOf("+")+1));
                    // current_val=Integer.parseInt(String.valueOf(e.getText()));
                    // String str=""+(e.setText(""+(pre_val+current_val)));
                    String result= pre_val+" + "+current_val+" = "+(pre_val+current_val);
                    e.setText(result);

                }
                else if(opr.equals("-"))
                {
                    current_val=Integer.parseInt(e.getText().toString().substring(e.getText().toString().indexOf("-")+1));
                    String result= pre_val+" - "+current_val+" = "+(pre_val-current_val);
                    e.setText(result);

                }
                else if(opr.equals("*"))
                {
                    current_val=Integer.parseInt(String.valueOf(e.getText()));
                    e.setText(""+(pre_val*current_val));

                }


            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre_val=Integer.parseInt(e.getText().toString());
                e.setText(pre_val+"+");
                opr="+";

            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre_val=Integer.parseInt(e.getText().toString());
                e.setText(pre_val+"-");
                opr="-";

            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre_val=Integer.parseInt(e.getText().toString());
                e.setText("0");
                opr="*";

            }
        });
    }
}
