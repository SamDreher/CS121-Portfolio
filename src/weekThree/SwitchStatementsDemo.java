package weekThree;

import java.util.Scanner;

public class SwitchStatementsDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter grade (A, B, C, D, F): ");
        char letterGrade = scan.nextLine().charAt(0);

        switch(letterGrade){
            case 'A':
                System.out.println("4.0 GPA");
                break;
            case 'B':
                System.out.println("3.0 GPA");
                break;
            case 'C':
                System.out.println("2.0 GPA");
                break;
            case 'D':
                System.out.println("1.0 GPA");
                break;
            case 'F':
                System.out.println("0.0 GPA");
                break;
            default:
                System.out.println("Invalid letter grade");
                break;
        }
    }
}
