package com.aliyu010.uchat;

public class person {



    String fName;
    String lName;
    String mName;
    String EMail;
    String ID;
    String phoneNo;
    String password;
    String gender;

    public person(String fName, String lName, String name, String EMail, String ID, String phoneNo, String password, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.mName = name;
        this.EMail = EMail;
        this.ID = ID;
        this.phoneNo = phoneNo;
        this.password = password;
        this.gender = gender;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        mName = name;
    }

}
