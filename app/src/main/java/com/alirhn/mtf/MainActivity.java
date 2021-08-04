package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9;
int turn = 1 , winner = 0;
ArrayList<Integer> playList1 = new ArrayList<>();
ArrayList<Integer> playList2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();


    }

    private void findView() {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        changeText(btn1 , "pressed" , Color.YELLOW);
        changeText(btn2 , "pressed" , Color.GREEN);
        changeText(btn3 , "pressed" , Color.GRAY);
        changeText(btn4 , "pressed" , Color.BLUE);
        changeText(btn5 , "pressed" , Color.RED);
        changeText(btn6 , "pressed" , Color.BLACK);
        changeText(btn7 , "pressed" , Color.MAGENTA);
        changeText(btn8 , "pressed" , Color.DKGRAY);
        changeText(btn9 , "pressed" , Color.CYAN);

        play(btn1 , 1);
        play(btn2 , 2);
        play(btn3 , 3);
        play(btn4 , 4);
        play(btn5 , 5);
        play(btn6 , 6);
        play(btn7 , 7);
        play(btn8 , 8);
        play(btn9 , 9);

    }

    private void changeText(Button button , String text , int color){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button.setText(text);
                button.setBackgroundColor(color);
            }
        });
    }
    private void play(Button button , int digit){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1) {
                    turn = 2;
                    playList1.add(digit);
                    button.setText("X");
                    button.setBackgroundColor(Color.GREEN);
                    button.setEnabled(false);
                } else if (turn == 2) {
                    turn = 1;
                    playList2.add(digit);
                    button.setText("o");
                    button.setBackgroundColor(Color.RED);
                    button.setEnabled(false);
                }
                if (playList1.contains(1) && playList1.contains(2) && playList1.contains(3)) {
                    winner = 1;
                } else if (playList1.contains(1) && playList1.contains(4) && playList1.contains(7)) {
                    winner = 1;
                } else if (playList1.contains(9) && playList1.contains(6) && playList1.contains(3)) {
                    winner = 1;
                } else if (playList1.contains(1) && playList1.contains(5) && playList1.contains(9)) {
                    winner = 1;
                } else if (playList1.contains(3) && playList1.contains(5) && playList1.contains(7)) {
                    winner = 1;
                } else if (playList1.contains(4) && playList1.contains(5) && playList1.contains(6)) {
                    winner = 1;
                } else if (playList1.contains(7) && playList1.contains(8) && playList1.contains(9)) {
                    winner = 1;
                } else if (playList2.contains(1) && playList2.contains(2) && playList2.contains(3)) {
                    winner = 2;
                } else if (playList2.contains(1) && playList2.contains(4) && playList2.contains(7)) {
                    winner = 2;
                } else if (playList2.contains(9) && playList2.contains(6) && playList2.contains(3)) {
                    winner = 2;
                } else if (playList2.contains(1) && playList2.contains(5) && playList2.contains(9)) {
                    winner = 2;
                } else if (playList2.contains(3) && playList2.contains(5) && playList2.contains(7)) {
                    winner = 2;
                } else if (playList2.contains(4) && playList2.contains(5) && playList2.contains(6)) {
                    winner = 2;
                } else if (playList2.contains(7) && playList2.contains(8) && playList2.contains(9)) {
                    winner = 2;
                }
                if (winner == 1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                            .setMessage("player 1 wins !")
                            .setPositiveButton("retry", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    recreate();
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }else if(winner == 2){

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                            .setMessage("player 2 wins !")
                            .setPositiveButton("retry", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    recreate();
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

    }
}