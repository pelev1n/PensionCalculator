package com.andrewxa.pensioncalculator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andrewxa.pensioncalculator.R;
import com.andrewxa.pensioncalculator.datasource.contract.Contract;
import com.andrewxa.pensioncalculator.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements Contract.View {

    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPerson();


        presenter = new Presenter(this,this);

        if(setPerson()){
            getPersonIndex();
        }
    }

    public void initPerson() {

    }


    @Override
    public boolean setPerson() {
        return presenter.createNewPerson();
    }

    @Override
    public void getPersonIndex() {

    }

    @Override
    public void showPersonIndex() {

    }
}
