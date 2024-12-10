package weekTwo.labTwo;

import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {

        double A;
        int l,w;

        System.out.println("Enter in the length: ");
        Scanner scn = new Scanner(System.in);
        l = Integer.parseInt(scn.nextLine());
        System.out.println("Enter in the width: ");
        w = Integer.parseInt(scn.nextLine());
        A = l*w;

        System.out.printf("Your area is %.0f",A);
    }
}
