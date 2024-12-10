package weekTwo.labTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DialogBoxRectangleArea {
    public static void main(String[] args) {

        double A;
        int l, w;

        System.out.println("Enter in the length: ");
        Scanner scn = new Scanner(System.in);
        l = Integer.parseInt(JOptionPane.showInputDialog("Enter in the length: "));
        w = Integer.parseInt(JOptionPane.showInputDialog("Enter in the width: "));
        A = l * w;

        JOptionPane.showMessageDialog(null, String.format("Your area is %.0f", A));
    }
}
