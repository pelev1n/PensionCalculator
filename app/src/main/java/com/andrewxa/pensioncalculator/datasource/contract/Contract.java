package com.andrewxa.pensioncalculator.datasource.contract;

public interface Contract {
    interface View {
        void getPersonIndex();

        void showPersonIndex();
    }

    interface Presenter {
        void requestPersonIndex();
    }

    interface Model {
        int calculateIndex();
    }
}
