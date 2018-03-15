package com.example.kallu.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonA;
    Button buttonB;
    Button buttonC;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = (Button) findViewById(R.id.btn1);
        buttonB = (Button) findViewById(R.id.btn2);
        buttonC = (Button) findViewById(R.id.btn3);
        textView = (TextView) findViewById(R.id.txt);
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
            textView.setText("A is Clicked");
        }
        if (view.getId() == R.id.btn2) {
            textView.setText("B is Clicked");
        }
        if (view.getId() == R.id.btn3) {
            textView.setText("C is Clicked");
        }
    }
}





