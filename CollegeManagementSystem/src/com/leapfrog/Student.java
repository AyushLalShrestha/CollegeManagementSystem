package com.leapfrog;

public class Student {

    private int id;
    private String firstName, lastName, address, contactNo;
    private boolean status;

    public Student(int id, String firstName, String lastName, String address, String contactNo, boolean status) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNo = contactNo;
        this.status = status;
    }

    public static void main(String[] args) {

    }

    public String getFullInfo() {
        return (this.firstName + " " + this.lastName + " lives at " + this.address + " with contact number " + this.contactNo + ", ID = " + this.id);
    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
