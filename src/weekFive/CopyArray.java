package weekFive;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter in the number of array elements: ");

        final int NUM_ELEMENTS = Integer.parseInt(scn.nextLine());
        int [] array1 = new int[NUM_ELEMENTS];
        int [] array2 = new int[NUM_ELEMENTS];
        int [] array3 = new int[NUM_ELEMENTS];
        int [] array4 = new int[NUM_ELEMENTS];
        System.out.println(NUM_ELEMENTS);

        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("Enter in an integer 5 times ");
            array1[i] = Integer.parseInt(scn.nextLine());
            // array1 index [ 0 ] [ 1 ] [ 2 ] [ 3 ] [ 4 ]
            // array1:        1     2     3     4     5
            // array2:        1     2     3     4     5
            // array3:        1     4     9    16    25
            // array4:        5     4     3     2     1
            array2[i] = array1[i];
            array3[i] = array1[i] ^ 2;
        }
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("The contents in array1: " + array1[i] + " ");
        }
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("The contents in array2: " + array2[i] + " ");
        }
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("The contents in array3: " + array3[i] + " ");
        }
        System.out.println();
    }
}
