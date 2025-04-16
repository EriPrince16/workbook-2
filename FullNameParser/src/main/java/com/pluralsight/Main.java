package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        String[] parts = name.split(" ");

        if (parts.length == 2) {
            System.out.println("First name: " + parts[0]);
            System.out.println("Last name: " + parts[1]);
        } else if (parts.length == 3) {
            System.out.println("First name: " + parts[0]);
            System.out.println("Middle name: " + parts[1]);
            System.out.println("Last name: " + parts[2]);
        } else {
            System.out.println("Please enter 2 or 3 names only.");
        }

        scanner.close();
    }
}
