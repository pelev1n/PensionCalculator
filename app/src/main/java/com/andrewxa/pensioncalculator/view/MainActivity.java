package com.andrewxa.pensioncalculator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andrewxa.pensioncalculator.R;
import com.andrewxa.pensioncalculator.datasource.contract.Contract;

public class MainActivity extends AppCompatActivity implements Contract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getPersonIndex() {

    }

    @Override
    public void showPersonIndex() {

    }
}
