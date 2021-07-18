package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mb extends AppCompatActivity {
Button btnMeg , btnBit;
EditText editText;
TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mb);

        btnBit = findViewById(R.id.btn_bitToMg);
        btnMeg = findViewById(R.id.btn_mgToBit);
        editText = findViewById(R.id.et_megabyte);
        tvShow = findViewById(R.id.tv_show_mb);

        btnMeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number/1000;
                tvShow.setText(String.valueOf("مگا بایت : "+String.valueOf(result)));
            }
        });

        btnBit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number*1000;
                tvShow.setText( "مگا بیت" + String.valueOf(result));
            }
        });
    }

}