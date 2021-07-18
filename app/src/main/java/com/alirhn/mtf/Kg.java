package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kg extends AppCompatActivity {
Button btnKg , btnGr;
EditText editText;
TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg);

        btnGr = findViewById(R.id.btn_grToKg);
        btnKg = findViewById(R.id.btn_kgToGr);
        editText = findViewById(R.id.et_kg);
        tvShow = findViewById(R.id.tv_show_kg);


        btnGr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number/1000;
                tvShow.setText(String.valueOf("کیلو گرم : : "+String.valueOf(result)));
            }
        });

        btnKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number*1000;
                tvShow.setText( "گرم : " + String.valueOf(result));
            }
        });

    }
}