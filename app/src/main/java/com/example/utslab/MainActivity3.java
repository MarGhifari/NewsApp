package com.example.utslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    String setTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity2.EXTRA_TEXT);

        TextView message= findViewById(R.id.txtMsg);

        for (int x = 0; x<3; x++){
            setTxt = "hi";
        }

        message.setText(setTxt + " Welcome, " + text +"/n");


    }
}