package com.example.batteryhealth;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.TextViewCompat;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView textView2;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // step1
        setSupportActionBar(toolbar);

        // text as title
        getSupportActionBar().setTitle("Battery Health");



//        toolbar.setTitle("Battery Fiction");


    }
}