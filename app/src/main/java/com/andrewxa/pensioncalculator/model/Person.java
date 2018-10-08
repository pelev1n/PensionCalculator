package com.andrewxa.pensioncalculator.model;

public class Person {
    private int age;
    private boolean male;
    private boolean children;
    private String familyStatus;
    private String jobStatus;
    private long salaryAmount;

    Person() {

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

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
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
    public int calculateIndex() {

        return 1;
    }
}
