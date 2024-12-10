package weekTwo.labTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DialogBoxTriangleArea {
    public static void main(String[] args) {

        double A;
        int b, h;

        System.out.println("Enter in the length: ");
        Scanner scn = new Scanner(System.in);
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter in the base: "));
        h = Integer.parseInt(JOptionPane.showInputDialog("Enter in the height: "));
        A = 0.5*(b*h);

        JOptionPane.showMessageDialog(null, String.format("Your area is %.0f", A));
    }
}
