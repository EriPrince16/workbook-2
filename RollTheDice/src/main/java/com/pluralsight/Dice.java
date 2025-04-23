package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = Dice.roll(1, 6);
            roll2= Dice.roll(1, 6);
            System.out.println("Roll " + i + (": ") + roll1 + " - " + roll2 + " Sum = " + (roll1 + roll2));

            if (roll1 + roll2 == 2) {
                twoCounter++;

            }
            if (roll1 + roll2 == 4) {
                fourCounter++;
            }
            if (roll1 + roll2 == 6) {
                sixCounter++;
            }
            if (roll1 + roll2 == 7) {
                sevenCounter++;
            }


        }
        System.out.println("Two Counter: "+ twoCounter + " " + "Four Counter: "+ fourCounter + " " + "SixCounter: "+ sixCounter + " " + "Seven Counter: "+ sevenCounter);




    }

    private static int roll(int min, int max) {
        int randomNumber = (int)(Math.random() * max) + min;
        return randomNumber;

        while (min == max) {
            break;
        }
    }
}
