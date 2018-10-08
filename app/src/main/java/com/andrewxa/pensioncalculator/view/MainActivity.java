package com.andrewxa.pensioncalculator.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.andrewxa.pensioncalculator.R;
import com.andrewxa.pensioncalculator.datasource.contract.Contract;
import com.andrewxa.pensioncalculator.presenter.Presenter;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements Contract.View {

    EditText age;
    Spinner gender;
    EditText retireAge;
    Spinner family;
    EditText children;
    Spinner job;
    EditText salary;
    Button getPersonIndex;

    Map<String,String> personData = new HashMap<>();
    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this, this);

        initPersonPage();
        initPersonData();

        getPersonIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (setPerson(personData)) {
                    getPersonIndex();
                }
            }
        });
    }

    public void initPersonPage() {
        age = findViewById(R.id.age);
        gender = findViewById(R.id.genderSpinner);
        retireAge = findViewById(R.id.retireAge);
        family = findViewById(R.id.familySpinner);
        children = findViewById(R.id.children);
        job = findViewById(R.id.jobStatusSpinner);
        salary = findViewById(R.id.salaryAmount);
        getPersonIndex = findViewById(R.id.getPersonIndex);
    }

    public void initPersonData() {
        personData.put("age",age.toString());
        personData.put("gender",gender.getSelectedItem().toString());
        personData.put("retireAge",retireAge.toString());
        personData.put("family",family.getSelectedItem().toString());
        personData.put("children",children.toString());
        personData.put("job",job.getSelectedItem().toString());
        personData.put("salary",salary.toString());
    }


    @Override
    public boolean setPerson(Map<String,String> personData) {
        return presenter.createNewPerson(personData);
    }

    @Override
    public void getPersonIndex() {
        presenter.requestPersonIndex();
    }

    @Override
    public void showPersonIndex(double index) {
        Intent intent = new Intent(this,PersonActivity.class);
        intent.putExtra("index",index);
        startActivity(intent);
    }
}
