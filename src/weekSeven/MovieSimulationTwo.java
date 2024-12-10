package weekSeven;

import java.util.Scanner;
import java.util.Random;

public class MovieSimulationTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] movieNames = {"Jumanji", "The Matrix", "Star Wars", "Oppenheimer"};
        String [] movieTypes = {"2D", "3D", "2D", "Drama/Historical"};
        double [] moviePrice = {15.25, 20.15, 18.11, 14.14};

        final int ROWS = 5;
        final int COLUMNS = 10;

        int [][] movieAvailability = new int [ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrice);
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    static void randomizeAvailability(int [][] movieAvailability) {
        System.out.println("\n--------------------- RANDOMIZED SEATS ---------------------\n");
        Random rand = new Random();
        for(int i = 0; i < movieAvailability.length; i++) {
            for(int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability [i][j] = rand.nextInt(2);
            }
        }
    }

    static void displaySeatAvailability(int [][] movieAvailability) {
        System.out.println("\nSeating Availability: [ 1 = Unavailable ; 0 = Available ]\n");
        for(int i = 0; i < movieAvailability.length; i++) {
            for(int j = 0; j < movieAvailability[i].length; j++) {
                System.out.print(movieAvailability [i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setSeatAvailability(int [][] movieAvailability) {
        System.out.println("\n--------------------- INITIAL SEATS ---------------------\n");
        for(int i = 0; i < movieAvailability.length; i++) {
            for(int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability [i][j] = 0;
            }
        }
    }
    static void displayMovieDetails(String [] mNames, String [] mTypes, double [] mPrice) {
        String header = String.format("\n--------------------- Movie Details ---------------------\n" +
                "%-20s %-20s %-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.println(header);
        for(int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s %-16.2f\n", (i + 1), mNames [i], mTypes [i], mPrice [i]);
        }
    }
}
