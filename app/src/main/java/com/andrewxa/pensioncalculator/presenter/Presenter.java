package com.andrewxa.pensioncalculator.presenter;

import android.content.Context;

import com.andrewxa.pensioncalculator.datasource.contract.Contract;
import com.andrewxa.pensioncalculator.datasource.model.Person;

import java.util.Map;

public class Presenter implements Contract.Presenter{

    Contract.View  mView;
    Context mContext;
    Contract.Model person;

    public Presenter(Contract.View view, Context context) {
        this.mView = view;
        this.mContext = context;
    }

    @Override
    public boolean createNewPerson(Map<String,String> personData) {
        person = new Person();
        person.setAge(Integer.parseInt(personData.get("age")));
        person.setMale(isMale(personData.get("gender")));
        person.setRetireAge(Integer.parseInt(personData.get("retireAge")));
        person.setFamilyStatus(personData.get("family"));
        person.setChildren(Integer.parseInt(personData.get("children")));
        person.setJobStatus(personData.get("job"));
        person.setSalaryAmount(Long.parseLong(personData.get("salary")));
        person.setPerCompensation(Double.parseDouble(personData.get("perCompensation")));
        person.setPerEmployer(Double.parseDouble(personData.get("perEmployer")));
        person.setPerEmployee(Double.parseDouble(personData.get("perEmployee")));
        return true;
    }

    @Override
    public void requestPersonIndex() {
        double personIndex = person.calculateIndex();
        mView.showPersonIndex(personIndex);
    }

    private boolean isMale(String gender){
        if(gender.contains("גבר")){
            return true;
        }
        return false;
    }
}
