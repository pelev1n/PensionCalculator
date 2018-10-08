package com.andrewxa.pensioncalculator.datasource.model;

import com.andrewxa.pensioncalculator.datasource.contract.Contract;

public class Person implements Contract.Model{
    private int age;
    private boolean male;
    private int retireAge;
    private int children;
    private String familyStatus;
    private String jobStatus;
    private long salaryAmount;

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getRetireAge() {
        return retireAge;
    }

    public void setRetireAge(int retireAge) {
        this.retireAge = retireAge;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public long getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(long salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    // Formula for calculating Person's index

    @Override
    public double calculateIndex() {
        /*double index = (double) age + retireAge + children + salaryAmount
                + familyStatus.length()
                + jobStatus.length();
        if(male) {
            index += 2;
        }*/

        double index = 1;

        return index;
    }
}
