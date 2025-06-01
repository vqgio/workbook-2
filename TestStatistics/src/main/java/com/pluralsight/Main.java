package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] testScores = {78, 99, 56, 68, 86,
                85, 100, 76, 39, 88};
        double average = findAverage(testScores);
        int highScore = findMax(testScores);
        int lowScore = findMin(testScores);

        System.out.println("Average test score: " + average);
        System.out.println("Highest score is: " + highScore);
        System.out.println("Lowest score is: " + lowScore);

    }
    public static double findAverage(int[] testScores) {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return (double) sum / testScores.length;
    }
    public static int findMax(int[] testScores) {
        int max = testScores[0];
        for (int score : testScores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
    public static int findMin(int[] testScores) {
        int min = testScores[0];
        for (int score : testScores) {
            if (score < min) {
                score = min;
            }
        }
        return min;
    }



}
