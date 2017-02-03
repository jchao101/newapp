package com.example.techworkshop.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    Button button = (Button) findViewById(R.id.button);

button.setOnClickListener(new View.onClickListener() {

@Override

public void onClick(View v) {

        goToSecondActivity();

        }

        });