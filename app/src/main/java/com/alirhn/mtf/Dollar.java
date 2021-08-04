package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Dollar extends AppCompatActivity {
ToggleButton toggleButton;

    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar);


        toggleButton = findViewById(R.id.tgl);
        toggleButton.setTextOff("roshan");
        toggleButton.setTextOn("khamush");
        switch1 = findViewById(R.id.switch1);
        switch1.isChecked();

    }
}