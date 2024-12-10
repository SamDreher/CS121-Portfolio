package weekFive;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] name = new String[4];
        int [] age = new int[4];
        String [] grade = new String[4];

        for (int i = 0; i < 4; i++){
            System.out.println("Enter in your name: ");
            name[i] = scanner.nextLine();
            System.out.println("Enter in your age: ");
            age[i] = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter in your grade (Freshman, Sophomore, Junior, Senior)");
            grade[i] = scanner.nextLine();
        }
        System.out.printf("%-15s    %-10s    %s\n", "Name: ", "Age: ", "Grade: ");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%-15s | %-10d | %s\n", name[i], age[i], grade[i]);
        }
    }
}