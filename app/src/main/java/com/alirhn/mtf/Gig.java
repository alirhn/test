package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Gig extends AppCompatActivity {
Button btnGig , btnMb;
EditText editText;
TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gig);

        btnGig = findViewById(R.id.btn_gigToMg);
        btnMb = findViewById(R.id.btn_mbToGig);
        editText = findViewById(R.id.et_gig);
        tvShow = findViewById(R.id.tv_show_gig);
        
        String name = getIntent().getStringExtra("name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        btnMb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number/1000;
                tvShow.setText(String.valueOf("گیگابایت : "+String.valueOf(result)));
            }
        });

        btnGig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editText.getText().toString().trim());
                float result = number*1000;
                tvShow.setText( "مگا بایت" + String.valueOf(result));
            }
        });
    }
}