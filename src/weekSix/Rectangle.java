package weekSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }
    public static void displayData(double l, double w, double a) {
        System.out.printf(" Rectangle length: %.1f%n Rectangle width: %.1f%n Rectangle area: %.1f%n", l, w, a);
    }
    public static double getArea(double l, double w) {
        double area = l * w;
        return area;
    }
    public static double getLength() {
        System.out.println("Enter the length: ");
        double length = Double.parseDouble(scanner.nextLine());
        return length;
    }
    public static double getWidth() {
        System.out.println("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
    }
}