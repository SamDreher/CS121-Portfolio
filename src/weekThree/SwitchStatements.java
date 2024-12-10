package weekThree;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a planet (Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune): ");
        String planet = scan.nextLine();

        System.out.println("This is the distance from the sun: ");

        switch(planet){
            case "Mercury":
                System.out.println("57,900,000 km");
                break;
            case "Venus":
                System.out.println("108,200,000 km");
                break;
            case "Earth":
                System.out.println("149,600,000 km");
                break;
            case "Mars":
                System.out.println("227,900,000 km");
                break;
            case "Jupiter":
                System.out.println("778,600,000 km");
                break;
            case "Saturn":
                System.out.println("1,433,550,000 km");
                break;
            case "Uranus":
                System.out.println("2,872,500,000 km");
                break;
            case "Neptune":
                System.out.println("4,495,100,000 km");
                break;
            default:
                System.out.println("Invalid planet name");
                break;
        }
    }
}
