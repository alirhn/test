package com.alirhn.mtf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

import com.yalantis.ucrop.UCrop;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
List<String> list = new ArrayList<>();
EditText editText;
Button add , show;
TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.et);
        add = findViewById(R.id.btnAdd);
        show = findViewById(R.id.btnShowww);
        textView = findViewById(R.id.tvshow);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(editText.getText().toString().trim());
                editText.setText("");
                //getting text
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0 ; i < list.size() ; i++){
                    textView.append(list.get(i) + "\n");
                    Log.i("log" , "hello github");
                }
            }
        });



    }

}