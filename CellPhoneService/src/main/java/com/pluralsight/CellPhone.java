package com.pluralsight;

public class CellPhone {

    long serialNumber;
    String phoneModel;
    String phoneCarrier;
    String phoneNumber;
    String phoneOwner;

    public CellPhone() {
        serialNumber = 0;
        phoneModel = "";
        phoneCarrier = "";
        phoneNumber = "";
        phoneOwner = "";
    }

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

    // Dial method to simulate calling a phone number
    public void dial(String phoneNumber) {
        System.out.println(phoneOwner + "'s phone is calling " + phoneNumber);
    }
}
