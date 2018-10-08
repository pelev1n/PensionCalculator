package com.andrewxa.pensioncalculator.datasource.contract;

import java.util.Map;

public interface Contract {
    interface View {
        boolean setPerson(Map<String,String> personData);

        void getPersonIndex();

        void showPersonIndex(double index);
    }

    interface Presenter {
        void requestPersonIndex();

        boolean createNewPerson(Map<String,String> personData);
    }

    interface Model {
        int getAge();
        boolean isMale();
        int getRetireAge();
        int getChildren();
        String getFamilyStatus();
        String getJobStatus();

        void setAge(int age);
        void setMale(boolean male);
        void setRetireAge(int retireAge);
        void setChildren(int children);
        void setFamilyStatus(String familyStatus);
        void setJobStatus(String jobStatus);
        void setSalaryAmount(long salaryAmount);

        double calculateIndex();

    }
}
