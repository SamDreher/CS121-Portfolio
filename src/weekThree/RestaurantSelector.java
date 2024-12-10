package weekThree;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        // Scanner instance
        // alt + return to import on Macs
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String vegetarian, vegan, glutenF;

        // Prompt the user
        // Receive the user's input
        System.out.println("Is there anyone in your party that is vegetarian ");
        vegetarian = scanner.nextLine();
        System.out.println("Is there anyone in your party that is vegan ");
        vegan = scanner.nextLine();
        System.out.println("Is there anyone in your party that is glutenF ");
        glutenF = scanner.nextLine();

        // Output
        System.out.println("Here are your restaurant choices: \n");

        String joe = "Joe's Gourmet Burgers";
        String main = "Main Street Pizza Company";
        String corner = "Corner Café";
        String mama = "Mama's Fine Italian";
        String chef = "The Chef's Kitchen";

        if(vegetarian.equals("No") && vegan.equals("No") && glutenF.equals("No")) {
            System.out.printf("\t%s",joe);
        }
        if(vegan.equals("No")) {
            System.out.printf("\t%s",main);
        }
        if(vegan.equals("No") && glutenF.equals("No")) {
            System.out.printf("\t%s",mama);
        }
        System.out.printf("\t%s%n\t%s",corner,chef);
    }
}
