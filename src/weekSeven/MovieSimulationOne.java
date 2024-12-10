package weekSeven;

import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] movieNames;
        String [] movieTypes;
        int [] movieAvailability;
        double [] moviePrice;

        System.out.println("Enter in how many movie details you would like to enter: ");

        final int NUM_OF_MOVIES = Integer.parseInt(scanner.nextLine());

        movieNames = new String [NUM_OF_MOVIES];
        movieTypes = new String [NUM_OF_MOVIES];
        movieAvailability = new int [NUM_OF_MOVIES];
        moviePrice = new double [NUM_OF_MOVIES];

        for(int i = 0; i < NUM_OF_MOVIES; i++) {
            System.out.println("Enter details for movie " + (i + 1) + " : ");
            System.out.println("Movie Name: ");
            movieNames[i] = scanner.nextLine();
            System.out.println("Movie Type (2D/3D): ");
            movieTypes[i] = scanner.nextLine();
            System.out.println("Enter in seat availability: ");
            movieAvailability[i] = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter in the movie's ticket cost: ");
            moviePrice[i] = Double.parseDouble(scanner.nextLine());
        }
        displayMovieDetails(movieNames, movieTypes, movieAvailability, moviePrice);
    }
    static void displayMovieDetails(String [] mNames, String [] mTypes, int [] mAvail, double [] mPrice) {
        String header = String.format("\n --------------------- Movie Details ---------------------\n" +
                "%-20s %-20s %-20s %-20s\n", "Movie Name", "Movie Type", "Available Seats", "Movie Price");
        System.out.println(header);
        for(int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s %-16d %-16.2f\n", (i + 1), mNames [i], mTypes [i], mAvail [i], mPrice [i]);
        }
    }
}
