package com.java111.day12.Question2;

public class Citizen {

    private String name;
    private String aadharNumber;
    private String mobileNumber;

    public Citizen(String name, String num, String aadhar) {
        this.setName(name);
        this.setAadharNumber(aadhar);
        this.setMobileNumber(num);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


}
