package com.example.demo.entity;

public class Student {

    private String ID;
    private String name;
    private String age;
    private String FM;

    public Student(String ID, String name, String age, String FM) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.FM = FM;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFM() {
        return this.FM;
    }

    public void setFM(String fM) {
        FM = fM;
    }
}
