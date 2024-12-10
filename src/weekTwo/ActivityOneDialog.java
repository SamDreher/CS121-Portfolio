package weekTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

// Scanner
public class ActivityOneDialog {
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
        P = Double.parseDouble(JOptionPane.showInputDialog("Enter in the principal amount: "));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times compounded: "));
        t = Integer.parseInt(JOptionPane.showInputDialog("Enter in the years: "));

        // A = P(1 + r/n)^nt
        A = P * Math.pow((1 + r/n), n*t);
        // %s - string
        // %f - floats ->  %.2f
        // %d - integers
        // %c - characters
        JOptionPane.showMessageDialog(null,String.format("The balance" + "Of the account after %d years you will have $%.2f",t,A));
    }
}