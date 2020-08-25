package com.example.demo;

public class Student {
    private int stdId;
    private String stdName;
    private String address;

    public Student(int stdId, String stdName, String address) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.address = address;
    }

    public Student() {
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
