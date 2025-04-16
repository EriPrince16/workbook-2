package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your serial number: ");
        long userSerialNumber = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter your phone model: ");
        String userPhoneModel = scanner.nextLine();

        System.out.print("Enter your phone carrier: ");
        String userPhoneCarrier = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String userPhoneNumber = scanner.nextLine();

        System.out.print("Enter your phone owner: ");
        String userPhoneOwner = scanner.nextLine();



        CellPhone myCellPhone = new CellPhone();
        myCellPhone.setPhoneModel(userPhoneModel);
        myCellPhone.setSerialNumber(userSerialNumber);
        myCellPhone.setPhoneCarrier(userPhoneCarrier);
        myCellPhone.setPhoneNumber(userPhoneNumber);
        myCellPhone.setPhoneOwner(userPhoneOwner);

        System.out.println("\n--- Cell Phone Info ---");
        System.out.println("Your cell phone serial number is " + myCellPhone.getSerialNumber());
        System.out.println("Your cell phone model is " + myCellPhone.getPhoneModel());
        System.out.println("Your cell phone carrier is " + myCellPhone.getPhoneCarrier());
        System.out.println("Your cell phone number is " + myCellPhone.getPhoneNumber());
        System.out.println("Your cell phone owner is " + myCellPhone.getPhoneOwner());




    }
}
