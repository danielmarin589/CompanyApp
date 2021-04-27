package com.example.newsapp;

public class Employee {

    private int mImageResource;
    private String eName;
    private String eJob;

    public Employee(int imageResource, String text1, String text2) {
        mImageResource = imageResource;
        eName = text1;
        eJob = text2;
    }
    public void changeText1(String text) {
        eName = text;
    }
    public int getImageResource() {
        return mImageResource;
    }
    public String getText1() {
        return eName;
    }
    public String getText2() {
        return eJob;
    }
}