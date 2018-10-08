package com.andrewxa.pensioncalculator.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.andrewxa.pensioncalculator.R;

public class PersonActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        textView = findViewById(R.id.personIndex);

        Intent intent = getIntent();
        String index = intent.getStringExtra("index");
        textView.setText(index);

    }
}