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
    EditText perCompensation;
    EditText perEmployer;
    EditText perEmployee;

    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this, this);

        initPersonPage();

        getPersonIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (setPerson(initPersonData())) {
                    getPersonIndex();
                }
            }
        });
    }

    public void initPersonPage() {
        age = (EditText) findViewById(R.id.age);
        gender = findViewById(R.id.genderSpinner);
        retireAge = (EditText)findViewById(R.id.retireAge);
        family = findViewById(R.id.familySpinner);
        children = (EditText)findViewById(R.id.children);
        job = findViewById(R.id.jobStatusSpinner);
        salary = findViewById(R.id.salaryAmount);
        getPersonIndex = findViewById(R.id.getPersonIndex);
        perCompensation = findViewById(R.id.perCompensation);
        perEmployer = findViewById(R.id.perEmployer);
        perEmployee = findViewById(R.id.perEmployee);
    }

    public Map<String,String> initPersonData() {
        Map<String,String> personData = new HashMap<>();

        System.out.println("age.getText().toString() = " + Integer.parseInt(age.getText().toString()));
        System.out.println("gender.getSelectedItem().toString() = " + gender.getSelectedItem().toString());
        System.out.println("retireAge.getText().toString() = " + retireAge.getText().toString());
        System.out.println("family.getSelectedItem().toString() = " + family.getSelectedItem().toString());
        System.out.println("children.getText().toString() = " + children.getText().toString());
        System.out.println("job.getSelectedItem().toString() = " + job.getSelectedItem().toString());
        System.out.println("salary.getText().toString() = " + salary.getText().toString());

        personData.put("age",age.getText().toString());
        personData.put("gender",gender.getSelectedItem().toString());
        personData.put("retireAge",retireAge.getText().toString());
        personData.put("family",family.getSelectedItem().toString());
        personData.put("children",children.getText().toString());
        personData.put("job",job.getSelectedItem().toString());
        personData.put("salary",salary.getText().toString());
        personData.put("perCompensation",perCompensation.getText().toString());
        personData.put("perEmployer",perEmployer.getText().toString());
        personData.put("perEmployee",perEmployee.getText().toString());

        return personData;
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
        Bundle bundle = new Bundle();
        bundle.putDouble("index",index);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
