package com.fueldelivery.ondemand;

public class Account {

    String fullName, gender, cnic, mobileNum, password, accountType;

    public Account() {
    }

    public Account(String fullName, String gender, String cnic, String mobileNum, String password, String accountType) {
        this.fullName = fullName;
        this.gender = gender;
        this.cnic = cnic;
        this.mobileNum = mobileNum;
        this.password = password;
        this.accountType = accountType;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getCnic() {
        return cnic;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountType() {
        return accountType;
    }
}
