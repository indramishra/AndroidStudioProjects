package com.games.indra.tictacto;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.app.Activity;
import android.widget.Toast;

public class PlayActivity extends Activity {
    String[] a = new String[]{"", "", "", "", "", "", "", "", ""};
    String msg = "";
    boolean checkwin =false;


    boolean win;


    int c = 0;


    public void check(View view) {
        c++;
        Button b = (Button) view;
        int i = Integer.parseInt(b.getTag().toString());


        if (c % 2 == 0) {
            b.setText("#");
            a[i] = "#";
            b.setEnabled(false);

        } else {
            b.setText("*");
            a[i] = "*";
            b.setEnabled(false);
        }
        i++;


        if (c >= 5) {

                if (a[0].equals("*") && a[1].equals("*") && a[2].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[0].equals("*") && a[3].equals("*") && a[6].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[3].equals("*") && a[4].equals("*") && a[5].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[6].equals("*") && a[7].equals("*") && a[8].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[1].equals("*") && a[4].equals("*") && a[7].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[2].equals("*") && a[5].equals("*") && a[8].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[0].equals("*") && a[4].equals("*") && a[8].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[2].equals("*") && a[4].equals("*") && a[6].equals("*")) {
                    checkwin = true;
                    win = false;
                } else if (a[0].equals("#") && a[1].equals("#") && a[2].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[3].equals("#") && a[4].equals("#") && a[5].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[6].equals("#") && a[7].equals("#") && a[8].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[0].equals("#") && a[3].equals("#") && a[6].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[1].equals("#") && a[4].equals("#") && a[7].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[2].equals("#") && a[5].equals("#") && a[8].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[0].equals("#") && a[4].equals("#") && a[8].equals("#")) {
                    checkwin = true;
                    win = true;
                } else if (a[2].equals("#") && a[4].equals("#") && a[6].equals("#")) {
                    checkwin = true;
                    win = true;
                } else
                    checkwin = false;


                if (!win)
                    msg = "* side won";
                else
                    msg = "# side won";
                if (checkwin) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(PlayActivity.this, PlayActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    alert.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    alert.setMessage(msg);

                    AlertDialog alertDialog = alert.create();
                    alertDialog.show();
                }
                else
                {
                    if (c == 9 && !checkwin ) {

                        AlertDialog.Builder alert = new AlertDialog.Builder(this);
                        alert.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(PlayActivity.this, PlayActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                        alert.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                        alert.setMessage("The match has been drawn");

                        AlertDialog alertDialog = alert.create();
                        alertDialog.show();
                    }
                }


            }
            // Log.d("Show me error", "Here error is shown");






    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);




    }





}
