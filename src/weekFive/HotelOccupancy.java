package weekFive;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        // Creating an instance of the scanner class
        Scanner keyboard = new Scanner(System.in);
        int floors;                 // # of rooms in the hotel
        int totalRooms = 0;         // Total number of rooms in the hotel
        int totalOccupiedRooms = 0; // Total number of occupied rooms
        int totalVacantRooms;       // Total number of vacant rooms
        double occupancyRate;       // Occupancy rate as a decimal

        // Prompt the user for how many floors in the hotel
        System.out.println("How many floors does the hotel have? ");
        floors = Integer.parseInt(keyboard.nextLine());

        // Use for loop to iterate through the hotel
        for(int i = 1; i <= floors; i++){
            // Prompt the user to enter rooms on the current floor
            System.out.printf("Enter the number of rooms on floor %d%n", i);
            int rooms = Integer.parseInt(keyboard.nextLine());

            // Prompt the user to enter the occupied rooms
            System.out.printf("How many rooms are occupied? %n");
            int occupiedRooms = Integer.parseInt(keyboard.nextLine());

            // Update the totals
            // totalRooms += rooms;
            // totalRooms = totalRooms + rooms;
            totalRooms = totalRooms + rooms;
            totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;
        }
        // Calculate the total vacant rooms
        totalVacantRooms = totalRooms + totalOccupiedRooms;

        // Calculate the occupancy rate --> as a decimal
        occupancyRate = (double)totalOccupiedRooms/totalRooms;

        // Display the hotel occupancy information
        System.out.printf("Floors: %d%n Rooms: %d%n Occupied Rooms: %d%n Vacant Rooms: %d%n Occupancy Rate: %.2f", floors, totalRooms, totalOccupiedRooms, totalVacantRooms, occupancyRate, (int)(occupancyRate * 100));
    }
}
