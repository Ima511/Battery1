package com.example.batteryhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // step1
        setSupportActionBar(toolbar);

        // text as title
        getSupportActionBar().setTitle("Battery Fiction");



//        toolbar.setTitle("Battery Fiction");

    }
}