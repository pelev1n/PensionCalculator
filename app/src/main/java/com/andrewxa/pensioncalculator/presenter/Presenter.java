package com.andrewxa.pensioncalculator.presenter;

import android.content.Context;

import com.andrewxa.pensioncalculator.datasource.contract.Contract;
import com.andrewxa.pensioncalculator.datasource.model.Person;

public class Presenter implements Contract.Presenter{

    Contract.View  mView;
    Context mContext;
    Contract.Model person;

    Presenter(Contract.View view, Context context) {
        this.mView = view;
        this.mContext = context;
        person = new Person();
    }

    @Override
    public void requestPersonIndex() {

    }
}
