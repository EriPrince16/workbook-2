package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            total += data[i];
        }

        System.out.println(total);
    }
}
