package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your serial number: ");
        long userSerialNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your phone model: ");
        String userPhoneModel = scanner.nextLine();

        System.out.print("Enter your phone carrier: ");
        String userPhoneCarrier = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String userPhoneNumber = scanner.nextLine();

        System.out.print("Enter your phone owner: ");
        String userPhoneOwner = scanner.nextLine();

        // Create the first phone object (user's phone)
        CellPhone myCellPhone = new CellPhone();
        myCellPhone.setPhoneModel(userPhoneModel);
        myCellPhone.setSerialNumber(userSerialNumber);
        myCellPhone.setPhoneCarrier(userPhoneCarrier);
        myCellPhone.setPhoneNumber(userPhoneNumber);
        myCellPhone.setPhoneOwner(userPhoneOwner);

        // Create a second phone object (Bob's phone)
        CellPhone phone2 = new CellPhone();
        phone2.setPhoneOwner("Bob");
        phone2.setPhoneNumber("987-654-3210");

        // Create a third phone using the overloaded constructor
        CellPhone phone3 = new CellPhone(
                1122334455L,
                "Pixel 7 Pro",
                "T-Mobile",
                "555-123-4567",
                "Alice"
        );

        // Display info for all phones
        display(myCellPhone);
        display(phone2);
        display(phone3);

        // Calling dial method
        System.out.print("\nEnter the phone number to dial: ");
        String numberToDial = scanner.nextLine();
        myCellPhone.dial(numberToDial);

        // Bob calls Alice
        System.out.println();
        phone2.dial(phone3.getPhoneNumber());

        scanner.close();
    }

    // Static method to display phone information
    public static void display(CellPhone phone) {
        System.out.println("\n--- Cell Phone Info ---");
        System.out.println("Phone Owner: " + phone.getPhoneOwner());
        System.out.println("Phone Model: " + phone.getPhoneModel());
        System.out.println("Phone Carrier: " + phone.getPhoneCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Serial Number: " + phone.getSerialNumber());
    }
}
