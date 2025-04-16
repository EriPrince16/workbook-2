package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the game score (like Home:Visitor|21:9):");
        String input = scanner.nextLine();


        String[] parts = input.split("\\|");
        String teams = parts[0]; // "Home:Visitor"
        String scores = parts[1]; // "21:9"


        String[] teamNames = teams.split(":");
        String homeTeam = teamNames[0]; // "Home"
        String visitorTeam = teamNames[1]; // "Visitor"

        String[] teamScores = scores.split(":");
        int homeScore = Integer.parseInt(teamScores[0]); // 21
        int visitorScore = Integer.parseInt(teamScores[1]); // 9


        if (homeScore > visitorScore) {
            System.out.println(homeTeam + " wins!");
        } else if (visitorScore > homeScore) {
            System.out.println(visitorTeam + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
