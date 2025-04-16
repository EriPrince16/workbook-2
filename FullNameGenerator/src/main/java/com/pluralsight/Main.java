package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name (press Enter to skip): ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your suffix (press Enter to skip): ");
        String suffix = scanner.nextLine();

        String fullName = firstName + " "
                + (middleName.isEmpty() ? "" : middleName + " ")
                + lastName
                + (suffix.isEmpty() ? "" : ", " + suffix);

        System.out.println("Your full name is: " + fullName);


    }

}
