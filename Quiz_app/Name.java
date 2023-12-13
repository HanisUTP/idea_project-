package com.example.demo;

import java.util.SplittableRandom;

public class Name {
    private String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    private String lname;

    public void addname() {


    }
}

