package com.example.lesson3;

public class Human {
    private String firstName;
    private String secondName;
    private Gender gender;

    public Human(String firstName, String secondName, Gender gender) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
    }
    public Human() {
        super();
    }
    @SecondAnnotation
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @SecondAnnotation
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    @FirstAnnotation
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
