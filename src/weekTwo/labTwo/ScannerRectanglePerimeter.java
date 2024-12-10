package weekTwo.labTwo;

import java.util.Scanner;

public class ScannerRectanglePerimeter {
    public static void main(String[] args) {

        double P;
        int l,w;

        System.out.println("Enter in the length: ");
        Scanner scn = new Scanner(System.in);
        l = Integer.parseInt(scn.nextLine());
        System.out.println("Enter in the width: ");
        w = Integer.parseInt(scn.nextLine());
        P = 2*(l+w);

        System.out.printf("Your perimeter is %.0f",P);
    }
}
