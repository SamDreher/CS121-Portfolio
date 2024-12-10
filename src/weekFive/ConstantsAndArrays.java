package weekFive;

import java.util.Scanner;

public class ConstantsAndArrays {
    public static void main(String[] args) {
        // What are constants
        // A constants in Java, also called a final variable,
        // is a variable whose value is set once and cannot be changed later in the program

        // Declaring constants?
        // Keyword: final
        // final int NUM_ELEMENTS = 5
        final int MAX_SCORE = 100;

        // Declare a scanner object
        // An instance of the scanner class

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter in the number of array elements: ");

        final int NUM_ELEMENTS = Integer.parseInt(scn.nextLine());
        int [] array1 = new int[NUM_ELEMENTS];
        int [] array2 = new int[NUM_ELEMENTS];
        String [] array3 = new String[NUM_ELEMENTS];
        System.out.println(NUM_ELEMENTS);
        // NUM_ELEMENTS = 5; // <-- Won't allow you to reassign final variable

        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("Enter in an integer 5 times to multiply by 3");
            array1[i] = Integer.parseInt(scn.nextLine());
            // array1 index [ 0 ] [ 1 ] [ 2 ] [ 3 ] [ 4 ]
            // array1:        7     8     9    10    11
            // array2:       21    24    27    30    33
            array2[i] = array1[i] * 3;
        }
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("The contents in array1: " + array1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("The contents in array2: " + array2[i] + " ");
        }
        System.out.println();
    }
}