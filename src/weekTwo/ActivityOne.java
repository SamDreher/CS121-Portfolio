package weekTwo;

import java.util.Scanner;

// Scanner
public class ActivityOne {
    // Shortcut main + tab
    public static void main(String[] args) {
        // P - principal amount
        // r - annual interest rate
        // n - number of times per year that the interest is compounded
        // t - specified number of years
        // A - the amount of money in the account after the specified number of years

        //Declare
        double P,r,A;
        int n,t;

        // prompt user
        // sout + tab
        System.out.println("Enter in the principal amount: ");

        // Make Scanner object
        // Declare an object of class
        // Create an instance of the scanner class
        Scanner scn = new Scanner(System.in);
        // scn.nextDouble(); or Double.parseDouble(scn.nextLine());
        // scn.NextInt(); or Integer.parseInt(scn.nextLine());
        P = Double.parseDouble(scn.nextLine()); // 2000
        System.out.println("Enter in the annual interest rate: ");
        r = Double.parseDouble(scn.nextLine())/100; // 8
        System.out.println("Enter in the number of times compounded: ");
        n = Integer.parseInt(scn.nextLine()); // 12
        System.out.println("Enter in the years: ");
        t = Integer.parseInt(scn.nextLine()); // 5
        // A = P(1 + r/n)^nt
        A = P * Math.pow((1 + r/n), n*t);
        // %s - string
        // %f - floats ->  %.2f
        // %d - integers
        // %c - characters
        System.out.printf("After %d years you will have $%.2f",t,A);
    }
}
