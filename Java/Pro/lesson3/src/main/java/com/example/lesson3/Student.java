package com.example.lesson3;

public class Student extends Human {
    private int id;
    private String groupName;

    public Student(String firstName, String secondName, Gender gender, int id, String groupName) {
        super(firstName, secondName, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public Student() {
        super();
    }
    @FirstAnnotation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @FirstAnnotation
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                super.toString() + '\'' +
                '}';
    }
}
