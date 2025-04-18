package com.pluralsight;

public class Dice {
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i <= 100 ; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;
            System.out.println("Roll " + 1 + ": " + roll1 + " - " + roll2 + "sum: " +sum);

            if (sum == 2) twoCouKnter++;
            if (sum == 4) fourCounter++;
            if (sum == 6) sixCounter++;
            if (sum == 7) sevenCounter++;
        }
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);



    }

}
