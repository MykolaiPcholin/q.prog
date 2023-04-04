package com.example.lesson3;

public class Graduate extends Student{
    private boolean haveGoodGrades;
    private boolean haveDiploma;

    public Graduate(String firstName, String secondName, Gender gender, int id, String groupName, boolean haveGoodGrades, boolean haveDiploma) {
        super(firstName, secondName, gender, id, groupName);
        this.haveGoodGrades = haveGoodGrades;
        this.haveDiploma = haveDiploma;
    }

    public Graduate() {
        super();
    }
    @FirstAnnotation
    public boolean isHaveGoodGrades() {
        return haveGoodGrades;
    }

    public void setHaveGoodGrades(boolean haveGoodGrades) {
        this.haveGoodGrades = haveGoodGrades;
    }
    @SecondAnnotation
    public boolean isHaveDiploma() {
        return haveDiploma;
    }

    public void setHaveDiploma(boolean haveDiploma) {
        this.haveDiploma = haveDiploma;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "haveGoodGrades=" + haveGoodGrades +
                ", haveDiploma=" + haveDiploma +
                super.toString() + '\'' +
                '}';
    }
}
