package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Dollar extends AppCompatActivity {
Button dollar , rial;
EditText editText;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar);

        dollar = findViewById(R.id.btn_dollarToRial);
        rial = findViewById(R.id.btn_rialToDollar);
        editText = findViewById(R.id.et_dollar);
        textView = findViewById(R.id.tv_show_dollar);


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number * 24000;
                textView.setText(String.valueOf("ریال : "+String.valueOf(result)));
            }
        });

        rial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number/24000;
                textView.setText( "دلار : " + String.valueOf(result));
            }
        });

    }
}