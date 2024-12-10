package weekEleven;

import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerInfo customerinfo = new CustomerInfo();

        while(true) {
            System.out.println("Enter Course or Q to quit: ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("You wanted to quit!~EXIT~");
                break;
            } else {
                customerinfo.addName(input);
                System.out.println("Enter GPA: ");
                customerinfo.addGPA(Double.parseDouble(scanner.nextLine()));
                System.out.println("Enter Score: ");
                customerinfo.addScores(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter Letter Grade: ");
                customerinfo.addLetterGrade(scanner.next().charAt(0));
                scanner.nextLine();
            }
        }
        customerinfo.displayCourses();
    }
}
