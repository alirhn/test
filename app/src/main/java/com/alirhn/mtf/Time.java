package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Time extends AppCompatActivity {
Button btnMin , btnSec;
EditText editText;
TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        btnMin = findViewById(R.id.btn_MinuteToSecind);
        btnSec = findViewById(R.id.btn_secToMin);
        editText = findViewById(R.id.et_time);
        tvShow = findViewById(R.id.tv_show_time);


        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number*60;
                tvShow.setText(String.valueOf("ثانیه : "+String.valueOf(result)));
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number/60;
                tvShow.setText( "دقیقه : " + String.valueOf(result));
            }
        });
    }

}