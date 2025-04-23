package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Introduce your variables
        Scanner scanner = new Scanner(System.in);

        // Introducing the app /////////////////////////////////////////////////////////////////////////////////////////
        boolean keepGoing = true;
        while (keepGoing) {

            boolean nameConfirmed = false;
            String fullName = "";
            while (!nameConfirmed) {
                System.out.print("\nPlease enter your name: ");
                fullName = scanner.nextLine();

                System.out.println("\nYou entered [ " + fullName + "]");
                System.out.println("Is this correct?");
                char userNameConfirmed = scanner.nextLine().trim().toUpperCase().charAt(0);

                if (userNameConfirmed == 'Y') {
                    System.out.println("\nThank you for confirming!");
                    nameConfirmed = true;
                } else if (userNameConfirmed == 'N') {
                    continue;
                } else {
                    System.out.println("\nInvalid input! (Y or N)");
                }

            } // Name confirmed

            boolean dateConfirmed = false;
            String showDate = "";
            while (!dateConfirmed) {
                System.out.println("\nWhat date will you be coming (MM/dd/yyyy): ");
                showDate = scanner.nextLine();

                System.out.println("\nYou entered [ " + showDate + "]");
                System.out.println("Is this date correct? ");
                char userDateConfirmed = scanner.nextLine().trim().toUpperCase().charAt(0);

                if (userDateConfirmed == 'Y') {
                    System.out.println("\nThank you for confirming your date!");
                    dateConfirmed = true;
                } else if (userDateConfirmed == 'N') {
                    continue;
                } else {
                    System.out.println("\nInvalid input (Y or N)");
                }
            } // Date confirmed

            boolean ticketsConfirmed = false;
            int tickets = 0;
            while (!ticketsConfirmed) {
                System.out.println("\nHow many tickets would you like? ");
                try {
                    tickets = Integer.parseInt(scanner.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("\nNumbers only!");
                } catch (InputMismatchException e) {
                    System.out.println("\nNumber out of range!");
                }
                System.out.println("\nYou entered [ " + tickets + "]");
                System.out.println("Is this correct?");
                char userTicketsConfirmed = scanner.nextLine().trim().toUpperCase().charAt(0);

                if (userTicketsConfirmed == 'Y') {
                    System.out.println("\nThank you for confirming your tickets!");
                    ticketsConfirmed = true;

                } else if (userTicketsConfirmed == 'N') {
                    continue;
                } else {
                    System.out.println("\nInvalid input (Y or N)");
                }
            }


            String[] nameParts = fullName.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[1];


            boolean confirmAll = false;
            while (!confirmAll) {

                System.out.println();
                System.out.println(tickets + " " + "tickets" + " " + "reserved for " + showDate + " " + "under " + lastName + "," + " " + firstName);

                System.out.println("\nIs all of this info correct?");
                char userConfirmAll = scanner.nextLine().trim().toUpperCase().charAt(0);

                if (userConfirmAll == 'Y') {
                    System.out.println("\nThank you for confirming!");
                    System.out.println("\nYour date is set!");
                    confirmAll = true;
                    keepGoing = false;
                } else if (userConfirmAll == 'N') {
                    continue;

                } else {
                    System.out.println("\nInvalid input! (Y or N)");
                }
            }
        }




    }
}
