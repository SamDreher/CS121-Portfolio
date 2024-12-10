package weekFive;

import java.util.Scanner;

public class ArraysVideo {
    public static void main(String[] args) {
        // What is an array?

        // An array is a data structure,
        // which stores a fixed-size of sequential/linear
        // elements of the same type.

        // Declare scanner instance
        Scanner scanner = new Scanner(System.in);

        // Declare an array
        int [] numbers = new int[4];
        String [] name = new String[4];
        double [] score = new double[4];
        // Index               0         1          2          3
        String [] fruits = {"Apples", "Bananas", "Grapes", "Oranges"};

        System.out.println(fruits[2]); // Access a specific element in an array

        for(int i = 0; i < 4; i++){
            // Prompt user:
            System.out.println("Enter in your name: ");
            // Input:
            name[i] = scanner.nextLine();
            // Prompt user:
            System.out.println("Enter in your score: ");
            // Input:
            score[i] = Double.parseDouble(scanner.nextLine());
        }
        // Display user information
        System.out.printf("%-15s    %-10s    %s\n", "Name: ", "Score: ", "Favorite Fruit: ");
        for(int i = 0; i < name.length; i++){
            System.out.printf("%-15s | %-10.2f | %s\n", name[i], score[i], fruits[i]);
        }
    }
}
