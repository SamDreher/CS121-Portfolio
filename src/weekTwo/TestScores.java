package weekTwo;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int test1,test2,test3;
        double average;
        char grade;

        System.out.println("Enter your first test score: ");
        test1 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your second test score: ");
        test2 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your third test score: ");
        test3 = Integer.parseInt(scn.nextLine());

        average = (test1+test2+test3)/3;

        if(average >= 90){
            grade = 'A';
        }
        else if(average >= 80){
            grade = 'B';
        }
        else if(average >= 70){
            grade = 'C';
        }
        else if(average >= 60){
            grade = 'D';
        }
        else if(average < 60){
            grade = 'F';
        }
        else{
            grade = 'L';
        }

        System.out.printf("Your average is %.1f",average);
        System.out.printf("Your grade is %c",grade);
    }
}
