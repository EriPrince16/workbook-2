package com.pluralsight;

public class CellPhone {

    // Fields should be private for proper encapsulation
    private long serialNumber;
    private String phoneModel;
    private String phoneCarrier;
    private String phoneNumber;
    private String phoneOwner;

    // Default constructor
    public CellPhone() {
        serialNumber = 0;
        phoneModel = "";
        phoneCarrier = "";
        phoneNumber = "";
        phoneOwner = "";
    }

    // Overloaded constructor
    public CellPhone(long serialNumber, String phoneModel, String phoneCarrier,
                     String phoneNumber, String phoneOwner) {
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.phoneCarrier = phoneCarrier;
        this.phoneNumber = phoneNumber;
        this.phoneOwner = phoneOwner;
    }

    // Setters
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void setPhoneCarrier(String phoneCarrier) {
        this.phoneCarrier = phoneCarrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneOwner(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }

    // Getters
    public long getSerialNumber() {
        return serialNumber;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneOwner() {
        return phoneOwner;
    }

    // Method to simulate dialing a number
    public void dial(String phoneNumber) {
        System.out.println(phoneOwner + "'s phone is calling " + phoneNumber);
    }
}
