package com.andrewxa.pensioncalculator.datasource.contract;

public interface Contract {
    interface View {
        boolean setPerson();

        void getPersonIndex();

        void showPersonIndex();
    }

    interface Presenter {
        void requestPersonIndex();

        boolean createNewPerson();
    }

    interface Model {
        int calculateIndex();
    }
}
