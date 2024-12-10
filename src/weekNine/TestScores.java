package weekNine;

import java.util.Random;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt((10 - 3) + 1) + 3;
        final int SIZE = randomNum;

        int[] testScores = new int[SIZE];
        char[] letterGrade = new char[SIZE];
        int score;

        System.out.printf("Enter your %d test scores:\n", testScores.length);

        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("Enter test %d score: ", i + 1);
            score = Integer.parseInt(scanner.nextLine());
            testScores[i] = score;
        }
        for (int i = 0; i < testScores.length; i++) {
            letterGrade[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrade);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        scanner.close();

    }

    public static void printHighestScore(int testScores[]) {
        int highest = testScores[0];
        for (int i = 1; i < testScores.length; i++) {
            if (testScores[i] > highest) {
                highest = testScores[i];
            }
        }
        System.out.printf("\nThe highest score is %d\n", highest);
    }

    public static void printLowestScore(int testScores[]) {
        int lowest = testScores[0];
        for (int i = 1; i < testScores.length; i++) {
            if (testScores[i] < lowest) {
                lowest = testScores[i];
            }
        }
        System.out.printf("The lowest score is %d\n", lowest);
    }

    public static void printAverageScore(int testScores[]) {
        int total = 0;
        double average;
        for (int score : testScores) {
            total += score;
        }
        average = (double) total / testScores.length;
        System.out.printf("Average score is %.1f\n", average);
    }

    public static char getLetterGrade(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        return grade;
    }

    public static void printGrades(int testScores[], char letterGrade[]) {
        System.out.printf("\n%-10s%s\n", "Score", "Grade");
        for (int i = 0; i < letterGrade.length; i++) {
            System.out.printf("%4d%9c\n", testScores[i], letterGrade[i]);
        }
    }

}
