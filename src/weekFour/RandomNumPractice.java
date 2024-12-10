package weekFour;

import java.util.Random;

public class RandomNumPractice {
    public static void main(String[] args) {
        // Double value between 0.0 and 1.0
        // Syntax --> Math.random()
        double value = Math.random();
        System.out.println("\n Using Math.random() \n double value = Math.random() return --> " + value);

        // Range 1 to 20
        // Syntax --> 0.0 to 20.95
        double valueTwo = Math.random() * 20 + 1;
        System.out.printf("\n Using Math.random() * 20 + 1 \n valueTwo = %.6f ", valueTwo);

        // Casting (int)
        // Syntax --> int randomInt = (int)(Math.random() * (max - min) + min);
        int randomInt = (int)(Math.random() * (40 - 2) + 2);
        System.out.println("\n\n Using (int) Math.random() * (40 - 2) + 2 \n randomInt = " + randomInt);

        // Syntax of creating an object or an instance of the Random class
        Random random = new Random();
        // double number = random.nextDouble(20);
        // Range {0 to 19}
        double number = random.nextDouble(20);
        System.out.println("\n Using double number = random.nextDouble(20) --> \n number = " + number);

        int randomNum = random.nextInt(40);
        System.out.println("\n Using int randomNum = random.nextInt(40) --> \n randomNum = " + randomNum);

        // int randomNum2 = random.nextInt((max - min) + 1) + min;
        int randomNum2 = random.nextInt((40 - 2) + 1) + 2;
        System.out.println("\n Using int randomNum2 = random.nextInt((40 - 2) + 1) + 2 --> \n randomNum2 = " + randomNum2);
    }
}
