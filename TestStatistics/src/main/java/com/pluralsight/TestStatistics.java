package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {88, 92, 79, 85, 90, 95, 72, 84, 91, 87};

        int sum = 0;
        int high = testScores[0];
        int low = testScores[0];

        for (int score : testScores) {
            sum += score;

            if (score > high) {
                high = score;
            }

            if (score < low) {
                low = score;
            }
        }

        double average = (double) sum / testScores.length;

        System.out.println("Test Scores Statistics:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + high);
        System.out.println("Lowest Score: " + low);
    }
}